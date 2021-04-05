/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.order.HistoryDTO;
import halt.order.OrderDAO;
import halt.user.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
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
public class HistoryController extends HttpServlet {

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
        String searchvalue = request.getParameter("txtSearchHistory");
        String date = request.getParameter("txtOrderDate");
        String url = ERROR_PAGE;
        try {
            HttpSession session = request.getSession();
            UserDTO user = (UserDTO) session.getAttribute("USERINFO");

            OrderDAO dao = new OrderDAO();
            Map<Integer, List<HistoryDTO>> historyMap = dao.getHistoryByUserId(user.getUsername());
            if (historyMap != null) {
                if (searchvalue != null && !searchvalue.isEmpty()) {

                    Map<Integer, List<HistoryDTO>> tempMap = new HashMap<>();
                    for (Integer orderId : historyMap.keySet()) {
                        for (HistoryDTO historyDTO : historyMap.get(orderId)) {
                            if (historyDTO.getProductName().toLowerCase().contains(searchvalue)) {

                                tempMap.put(orderId, historyMap.get(orderId));
                                break;
                            }

                        }
                    }
                    request.setAttribute("HISTORYMAP", tempMap);
                } else if (date != null) {
                    Map<Integer, List<HistoryDTO>> tempMap = new HashMap<>();
                    for (Integer orderId : historyMap.keySet()) {
                        for (HistoryDTO historyDTO : historyMap.get(orderId)) {
                            if (historyDTO.getOrderTime().toString().contains(date)) {
                                tempMap.put(orderId, historyMap.get(orderId));
                                break;
                            }

                        }
                    }
                    request.setAttribute("HISTORYMAP", tempMap);
                } else {
                    request.setAttribute("HISTORYMAP", historyMap);
                }

                url = "history.jsp";
            } else {
                request.setAttribute("ERROR", "Can not load history");
            }

        } catch (NamingException ex) {
            log("NamingException_HistoryController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_HistoryController: " + ex.getMessage());
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
