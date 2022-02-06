/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Contact {
    dbConnection dbcon = new dbConnection();
    
    public boolean contactus(String name, String phone, String message) throws ClassNotFoundException, SQLException {

        PreparedStatement pr = dbcon.createConnection().prepareStatement("INSERT INTO feedback(name, phone, message) VALUES (?,?,?)");
        pr.setString(1, name);
        pr.setString(2, phone);
        pr.setString(3, message);
        

        int i = pr.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
