/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.product.ProductDAO;
import halt.product.ProductDTO;
import halt.updateRecord.UpdateRecordDAO;
import halt.updateRecord.UpdateRecordDTO;
import halt.user.UserDTO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Luong Thanh Ha
 */
public class UpdateProductController extends HttpServlet {

    private final String ERROR_PAGE = "errorpage.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String productId = request.getParameter("txtProductID");
        String productName = request.getParameter("txtProductName");
        InputStream inputStream = null;
        List<Part> parts = (List<Part>) request.getParts();
        for (Part part : parts) {
            if (part.getName().equalsIgnoreCase("fileImage")) {
                inputStream = part.getInputStream();
            }
        }
        int category = Integer.parseInt(request.getParameter("cate"));
        Double price = Double.parseDouble(request.getParameter("txtPrice"));
        int quantity = Integer.parseInt(request.getParameter("txtQuantity"));
        String ingredient = request.getParameter("txtIngredient");
        String Description = request.getParameter("txtDescription");
        String status = request.getParameter("txtStatus");

        String url = ERROR_PAGE;

        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("USERINFO");
        Timestamp updateTime = Timestamp.valueOf(LocalDateTime.now());

        try {
            if (productId != null) {
                ProductDAO dao = new ProductDAO();
                ProductDTO product = dao.getProductByID(productId);
                if (product != null) {
                    ProductDTO newProduct = new ProductDTO(productId, productName, category, price, quantity, ingredient, Description, status);
                    boolean updated = dao.updateProduct(newProduct);
                    if (updated) {
                        UpdateRecordDAO recorddao = new UpdateRecordDAO();

                        boolean logAction = recorddao.createUpdateRecord(new UpdateRecordDTO(productId, user.getUsername(), updateTime));
                        if (logAction) {
                            if (inputStream != null && inputStream.available() > 0) {
                                boolean updatedImage = dao.updateProductImage(productId, inputStream);
                                if (updatedImage) {
                                    url = "MainController?btnAction=Setup";

                                } else {
                                    request.setAttribute("ERROR", "Can not update image");
                                }
                            }

                        } else {
                            request.setAttribute("ERROR", "Can not record update action");
                        }

                    } else {
                        request.setAttribute("ERROR", "Can not update product");
                    }
                } else {
                    request.setAttribute("ERROR", "Product not found");
                }
            }
        } catch (NamingException ex) {
            log("NamingException_ UpdateProductController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_ UpdateProductController: " + ex.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
