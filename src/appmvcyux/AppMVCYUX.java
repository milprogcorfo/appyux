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
package appmvcyux;


public class AppMVCYUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  
    
            Vista.VistaPrincipal v = new Vista.VistaPrincipal();
    Vista.VistaUsuarioP vup = new Vista.VistaUsuarioP();
    Modelo.BDUsuario mBDu = new Modelo.BDUsuario();
    v.mnuUsuario.setEnabled(true);
    v.mnuConfig.setEnabled(false);
    v.setVisible(true);
    v.setEnabled(false);
    Controlador.CtrPrincipal c = new Controlador.CtrPrincipal(v, vup, mBDu);
    }
    
    
    
}
