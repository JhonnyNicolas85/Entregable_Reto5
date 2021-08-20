package model.dao;

//Estructura de datos
import java.util.ArrayList;
//Librerías para SQL y Base de Datos
import java.sql.*;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta1_19Dao {
    public ArrayList<Consulta1VO_19> consulta1DAO() throws SQLException {
        ArrayList<Consulta1VO_19> response = new ArrayList<Consulta1VO_19>();
        try (Connection connection = JDBCUtilities.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("SELECT ID_Proyecto, Fecha_Inicio, Constructora, Serial FROM Proyecto WHERE ID_Proyecto <15");
        ){

            while (rset.next()){
                Consulta1VO_19 consulta1VO_19 = new Consulta1VO_19();
                consulta1VO_19.SetID_Proyecto(rset.getInt("ID_Proyecto"));
                consulta1VO_19.setFecha_Inicio(rset.getString("Fecha_Inicio"));
                consulta1VO_19.setConstructora(rset.getString("Constructora"));
                consulta1VO_19.setSerial_proyecto(rset.getString("Serial"));
                response.add(consulta1VO_19);
            }
        }
        return response;
    }  
}
