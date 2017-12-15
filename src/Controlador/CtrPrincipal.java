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
package Controlador;

//import Modelo.BDUsuario;
import Modelo.ModUsuario;
import Vista.VistaPrincipal;
import Vista.VistaRegistroActividad;
import Vista.VistaUsuarioP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CtrPrincipal implements ActionListener, WindowListener{
    
    Vista.VistaRegistroActividad vrac;
    Vista.VistaAnimo van;
    Vista.VistaActividad vac;
    Vista.VistaPrincipal vp; // Ventana con todos los menús
    Vista.VistaUsuarioP vup; // Ventana inicial de usuario para el ingreso
    Modelo.ModUsuario mu; // Tipo de dato usuario que almacena Identificador, nombre y contrasenha
    Modelo.BDActividad mBDac; // objeto que interactúa con la base de datos, hereda de BDgenerico su conexion
    Modelo.BDAnimo mBDan; // La conexion de bd generico puede requerir actualizarse de acuerdo a la ip del computador servidor
    Modelo.BDUsuario mBDu; // Esta base se inicializa y se toma como argumento en el constructor para acoplarse al ingreso de usuario
    Modelo.ModRegistro mrac; // Tipo de dato que toma como atributos todos los demas tipos de datos y guarda el registro de la actividad
    Modelo.BDRegistro mBDrac; // 
    WindowEvent e; // observa el cierre de las ventanas
    
    public CtrPrincipal(VistaPrincipal vp, VistaUsuarioP vup, Modelo.BDUsuario mBDu) {
        this.vp = vp;
        this.vup = vup;
        this.mBDu = mBDu;
        System.out.println("Usuario");
        Vista.VistaUsuarioP vu = vup;
        mu = new Modelo.ModUsuario();
        Controlador.CtrUsuario cu = new Controlador.CtrUsuario(mu, vu, mBDu, this);
        vu.setVisible(true);
        vu.setDefaultCloseOperation(2);
        vp.mnuUsuarios.addActionListener(this);
        vp.mnuCerrar.addActionListener(this);
        vp.mnuVentanaUsuario.addActionListener(this);
        vp.mnuConfig.addActionListener(this);
        vp.mnuCambiar.addActionListener(this);
        vp.mnuCerrar.setEnabled(false);
        vp.mnuCambiar.setEnabled(false);
        vp.itemConfigActividad.addActionListener(this);
        vp.itemConfigAnimo.addActionListener(this);
        vp.btnClick.addActionListener(this);
        vp.setDefaultCloseOperation(3);
        vp.addWindowListener(this);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    System.out.println(cmd);
    switch(cmd)
    {
        case "CMD_Ventana de Usuario":
             System.out.println("Usuario");
            vup.setVisible(true);
            vup.setDefaultCloseOperation(1);
            break;
            
            
        case "CMD_Cerrar":
        break;
        
        
        case "CMD_Cambiar":
        break;
        
        
        case "CMD_ConfigAnimo":
            System.out.println("Configuración Animo");
            van.setVisible(true);
        break;
        
        
        case "CMD_ConfigActividad":
            System.out.println("Configuración actividad");
            vac.setVisible(true);
        break;
        
        
        case "CMD_Click":
        System.out.println("Registro Actividad");
        vrac = new VistaRegistroActividad();
        mrac = new Modelo.ModRegistro();
        mrac.setU(mu);
        mBDrac = new Modelo.BDRegistro(mBDac, mBDan, mBDu);
        Controlador.CtrRegistro crac = new Controlador.CtrRegistro(mrac, vrac, mBDrac);
        vrac.setVisible(true);
        vrac.setDefaultCloseOperation(2);
        break;
    }   
}
  
    public void usuarioIngresado(ModUsuario mui, Modelo.ModActividad mac, Modelo.ModAnimo man){
        mac.setU(mui);
        mBDac = new Modelo.BDActividad();
        vac =  new Vista.VistaActividad();
        vac.setDefaultCloseOperation(1);
        Controlador.CtrActividad cac = new Controlador.CtrActividad(mac, vac, mBDac);
        man.setU(mui);
        mBDan = new Modelo.BDAnimo();
        van =  new Vista.VistaAnimo();
        van.setDefaultCloseOperation(1);
        Controlador.CtrAnimo can = new Controlador.CtrAnimo(man, van, mBDan);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        vp.setEnabled(false);
        vp.setVisible(false);
    }
    @Override
    public void windowClosing(WindowEvent e) {
        
    }
    @Override
    public void windowClosed(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
