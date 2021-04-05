/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.product.ProductDAO;
import halt.product.ProductDTO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Luong Thanh Ha
 */
public class createProductController extends HttpServlet {

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
        double price = Double.parseDouble(request.getParameter("txtPrice"));
        int quantity = Integer.parseInt(request.getParameter("txtQuantity"));

        InputStream inputStream = null;
        List<Part> parts = (List<Part>) request.getParts();
        for (Part part : parts) {
            if (part.getName().equalsIgnoreCase("fileImage")) {
                inputStream = part.getInputStream();
            }
        }
        long mil = System.currentTimeMillis();
        Date createDate = new Date(mil);

        int category = Integer.parseInt(request.getParameter("cate"));
        String ingredient = request.getParameter("txtIngredient");
        String Description = request.getParameter("txtDescription");

        String url = ERROR_PAGE;

        try {
            ProductDAO dao = new ProductDAO();

            ProductDTO dto = new ProductDTO(productId, productName, category, "", price, quantity, createDate, ingredient, Description, "active");

            boolean result = dao.createProduct(dto);
            if (result) {
                boolean check = dao.insertProductImage(productId, inputStream);
                if (check) {
                    url = "MainController?btnAction=Setup";
                } else {
                    request.setAttribute("ERROR", "Can not upload image new product");
                }

            } else {
                request.setAttribute("ERROR", "Can not create new product");
            }
        } catch (NamingException ex) {
            log("NamingException_createProductController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_createProductController: " + ex.getMessage());
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
