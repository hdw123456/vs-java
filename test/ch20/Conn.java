package test.ch20;
import java.sql.*;
public class Conn {
    Connection con;
    public Connection getConnection(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    try {
        con=DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test","root","12345678");
        System.out.println("link success");
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return con;
    }
    public static void main(String[] args) {
        Conn c=new Conn();
        c.getConnection();

    }
    
}
