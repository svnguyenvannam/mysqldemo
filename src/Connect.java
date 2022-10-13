import java.sql.*;

public class Connect {

    protected static String DB_URL = "jdbc:mysql://localhost:3306/trigger";
    protected static String USER_NAME = "root";
    protected static String PASSWORD = "1234";




    public static void main (String[] args){
        try {

         Connection conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            System.out.println("connected");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
