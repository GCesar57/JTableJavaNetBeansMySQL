/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

//import com.mysql.jdbc.Connection;
 import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author giron
 */
public class Conexion {
    Connection conn;
    public Conexion(){
        try {
            //
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingall", "root", ""); 
        } catch (Exception e) {
            System.out.println("Error de conexion: "+e.getMessage());
        }
    }//
    //
    public Connection getConnection(){
        return conn;
    }//
}
