/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import DAO.DAO;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author ducanh
 */
public class Login extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        String enteredCaptcha = request.getParameter("captcha");
//    String generatedCaptcha = (String) request.getSession().getAttribute("captcha");
//
//    // Kiểm tra xem CAPTCHA nhập vào có khớp với CAPTCHA trong session hay không.
//    
//        if (enteredCaptcha != null && enteredCaptcha.equals(generatedCaptcha)) {
//        // CAPTCHA chính xác. Xóa CAPTCHA khỏi session.
//        request.getSession().removeAttribute("captcha");
//
//        // Lấy tên người dùng và mật khẩu từ yêu cầu.
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        // Tạo đối tượng DAO để tương tác với cơ sở dữ liệu.
//        DAO dao = new DAO();
//
//        // Gọi phương thức login trong DAO để kiểm tra tên người dùng và mật khẩu.
//        Users user = dao.login(username, password);
//
//        // Kiểm tra xem thông tin đăng nhập có chính xác không.
//        if (user != null) {
//            // Thông tin đăng nhập chính xác. Lưu thông tin người dùng vào session và chuyển hướng đến trang chủ.
//            HttpSession session = request.getSession();
//            session.setAttribute("username", username);
//            response.sendRedirect("home2.jsp");
//        } else {
//            // Thông tin đăng nhập không chính xác. Gửi lại thông báo lỗi.
//            request.setAttribute("mess", "Username or password is incorrect");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }
//    } else {
//        // CAPTCHA không chính xác hoặc không được nhập. Gửi lại thông báo lỗi.
//        request.setAttribute("mess", "Captcha is incorrect or not entered");
//        request.getRequestDispatcher("login.jsp").forward(request, response);
//    }
//       String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        
//        DAO dao = new DAO();
//        Users acc = dao.login(username, password);
//        if (acc == null) {
//            // Thông tin đăng nhập không chính xác
//            request.setAttribute("mess", "Account invalid!");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//            
//        } else {
//            HttpSession session = request.getSession();
//            session.setAttribute("acc", acc);
//            // Người dùng tồn tại và mật khẩu đúng
//            response.sendRedirect("home2.jsp"); // Chuyển hướng đến trang chủ
//        }
//    }
    
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    String enteredCaptcha = request.getParameter("captcha");
    String generatedCaptcha = (String) request.getSession().getAttribute("captcha");

    if (enteredCaptcha != null && enteredCaptcha.equals(generatedCaptcha)) {
        request.getSession().removeAttribute("captcha");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        DAO dao = new DAO();
        Users user = dao.login(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("home2.jsp");
        } else {
            request.setAttribute("mess", "Username or password is incorrect");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    } else {
        request.setAttribute("mess", "Captcha is incorrect or not entered");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}


    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
