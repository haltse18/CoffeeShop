/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luong Thanh Ha
 */
public class MainController extends HttpServlet {

    private final String LOGIN_CONTROLLER = "LoginController";
    private final String SETUP_CONTROLLER = "SetUpController";
    private final String SEARCH_BY_CATEGORY_CONTROLLER = "SearchByCategoryController";
    private final String UPLOAD_IMG_CONTROLLER = "UploadImgController";
    private final String SEARCH_BY_NAME_CONTROLLER = "SearchByNameController";
    private final String UPDATE_CONTROLLER = "UpdateController";
    private final String CREATE_PRODUCT_PAGE = "GetCategotyController";
    private final String CREATEPRODUCT_CONTROLLER = "createProductController";
    private final String UPDATE_PRODUCT_CONTROLLER = "UpdateProductController";
    private final String SEARCH_BY_PRICE_CONTROLLER = "SearchByPriceController";
    private final String LOGOUT_CONTROLLER = "LogoutController";
    private final String ADD_TO_CART_CONTROLLER = "AddToCartController";
    private final String VIEW_CART_CONTROLLER = "viewcart.jsp";
    private final String LOGIN_FORM = "login.html";
    private final String INCREASE_QUANTITY_CONTROLLER = "IncreaseQuantityController";
    private final String DESCREASE_QUANTITY_CONTROLLER = "DescreaseQuantityController";
    private final String CHECKOUT_CONTROLLER = "CheckOutController";
    private final String DELETEITEMS_CONTROLLER = "DeleteItemController";
    private final String HISTORY_CONTROLLER = "HistoryController";
    private final String SHOWPRODUCT_CONTROLLER = "ShowProductController";
    private final String LOGIN_GOOGLE_CONTROLLER = "LoginGoogleController";

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
//        request.setCharacterEn/ncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String button = request.getParameter("btnAction");
        String url = "";
        try {
            if (button == null) {
                url = SETUP_CONTROLLER;
            } else if (button.equals("Log In")) {
                url = LOGIN_CONTROLLER;
            } else if (button.equals("loginGG")) {
                url = LOGIN_GOOGLE_CONTROLLER;
            } else if (button.equals("Setup")) {
                url = SETUP_CONTROLLER;
            } else if (button.equals("loginForm")) {
                url = LOGIN_FORM;
            } else if (button.equals("SearchByCategory")) {
                url = SEARCH_BY_CATEGORY_CONTROLLER;
            } else if (button.equals("Upload")) {
                url = UPLOAD_IMG_CONTROLLER;
            } else if (button.equals("SearchName")) {
                url = SEARCH_BY_NAME_CONTROLLER;
            } else if (button.equals("Update")) {
                url = UPDATE_CONTROLLER;
            } else if (button.equals("createPage")) {
                url = CREATE_PRODUCT_PAGE;
            } else if (button.equals("confirmCreate")) {
                url = CREATEPRODUCT_CONTROLLER;
            } else if (button.equals("confirmUpdate")) {
                url = UPDATE_PRODUCT_CONTROLLER;
            } else if (button.equals("Search Price")) {
                url = SEARCH_BY_PRICE_CONTROLLER;
            } else if (button.equals("Logout")) {
                url = LOGOUT_CONTROLLER;
            } else if (button.equals("Add to Cart")) {
                url = ADD_TO_CART_CONTROLLER;
            } else if (button.equals("View Cart")) {
                url = VIEW_CART_CONTROLLER;
            } else if (button.equals("+")) {
                url = INCREASE_QUANTITY_CONTROLLER;
            } else if (button.equals("-")) {
                url = DESCREASE_QUANTITY_CONTROLLER;
            } else if (button.equals("CheckOut")) {
                url = CHECKOUT_CONTROLLER;
            } else if (button.equals("Delete")) {
                url = DELETEITEMS_CONTROLLER;
            } else if (button.equals("History") || button.equals("SearchHistoryByDate") || button.equals("Search history by name")) {
                url = HISTORY_CONTROLLER;
            } else if (button.equals("showProduct")) {
                url = SHOWPRODUCT_CONTROLLER;
            }

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
