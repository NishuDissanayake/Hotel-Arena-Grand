/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.reservations;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "updateBooking", urlPatterns = {"/updateBooking"})
public class updateBooking extends HttpServlet {

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

        String resID = request.getParameter("reservationID");
        String roomType = request.getParameter("roomType");
        String num_of_rooms = request.getParameter("noRooms");
        String checkIn = request.getParameter("checkIn");
        String checkOut = request.getParameter("checkOut");
        String adults = request.getParameter("adults");
        String kids = request.getParameter("kids");

        int I_ID = Integer.parseInt(resID);
        int I_num_of_rooms = Integer.parseInt(num_of_rooms);
        int I_adults = Integer.parseInt(adults);
        int I_kids = Integer.parseInt(kids);
        /*  
        out.println(I_ID);
        out.println(roomType);
        out.println(I_num_of_rooms);
        out.println(checkIn);
        out.println(checkOut);
        out.println(I_adults);
        out.println(I_kids);
        
         */

        try {
            reservations re = new reservations();
            boolean rslt = re.reservationUpdate(roomType, I_num_of_rooms, checkIn, checkOut, I_adults, I_kids, I_ID);

            if (rslt) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Update Successfull!');");
                out.println("location='AdminDashboard/admindashboard.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Oops! Something went wrong!');");
                out.println("location='AdminDashboard/admindashboard.jsp';");
                out.println("</script>");
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
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
