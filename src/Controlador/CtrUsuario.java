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

import Modelo.ModUsuario;
import Vista.VistaRegistro;
import Vista.VistaUsuarioP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CtrUsuario implements ActionListener, WindowListener
{
    ModUsuario mu;
    Modelo.BDUsuario mBDu;
    Controlador.CtrPrincipal c;
    VistaUsuarioP vu;
    VistaRegistro vur;
    
    public CtrUsuario(ModUsuario mu, VistaUsuarioP vu, Modelo.BDUsuario mBDu, Controlador.CtrPrincipal c) {
        this.mu = mu;
        this.vu = vu;
        this.c = c;
        this.mBDu = mBDu;
        vu.btnIngreso.addActionListener(this);
        vu.btnUsuarioRegistrar.addActionListener(this);
        vu.btnContraOl.addActionListener(this);
        vu.btnUsuarioBuscar.addActionListener(this);
        vu.btnUsuarioEliminar.addActionListener(this);
        vu.btnUsuarioModificar.addActionListener(this);
        vu.btnUsuarioListar.addActionListener(this);
        vu.btnUsuarioLimpiar.addActionListener(this);
        vu.addWindowListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    System.out.println(cmd);
    switch(cmd){
        case "CMD_Ingresar":
                System.out.println("Ingresar usuario");
                ModUsuario aux = new ModUsuario();
                aux.setUsuario(vu.txtUsuario.getText());
                aux.setContrasenha(String.valueOf(vu.txtContrasenha.getPassword()));
                mBDu.buscar(vu.txtUsuario.getText(), mu);
                aux.setIdentificador(mu.getIdentificador());
                if (!aux.getUsuario().equals(mu.getUsuario()))
                {
                vu.lblMensaje.setText("Usuario no registrado");
                } else {
                        if (!aux.getContrasenha().equals(mu.getContrasenha()))
                            {
                                vu.lblMensaje.setText("Contrasenha Incorrecta");
                            } else {
                                limpiar();
                                Modelo.ModActividad mac = new Modelo.ModActividad();
                                Modelo.ModAnimo man = new Modelo.ModAnimo();
                                c.usuarioIngresado(mu, mac, man);
                                vu.dispose();
                                c.vp.setEnabled(true);
                                c.vp.mnuConfig.setEnabled(true);
                            }
                        }
            break;
        case "CMD_Registrar":
            System.out.println("Registrar usuario");
            mu.setUsuario(vu.txtUsuario.getText());
            mu.setContrasenha(String.valueOf(vu.txtContrasenha2.getPassword()));
            mu.setIdentificador(Integer.parseInt(vu.txtIdUsuario.getText()));
            vur = new Vista.VistaRegistro();
            vur.setVisible(true);
            vur.btnConfirmar.addActionListener(this);
            break;
        case "CMD_Confirmar":
            System.out.println("Confirmar contrasenha");
            
                if (!mu.getContrasenha().equals(String.valueOf(vur.txtConfirmar.getPassword()))){
                vur.lblMensajeR.setText("No coinciden las contrasenhas!");
            } else {
                    mBDu.guardar(mu);
                    vur.dispose();
                    limpiar();
                }
            break;
        case "CMD_ContraOl":
            System.out.println("Se le olvidó la contrasenha! JAJAJAJA");
            vu.lblMensaje.setText("Mala Volá vieja!");
            break;
        case "CMD_Buscar usuario":
            System.out.println("Buscar Usuario");
            ModUsuario busca = new ModUsuario();
            try {
            mBDu.buscar(Integer.parseInt(vu.txtUsuarioBuscar.getText()), busca);
            } catch (NumberFormatException NFE){
            vu.txtUsuarioBuscar.setText("NUMEROS");
            vu.lblMensaje2.setText("ELMANO!, Error de formato");
            }
            vu.txtIdUsuario.setText(String.valueOf(busca.getIdentificador()));
            vu.txtUsuario2.setText(busca.getUsuario());
            vu.txtContrasenha2.setText(busca.getContrasenha());
            break;
        case "CMD_EliminarUsuario":
            System.out.println("Eliminar Usuario");
            mBDu.eliminar(Integer.parseInt(vu.txtUsuarioBuscar.getText()));
            limpiar();
            break;
        case "CMD_ListarTablaUsuario":
            System.out.println("Listar Tabla usuario");
            break;
        case "CMD_Modificar":
            System.out.println("Modificar usuario");
            break;
        case "CMD_LimpiarTablaUsuario":
            System.out.println("Limpiar Tabla usuario");
            break;
        }
    }
    public void limpiar(){
        vu.txtContrasenha.setText("");
        vu.txtUsuario.setText("");
        vu.txtIdUsuario.setText("");
        vu.txtContrasenha2.setText("");
        vu.txtUsuario2.setText("");
                
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
         c.vp.setEnabled(true);
         c.vp.setVisible(true);
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
