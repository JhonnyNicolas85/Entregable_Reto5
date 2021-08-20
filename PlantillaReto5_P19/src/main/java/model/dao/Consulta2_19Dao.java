package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Statement;
//Estructura de datos
import java.util.ArrayList;

//Encapsulamiento de los datos
import model.vo.Consulta2VO_19;
//Clase para conexión
import util.JDBCUtilities;

public class Consulta2_19Dao {
    public ArrayList<Consulta2VO_19> consulta2DAO() throws SQLException {
        ArrayList<Consulta2VO_19> response = new ArrayList<Consulta2VO_19>();
        try (Connection connection = JDBCUtilities.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("SELECT ID_Proyecto,Area_Max FROM Tipo JOIN Proyecto USING (ID_Tipo) WHERE Numero_Habitaciones = 2");
        ){

            while (rset.next()){
                Consulta2VO_19 consulta2VO_19 = new Consulta2VO_19();
                consulta2VO_19.SetID_Proyecto(rset.getInt("ID_Proyecto"));
                consulta2VO_19.setArea_Max(rset.getInt("Area_Max"));
                response.add(consulta2VO_19);
            }
        }
        return response;
    } 
}
