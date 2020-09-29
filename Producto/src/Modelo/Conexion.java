/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author victo
 */
public class Conexion {
    public Connection conexionBD;
    public final String bd ="Db_empresa";
    public final String urlConexion = String.format("jdbc:mysql://127.0.0.1:3306/Db_empresa",db);
    public final String usuario = "Empresa123";
    public final String contra = "Empresa5030!";
    public final String jdbc = "com.mysql.cj.jdbc.Drive";
    
    public void abrir_conexion(){
    try{
    
    }catch(Exception ex){
        System.out.println("Error de conexion..." + ex.getMessage());
        Class.forName(jdbc);
        conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
    }
    }
    
            
        
}
