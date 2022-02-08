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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "reservation", urlPatterns = {"/reservation"})
public class reservation extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String roomType = request.getParameter("roomType");
        String num_of_rooms = request.getParameter("num_of_rooms");
        String fname = request.getParameter("fname");
        String checkIn = request.getParameter("checkIn");
        String checkOut = request.getParameter("checkOut");
        String phoneNum = request.getParameter("phoneNum");
        String emailAdd = request.getParameter("emailAdd");
        String arrTime = request.getParameter("arrTime");
        String adults = request.getParameter("adults");
        String kids = request.getParameter("kids");

        int I_num_of_rooms = Integer.parseInt(num_of_rooms);
        int I_adults = Integer.parseInt(adults);
        int I_kids = Integer.parseInt(kids);

        reservations re = new reservations();
        try {
            List rooms = re.checkAvailability(roomType);
            int AVrooms = Integer.parseInt((String) rooms.get(0));
            int numOfRooms = Integer.parseInt((String) num_of_rooms);
            int remainingRooms = AVrooms - numOfRooms;

            if (AVrooms < numOfRooms) {
                response.sendRedirect("./Reservations/ReservationsNotAvailable.jsp");
            } else {
                int totalPeople = I_adults + I_kids;
                double paymentAmount = 0;
                if (roomType.equals("Regular")) {
                    paymentAmount = 3500 * I_num_of_rooms;
                } else if (roomType.equals("SemiDeluxe")) {
                    paymentAmount = 5500 * I_num_of_rooms;
                } else if (roomType.equals("Deluxe")) {
                    paymentAmount = 8500 * I_num_of_rooms;
                }
                boolean rslt = re.reservations(roomType, I_num_of_rooms, fname, checkIn, checkOut, phoneNum, emailAdd, arrTime, I_adults, I_kids, totalPeople, paymentAmount);

                if (rslt) {
                    boolean rsltRoomUpdate = re.RoomUpdate(roomType, remainingRooms);
                    if (rsltRoomUpdate) {
                        
                        /*
                        String redirectURL = "https://royalbreez.secodek.com/index.php?APIkey=hha6asdahhasdhas8sdh3hjh3&name="+fname+"&email="+emailAdd+"";
                        response.sendRedirect(redirectURL);*/
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Rooms Available!');");
                        out.println("location='Reservations/ReservationsPay.jsp';");
                        out.println("</script>");

                    } else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Oops! Something went wrong!');");
                        out.println("location='Reservations/reservations.jsp';");
                        out.println("</script>");
                    }
                } else {
                    out.print("Failed");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
        }

//        reservations re = new reservations();
//        
//        try {
//            boolean rslt = re.makeReservation(roomType, I_num_of_rooms, fname, checkIn, checkOut, phoneNum, emailAdd, arrTime, I_adults, I_kids);
//            
//            if(rslt) {
//                out.print("reservation successfull!");
//            } else {
//                out.print("Failed");
//            }
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
//        }*/
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
