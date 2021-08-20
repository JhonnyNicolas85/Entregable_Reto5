package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.*;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta3_19Dao {
    public ArrayList<Consulta3VO_19> consulta3DAO() throws SQLException {
        ArrayList<Consulta3VO_19> response = new ArrayList<Consulta3VO_19>();
        try (Connection connection = JDBCUtilities.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("SELECT ID_Proyecto, Nombre || ' ' || Primer_Apellido" +
            " AS nombreapellido FROM Lider JOIN Proyecto USING (ID_Lider) WHERE Banco_Vinculado = 'Bancolombia';");
        ){
            while (rset.next()){
                Consulta3VO_19 consulta3VO_19 = new Consulta3VO_19();
                consulta3VO_19.SetID_Proyecto(rset.getInt("ID_Proyecto"));
                consulta3VO_19.setnombreapellido(rset.getString("nombreapellido"));
                response.add(consulta3VO_19);
            }
        }
        return response;
    }    
}
