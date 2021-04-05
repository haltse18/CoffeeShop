/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.cart.CartObject;
import halt.order.OrderDAO;
import halt.order.OrderDTO;
import halt.order.OrderDetails;
import halt.product.ProductDAO;
import halt.product.ProductDTO;
import halt.user.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luong Thanh Ha
 */
public class CheckOutController extends HttpServlet {

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
        String lastname = request.getParameter("txtName");

        String address = request.getParameter("txtAddress");
        HttpSession session = request.getSession(false);
        UserDTO user = (UserDTO) session.getAttribute("USERINFO");
        String status = "";
        if (user == null || !user.isIsAdmin()) {
            status = "active";
        }
        String url = ERROR_PAGE;

        try {
            if (session != null) {
                CartObject cart = (CartObject) session.getAttribute("CART");
                if (cart != null) {
                    if (cart.getItems() != null) {
                        Map<String, Integer> listProduct = cart.getItems();

                        ProductDAO productDAO = new ProductDAO();
                        List<ProductDTO> allProduct = productDAO.searchProductByName("",status);
                        boolean check = false;
                        String err = "";
                        for (ProductDTO p : allProduct) {
                            if (listProduct.containsKey(p.getProductId())) {
                                if (p.getQuantity() < listProduct.get(p.getProductId())) {
                                    check = true;
                                    err = p.getProductName();
                                    break;
                                }
                            }
                        }
                        if (check) {
                            request.setAttribute("CHECKOUTERROR", err + " is out of stock");
                            url = "information.jsp";
                        } else {

                            Timestamp orderTime = Timestamp.valueOf(LocalDateTime.now());

                            OrderDAO orderdao = new OrderDAO();
                            OrderDTO orderdto = new OrderDTO(user.getUsername(), orderTime, lastname, address, cart.getTotalCart());
                            boolean result1 = orderdao.createOrder(orderdto);
                            if (result1) {
                                int orderId = orderdao.getLastOrderId();
                                if (orderId > 0) {
                                    boolean result2 = true;
                                    boolean result3 = true;
                                    for (String key : listProduct.keySet()) {
                                        OrderDetails detail = new OrderDetails(key, orderId, cart.getPrice(key), listProduct.get(key));
                                        result2 = orderdao.insertOrderDetails(detail);
                                        result3 = productDAO.updateProductQuantity(key, listProduct.get(key));
                                        if (!result2 || !result3) {
                                            break;
                                        }
                                    }

                                    if (result2 && result3) {

                                        cart.removeAllItems();
                                        session.setAttribute("CART", cart);
                                        session.setAttribute("CARTCOUNT", 0);
                                        url = "MainController?btnAction=Setup";
                                        request.setAttribute("CHECKOUTRESULT", "Check out successfully");
                                    } else {
                                        request.setAttribute("ERROR", "Fail to record the product");
                                    }
                                }

                            } else {
                                request.setAttribute("ERROR", "Fail to order");
                            }
                        }

                    }

                }

            }
        } catch (NamingException ex) {
            log("NamingException_CheckOutController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_CheckOutController: " + ex.getMessage());
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
