/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.userHandling;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

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

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("fname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String pwd = request.getParameter("pass");
        String cpasswrd = request.getParameter("confpass");

        if (pwd.equals(cpasswrd)) {
            try {
                userHandling uh = new userHandling();
                boolean rslt = uh.registerUser(name, email, phone, pwd);
                if (rslt == true) {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Signup Complete!');");
                        out.println("location='Login/login.jsp';");
                        out.println("</script>");
                    RequestDispatcher rs = request.getRequestDispatcher("UserProfile/userprofile.jsp");
                    rs.include(request, response);
                } else {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Something went wrong!');");
                        out.println("location='Signup/signup.jsp';");
                        out.println("</script>");
                    RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
                    rs.include(request, response);
                }

            } catch (Exception se) {
                se.printStackTrace();
            }
        } else 
        {
            out.println("Please enter the same password! <html><body><a href='Signup/signup.jsp'>Go Back</a></body></html>");
        }

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
