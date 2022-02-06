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
import java.util.List;
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
@WebServlet(name = "deleteBooking", urlPatterns = {"/deleteBooking"})
public class deleteBooking extends HttpServlet {

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

        String bookingID = request.getParameter("bookingID");
        String num_of_rooms = request.getParameter("roomCount");
        String roomType = request.getParameter("roomType");

        int I_bookingID = Integer.parseInt(bookingID);
       int I_num_of_rooms = Integer.parseInt(num_of_rooms);
        

        reservations re = new reservations();
        try {
            List rooms = re.checkAvailability(roomType);
            int AVrooms = Integer.parseInt((String) rooms.get(0));
            int newRooms = AVrooms + I_num_of_rooms;

            boolean rsltRoomDelete = re.roomDelete(I_bookingID);
            if(rsltRoomDelete)
            {
            boolean rsltRoomUpdate = re.roomDeleteUpdate(roomType, newRooms);
            if (rsltRoomUpdate) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Reservation Deleted Successfully!');");
                out.println("location='AdminDashboard/admindashboard.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Oops! Something went wrong!');");
                out.println("location='AdminDashboard/admindashboard.jsp';");
                out.println("</script>");
            }}
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Oops! Something went wrong!');");
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
