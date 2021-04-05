/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.product.ProductDAO;
import halt.product.ProductDTO;
import halt.user.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luong Thanh Ha
 */
public class SetUpController extends HttpServlet {

    private final String ERROR_PAGE = "error.html";
    private final String HOME_PAGE = "homePage.jsp";
    private final String MANAGER_PAGE = "manager.jsp";

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
        HttpSession session = request.getSession();
        UserDTO dto = (UserDTO) session.getAttribute("USERINFO");
        String url = ERROR_PAGE;

        try {
            ProductDAO dao = new ProductDAO();
            HashMap<Integer, String> categories = dao.getCategoryList();
            if (categories != null) {
                session.setAttribute("CATEGORIES", categories);
                String status = "";
                if (dto == null || !dto.isIsAdmin()) {
                    status = "active";
                }
                ArrayList<ProductDTO> productList = dao.searchProductByName("", 1,status);
                if (productList != null) {
                    session.setAttribute("PRODUCTLIST", productList);
                    int page_number = dao.findPageNumber(dao.getRowNumberOfProduct());
                    session.setAttribute("PAGENUMBER", page_number);
                    
                    if (dto == null || !dto.isIsAdmin()) {
                        url = HOME_PAGE;
                    } else {
                        url = MANAGER_PAGE;
                    }
                }else{
                    request.setAttribute("ERROR", "Can not load the pages");
                }

            }

        } catch (NamingException ex) {
            log("NamingException_SetUpController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_SetUpController: " + ex.getMessage());
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
