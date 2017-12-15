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

/**
 *
 * @author poncho
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author poncho
 */
public class BDAnimo extends BDGenerico{

    public BDAnimo() {
        super();
        this.conectarBD();
    }
    
    
    
   
    public boolean guardar(Modelo.ModAnimo man){
        try {
            PreparedStatement st = con.prepareStatement(
                "INSERT INTO animo (idanimo, tipoAnimo, frecuencia)"+
                "VALUES (?,?,?)"
            );
            st.setInt(1, man.getIdanimo());
            st.setString(2, man.getTipo());
            st.setInt(3, man.getFrecuencia());            
            boolean res = st.execute(); 
            st.close();
            return res;            
        } catch (SQLException se){            
            System.err.println("ERROR EXECUTE: " + se.getMessage());
        }
        return false;
    }
    @Override
    public boolean eliminar(int idanimo){
        try {
            PreparedStatement st = con.prepareStatement(
                "DELETE FROM animo " +
                "WHERE idanimo = ? "
            );
            st.setInt(1, idanimo);
            int resultado = st.executeUpdate();
            st.close();
            if (resultado>0)
                return true;
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }                
        return false;
    }

    public ModAnimo buscar(int ident, ModAnimo man){
        try {
            PreparedStatement st = con.prepareStatement(
                "SELECT idanimo, tipo, frecuencia "+
                "FROM animo "+
                "WHERE idanimo = ?"   
            );
            st.setInt(1, ident);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                man.setIdanimo(rs.getInt("idanimo"));
                man.setTipo(rs.getString("tipo"));
                man.setFrecuencia(rs.getInt("frecuencia"));
                st.close();
                return man;
            }
            return null;    
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }
        return null;
    }
    public boolean modificar (int ident, ModAnimo man){
        try{
            PreparedStatement st = con.prepareStatement(
                "UPDATE animo "+
                "SET idanimo=?, tipo=?, frecuencia=? "+
                "WHERE idanimo = ?"            
            );
            st.setInt(1, man.getIdanimo());
            st.setString(2, man.getTipo());
            st.setInt(3, man.getFrecuencia());
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
