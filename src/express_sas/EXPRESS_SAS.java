
package express_sas;
import express_sas.CONEXION_BD;

public class EXPRESS_SAS {


    public static void main(String[] args) {
        CONEXION_BD con = new CONEXION_BD();
        con.conectar();
    }
    
}
