/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilina
 */
public class reservationThread  extends Thread{
    
    private reservations Reservations;
    private String roomType;
    private int num_of_rooms;
    private String fname;
    private String checkIn;
    private String checkOut;
    private String phoneNum;
    private String emailAdd;
    private String arrTime;
    private int adults;
    private int kids;
    private int totalPeople;
    private double paymentAmount;
    
    public reservationThread(reservations Reservations,String roomType,int num_of_rooms,String fname,String checkIn,String checkOut,String phoneNum,String emailAdd,String arrTime,int adults,int kids,int totalPeople,double paymentAmount) {
        this.Reservations = Reservations;
        this.roomType = roomType;
        this.num_of_rooms = num_of_rooms;
        this.fname = fname;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.phoneNum = phoneNum;
        this.emailAdd = emailAdd;
        this.arrTime = arrTime;
        this.adults = adults;
        this.kids = kids;
        this.totalPeople = totalPeople;
        this.paymentAmount = paymentAmount;
    }
    
    public void run() {
        try {
            Reservations.reservations(roomType, num_of_rooms, fname, checkIn, checkOut, phoneNum, emailAdd, arrTime, adults, kids, totalPeople, paymentAmount);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reservationThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reservationThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
