
package express_sas;
import java.sql.*;

public class CONEXION_BD {
            
    private static String url = "jdbc:mysql://localhost:3306/EXPRESS_SAS";
    private static String user = "root";
    private static String pass = "costos";
    
    public static Connection conectar(){
       Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("CONEXION ESTABLECIDA");
        } catch (SQLException e) {
            e.getMessage();
        }
        return con;
    }
}
