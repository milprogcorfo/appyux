/*
 * Adquirir consciencia sobre
 * nuestra respiracion es una
 * buena práctica, sin duda.
 * 
 * El aire entra
 *               El aire sale
 * Dentro de ti
 *               Fuera de ti
 *               
 *       Las cosas fluyen 
 *               
 *      
 *               El futuro es ilusión
 * El pasado es ilusión
 *               
 *     El presente es verdad 
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class BDUsuario extends BDGenerico{
    

    public BDUsuario (){
        super();
        conectarBD();
    }
       
       public boolean guardar(Modelo.ModUsuario mu){
        try {
            PreparedStatement st = con.prepareStatement(
                "INSERT INTO usuario (idusuario, usuario, contrasenha, signoZodiacal)"+
                "VALUES (?,?,?,?)"
            );
            st.setInt(1, mu.getIdentificador());
            st.setString(2, mu.getUsuario());
            st.setString(3, mu.getContrasenha());
            st.setString(4, mu.getSignoZodiacal());
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
            PreparedStatement sentencia = con.prepareStatement(
                    "DELETE FROM usuario " + 
                    "WHERE idusuario = ? "
            );
            sentencia.setInt(1, ident);            
            int resultado = sentencia.executeUpdate();
            sentencia.close();
            if (resultado>0)
                return true;
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }                
        return false;
        
    }
    
    public ModUsuario buscar(int ident, ModUsuario mu){
        try {
            PreparedStatement st = con.prepareStatement(
                "SELECT idusuario, usuario, contrasenha, signoZodiacal "+
                "FROM usuario "+
                "WHERE idusuario = ?"   
            );
            st.setInt(1, ident);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                mu.setIdentificador(rs.getInt("idusuario"));
                mu.setUsuario(rs.getString("usuario"));
                mu.setContrasenha(rs.getString("contrasenha"));
                mu.setSignoZodiacal(rs.getString("signoZodiacal"));
                st.close();
                return mu;
            }
            return null;    
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }
        return null;
    }
     public ModUsuario buscar(String usuario, ModUsuario mu){
        try {
            PreparedStatement st = con.prepareStatement(
                "SELECT idusuario, usuario, contrasenha, signoZodiacal "+
                "FROM usuario "+
                "WHERE usuario = ?"   
            );
            st.setString(1, usuario);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                mu.setIdentificador(rs.getInt("idusuario"));
                mu.setUsuario(rs.getString("usuario"));
                mu.setContrasenha(rs.getString("contrasenha"));
                mu.setSignoZodiacal(rs.getString("signoZodiacal"));
                st.close();
                return mu;
            }
            return null;    
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }
        return null;
    }
    
    public boolean modificar (int ident, ModUsuario mu){
        try{
            PreparedStatement sentencia = con.prepareStatement(
                "UPDATE usuario "+
                "SET idusuario=?, usuario=?, contrasenha=?, signoZodiacal=? "+
                "WHERE idusuario = ?"            
            );
            
            sentencia.setInt(1, mu.getIdentificador());
            sentencia.setString(2, mu.getUsuario());
            sentencia.setString(3, mu.getContrasenha());
            sentencia.setString(4, mu.getSignoZodiacal());
            sentencia.setInt(4, ident);
            int resultado = sentencia.executeUpdate();            
            sentencia.close();
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