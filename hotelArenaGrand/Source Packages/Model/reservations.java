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

        while (resultSet.next()) {
            searchList.add(resultSet.getString("roomAmount"));
        }
        return searchList;
    }

    public synchronized boolean reservations(String roomType, int num_of_rooms, String fname, String checkIn, String checkOut, String phoneNum, String emailAdd, String arrTime, int adults, int kids, int totalPeople, double paymentAmount) throws ClassNotFoundException, SQLException {

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

    public boolean RoomUpdate(String roomType, int remainingRooms) throws ClassNotFoundException, SQLException {

        String query = "UPDATE rooms SET roomAmount=? WHERE roomType LIKE ?";
        PreparedStatement preparedStmt = dbcon.createConnection().prepareStatement(query);
        preparedStmt.setInt(1, remainingRooms);
        preparedStmt.setString(2, roomType);
        // execute the java preparedstatement
        int i = preparedStmt.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean roomDeleteUpdate(String roomType, int newRooms) throws ClassNotFoundException, SQLException {

        String query = "UPDATE rooms SET roomAmount=? WHERE roomType LIKE ?";
        PreparedStatement preparedStmt = dbcon.createConnection().prepareStatement(query);
        preparedStmt.setInt(1, newRooms);
        preparedStmt.setString(2, roomType);
        // execute the java preparedstatement
        int i = preparedStmt.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean roomDelete(int roomID) throws ClassNotFoundException, SQLException {

        String query = "DELETE FROM reservations WHERE reservationID = ?";
        PreparedStatement preparedStmt = dbcon.createConnection().prepareStatement(query);
        preparedStmt.setInt(1, roomID);
        // execute the java preparedstatement
        int i = preparedStmt.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean reservationUpdate(String roomType, int I_num_of_rooms, String checkIn, String checkOut, int I_adults, int I_kids, int I_ID) throws ClassNotFoundException, SQLException {

        String query = "UPDATE reservations SET roomType=?, numberOfRooms=?, checkIn=?, chackOut=?, adults=?, kids=? WHERE reservationID=?";
        PreparedStatement preparedStmt = dbcon.createConnection().prepareStatement(query);
        preparedStmt.setString(1, roomType);
        preparedStmt.setInt(2, I_num_of_rooms);
        preparedStmt.setString(3, checkIn);
        preparedStmt.setString(4, checkOut);
        preparedStmt.setInt(5, I_adults);
        preparedStmt.setInt(6, I_kids);
        preparedStmt.setInt(7, I_ID);
        
        int i = preparedStmt.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }

}
