package util;

import java.io.File;//Para verificación de longitud de base de datos

import java.sql.*;

public class JDBCUtilities {

    //Atributos de clase para gestión de conexión con la base de datos    
    private static final String UBICACION_BD = "C:/Users/COMPU FLASH 3/Documents/JAVA/Entregable_Reto5/PlantillaReto5_P19/ProyectosConstruccion.db";    
    //private static final String UBICACION_BD = "ProyectosConstruccion.db";    

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;        
        return DriverManager.getConnection(url);
    }

    public static boolean estaVacia(){
        File archivo = new File(JDBCUtilities.UBICACION_BD);
        // //Salida de diagnóstixo
        System.out.println("UBICACION -> "+ JDBCUtilities.UBICACION_BD);
        System.out.println("Longitud -> "+ archivo.length());
        return archivo.length() == 0;
    }



}
