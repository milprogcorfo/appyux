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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author poncho
 */
public class BDActividad extends BDGenerico {
 
    public BDActividad(){
        super();
        this.conectarBD();
    }
    
    
       public boolean guardar(ModActividad mac)
       {    try {
            PreparedStatement st = con.prepareStatement(
                "INSERT INTO actividad (idActividad, tipoActividad, frecuencia)"+
                "VALUES (?,?,?)"
            );
            st.setInt(1, mac.getIdActividad());
            st.setString(2, mac.getTipo());
            st.setInt(3, mac.getFrecuencia());            
            boolean res = st.execute(); 
            st.close();
            return res;            
        } catch (SQLException se){            
            System.err.println("ERROR EXECUTE: " + se.getMessage());
        }
        return false;
    }    
    @Override
    public boolean eliminar(int ident){
        try {
            PreparedStatement st = con.prepareStatement(
                "DELETE FROM actividad " +
                "WHERE idActividad = ? "
            );
            st.setInt(1, ident);
            int resultado = st.executeUpdate();
            st.close();
            if (resultado>0)
                return true;
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }                
        return false;
    }
    
    public ModActividad buscar(int ident, ModActividad mac){
        try {
            PreparedStatement st = con.prepareStatement(
                "SELECT idActividad, tipoActividad, frecuencia "+
                "FROM actividad "+
                "WHERE idActividad = ?"   
            );
            st.setInt(1, ident);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                mac.setIdActividad(rs.getInt("idActividad"));
                mac.setTipo(rs.getString("tipoActividad"));
                mac.setFrecuencia(rs.getInt("frecuencia"));
                st.close();
                return mac;
            }
            return null;    
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }
        return null;
    }
    
    public boolean modificar (int ident, ModActividad mac){
        try{
            PreparedStatement st = con.prepareStatement(
                "UPDATE actividad "+
                "SET idActividad=?, tipoActividad=?, frecuencia=? "+
                "WHERE idActividad = ?"            
            );
            st.setInt(1, mac.getIdActividad());
            st.setString(2, mac.getTipo());
            st.setInt(3, mac.getFrecuencia());
            st.setInt(4, ident);
            int resultado = st.executeUpdate();            
            st.close();
            if (resultado>0)
                return true;
            else
                return false;
        } catch(SQLException se){
            System.err.println("ERROR UPDATE " + se.getMessage());            
        }
        return false;
    }
}
