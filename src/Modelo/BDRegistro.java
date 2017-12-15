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

/**
 *
 * @author registro
 */
public class BDRegistro extends BDGenerico{
BDActividad mBDac;
BDAnimo mBDan;
BDUsuario mBDu;
    
    public BDRegistro(BDActividad mBDac, BDAnimo mBDan, BDUsuario mBDu) {
        super();
        this.mBDac = mBDac;
        this.mBDan = mBDan;
        this.mBDu= mBDu;
        conectarBD();
    }
           public boolean guardar(Modelo.ModRegistro mr){
        try {
            PreparedStatement st = con.prepareStatement(
                "INSERT INTO registro (idactividad, tipo, animoini, usuario, animofin, frecuencia, productividad, duracionactividad, duraciondescanso, ciclo)"+
                "VALUES (?,?,?,?,?,?,?,?,?,?)"
            );
            st.setInt(1, mr.getIdActividad());
            st.setString(2, mr.getTipo());
            st.setString(3, mr.getIni().getTipo());            
            st.setString(4, mr.getU().getUsuario());            
            st.setString(5, mr.getFin().getTipo());            
            st.setInt(6, mr.getFrecuencia());            
            st.setInt(7, mr.getProductividad().getIdanimo());            
            st.setInt(8, mr.getDuracionActividad());            
            st.setInt(9, mr.getDuracionDescanso());            
            st.setInt(10, mr.getCiclo());            
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
                    "DELETE FROM registro " + 
                    "WHERE idregistro = ? "
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
    
    public ModRegistro buscar(int ident, ModRegistro mr){
        try {
            PreparedStatement st = con.prepareStatement(
                "SELECT *"+
                "FROM registro "+
                "WHERE idregistro = ?"   
            );
            st.setInt(1, ident);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                mr.setCiclo(rs.getInt("ciclo"));
                mr.setDuracionActividad(rs.getInt("duracionactividad"));
                mr.setDuracionDescanso(rs.getInt("duraciondescanso"));
                ModAnimo man = new ModAnimo();
                mr.setFin(mBDan.buscar(rs.getInt("animofin"), man));
                mr.setFrecuencia(rs.getInt("frecuencia"));
                mr.setIdActividad(ident);
                mr.setIni(mBDan.buscar(rs.getInt("animoini"), man));
                mr.setProductividad(mBDan.buscar(rs.getInt("productividad"), man));
                mr.setTipo(rs.getString("tipo"));
                ModUsuario mu = new ModUsuario();
                mr.setU(mBDu.buscar(rs.getString("usuario"), mu));
                st.close();
                return mr;
            }
            return null;    
        } catch (SQLException se){
            System.err.println("ERROR SELECT " + se.getMessage());
        }
        return null;
    }
}
