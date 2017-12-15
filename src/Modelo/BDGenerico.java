/*
 * Adquirir consciencia sobre la respiracion
 * sin lugar a dudas es bueno
 * 
 * El aire entra
 *                 El aire sale
 * 
 * Dentro de ti
 *                 Fuera de ti
 * 
 *         Todo fluye
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BDGenerico {
    Connection con;
    String url = "jdbc:mysql://192.168.0.72:3306/appyux";
    String user = "root";
    String password = "123456";
    Statement st;
    PreparedStatement prepSt = null;  //String que se formatea y "compila" 
    ResultSet rs = null;              //Resultado
    Scanner scan = new Scanner(System.in);
    public void conectarBD(){
    try {            
    con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {        
            System.err.println("ERROR SQL: " + ex.getMessage());
        } 
    }
    public boolean guardar(int ident){
        return false;
    }    
    public boolean eliminar(int ident){
        return false;
    }
    
    public void buscar(int ident){

    }
    
    public boolean modificar (int ident){
        return false;
    
    }
    
}
