/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.product.ProductDAO;
import halt.product.ProductDTO;
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
public class SearchByPriceController extends HttpServlet {

    private final String ERROR_PAGE = "errorpage.jsp";
    private final String FAIL = "Can not load product";

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
        int fromPrice = Integer.parseInt(request.getParameter("priceFrom"));
        int toPrice = Integer.parseInt(request.getParameter("priceTo"));
        String purpose = request.getParameter("purpose");
        String page = request.getParameter("pageNumber");
        int noPage;
        if (page != null) {
            noPage = Integer.parseInt(page);
        } else {
            noPage = 1;
        }
        String url = ERROR_PAGE;
        try {
            ProductDAO dao = new ProductDAO();
            String status = "active";
                if (purpose.equals("manage")) {
                    status = "";
                }
            ArrayList<ProductDTO> result = dao.searchProductByPrice(fromPrice, toPrice, noPage,status);
            ArrayList<ProductDTO> fullResult = dao.searchProductByPrice(fromPrice, toPrice,status);
            if (result != null) {
                HttpSession session = request.getSession();
                session.setAttribute("PRODUCTLIST", result);

                int page_number = dao.findPageNumber(fullResult.size());
                session.setAttribute("PAGENUMBER", page_number);

                if (purpose.equals("manage")) {
                    url = "manager.jsp";
                } else {
                    url = "homePage.jsp";
                }
            } else {
                request.setAttribute("ERROR", FAIL);
            }

        } catch (NamingException ex) {
            log("NamingException_SearchByPriceController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_SearchByPriceController: " + ex.getMessage());
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
