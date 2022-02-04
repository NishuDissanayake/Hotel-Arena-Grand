package Model;
import java.sql.*;

public class dbConnection {
    public Connection createConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arena_grand", "root", "");
        return con;
    }
}
