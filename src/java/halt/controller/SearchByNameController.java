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
public class SearchByNameController extends HttpServlet {

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
        String searchValue = request.getParameter("txtSearchValue");
        String url = ERROR_PAGE;
        String page = request.getParameter("pageNumber");
        HttpSession session = request.getSession();
        UserDTO dto = (UserDTO) session.getAttribute("USERINFO");

        int noPage;
        if (page != null) {
            noPage = Integer.parseInt(page);
        } else {
            noPage = 1;
        }
        try {
            if (searchValue != null) {
                
                ProductDAO dao = new ProductDAO();
                String status = "";
                if (dto == null || !dto.isIsAdmin()) {
                    status = "active";
                }
                ArrayList<ProductDTO> result = dao.searchProductByName(searchValue,noPage,status);
                ArrayList<ProductDTO> fullResult = dao.searchProductByName(searchValue, status);

                if (result != null) {

                    session.setAttribute("PRODUCTLIST", result);

                    int page_number = dao.findPageNumber(fullResult.size());
                    session.setAttribute("PAGENUMBER", page_number);

                    if (dto == null || !dto.isIsAdmin()) {
                        url = HOME_PAGE;
                    } else {
                        url = MANAGER_PAGE;
                    }

                } else {
                    request.setAttribute("ERROR", "Can not load the products");
                }
            }
        } catch (NamingException ex) {
            log("NamingException_SearchByCategoryController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_SearchByCategoryController: " + ex.getMessage());
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
