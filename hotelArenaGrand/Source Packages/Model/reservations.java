
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class reservations {
    dbConnection dbcon = new dbConnection();
    int state = 0;
    Statement statement = null;
    ResultSet resultSet = null;
    
     public List checkAvailability(String RoomType) throws SQLException, ClassNotFoundException {
        List searchList = new ArrayList();
        statement = dbcon.createConnection().createStatement();
        String sql = "SELECT * FROM rooms WHERE roomType LIKE '" + RoomType + "'"; 
        resultSet = statement.executeQuery(sql);
        
        while(resultSet.next()){
            searchList.add(resultSet.getString("roomAmount"));
        }
        return searchList;
    }
     
     public boolean reservations(String roomType, int num_of_rooms, String fname, String checkIn, String checkOut, String phoneNum, String emailAdd, String arrTime, int adults, int kids, int totalPeople, double paymentAmount) throws ClassNotFoundException, SQLException {

        PreparedStatement pr = dbcon.createConnection().prepareStatement("INSERT INTO reservations(roomType, numberOfRooms, fullName, phoneNumber, email, checkIn, chackOut, arrivalTime, adults, kids, totalPeople, paymentAmount ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        pr.setString(1, roomType);
        pr.setInt(2, num_of_rooms);
        pr.setString(3, fname);
        pr.setString(4, phoneNum);
        pr.setString(5, emailAdd);
        pr.setString(6, checkIn);
        pr.setString(7, checkOut);
        pr.setString(8, arrTime);
        pr.setInt(9, adults);
        pr.setInt(10, kids);
        pr.setInt(11, totalPeople);
        pr.setDouble(12, paymentAmount);

        int i = pr.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

}
