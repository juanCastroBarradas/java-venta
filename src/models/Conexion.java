package models;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private String database;
    private String host;
    private String user;
    private String password;
    
    public Conexion(){
        this.database = "ventas";
        this.host = "jdbc:mysql://localhost/"+this.database;
        this.user = "root";
        this.password = "123456";
    }
    
    public Conexion conectar(){
        Conexion conexion = null;
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conexion = (Conexion) DriverManager.getConnection(this.host, this.user, this.password);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return conexion;
    }
    
}
