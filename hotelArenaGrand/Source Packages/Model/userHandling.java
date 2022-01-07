package Model;

import java.sql.*;

public class userHandling {

    dbConnection dbcon = new dbConnection();

    public boolean loginUser(String email, String pwd) throws ClassNotFoundException, SQLException {
        boolean statement = false;
        try {
            PreparedStatement pr = dbcon.createConnection().prepareStatement("SELECT * FROM users WHERE email=? AND pass=?");
            pr.setString(1, email);
            pr.setString(2, pwd);
            ResultSet rs = pr.executeQuery();
            statement = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return statement;
    }
    
    public boolean loginAdmin(String email, String pwd) throws ClassNotFoundException, SQLException {
        boolean statement = false;
        try {
            PreparedStatement pr = dbcon.createConnection().prepareStatement("SELECT * FROM admins WHERE email=? AND pass=?");
            pr.setString(1, email);
            pr.setString(2, pwd);
            ResultSet rs = pr.executeQuery();
            statement = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return statement;
    }

    public boolean registerUser(String name, String email, String phone, String pwd) throws ClassNotFoundException, SQLException {

        PreparedStatement pr = dbcon.createConnection().prepareStatement("INSERT INTO users(fullname, email, phone, pass) VALUES (?,?,?,?)");
        pr.setString(1, name);
        pr.setString(2, email);
        pr.setString(3, phone);
        pr.setString(4, pwd);
        
        
        int i = pr.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }
}
