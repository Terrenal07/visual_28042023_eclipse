
package procedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class main3 {
    public static void main(String[] args) {
        int salida;
        double salida2;
        CallableStatement cs;
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String pass = "";
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, pass)) {
            cs = conexion.prepareCall("{CALL contarmax(?,?)}");
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.execute();
            salida = cs.getInt(1);
            salida2 =cs.getDouble(2);
            System.out.println("\nNúmero de registros: " + salida);
            System.out.println("\nregistro maximo: " + salida2+" leuros");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
USE VENTAS;
DROP PROCEDURE IF EXISTS contarmax;
DELIMITER $$
CREATE DEFINER=root@localhost PROCEDURE contarmax(OUT numeroregistros INT, OUT maximoventas DOUBLE)
BEGIN
   SELECT COUNT(*) INTO numeroregistros FROM Transaccion;
   SELECT MAX(ventas) INTO maximoventas FROM Transaccion;
END$$
DELIMITER ;

call contarmax(@cantidad,@maximo);
*/