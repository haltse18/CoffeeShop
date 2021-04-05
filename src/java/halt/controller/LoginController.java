/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.controller;

import halt.user.UserDAO;
import halt.user.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class LoginController extends HttpServlet {

    private final String ERROR_PAGE = "loginError.html";
//    private final String HOME_PAGE = "homePage.jsp";
//    private final String MANAGER_PAGE = "manager.jsp";

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
        String txtusername = request.getParameter("txtUsername");
        HttpSession session = request.getSession();
        String password = request.getParameter("txtPassword");
        String url = "loginError.jsp";
        try {
            UserDAO dao = new UserDAO();
            boolean result = dao.checkLogin(txtusername, password);
            if (result) {
                UserDTO dto = dao.getUserInfo(txtusername);
                if (dto != null) {

                    session.setAttribute("USERINFO", dto);
                    session.setAttribute("ROLE", dto.isIsAdmin());
                    
                    url = "MainController?btnAction=Setup";

                }
            } else {
                url = "loginError.jsp";
                request.setAttribute("LOGINERROR", "Invalid username, password");
//                System.out.println("<script>alert('Login fail.')</script>");

            }

        } catch (NamingException ex) {
            log("NamingException_LoginController: " + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException_LoginController: " + ex.getMessage());
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
