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

import Modelo.BDRegistro;
import Modelo.ModRegistro;
import Vista.VistaRegistroActividad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class CtrRegistro implements ActionListener{
    Modelo.ModRegistro mrac;
    Modelo.BDRegistro mBDrac;
    Vista.VistaRegistroActividad vrac;

    public CtrRegistro(ModRegistro mrac, VistaRegistroActividad vrac, BDRegistro mBDrac) {
        this.mrac = mrac;
        this.mBDrac = mBDrac;
        this.vrac = vrac;
//        vrac.addActionListener(this);
//        vrac.addActionListener(this);
//        vrac.addActionListener(this);
//        vrac.addActionListener(this);
//        vrac.addActionListener(this);
//        vrac.addActionListener(this);
//        vrac.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    System.out.println(cmd);
    switch(cmd){
        case"CMD_Comenzar":
            break;
        case"CMD_Pausar":
            break;
        case"CMD_Detener":
            break;
        case"CMD_Descansar":
            break;
        case"CMD_VerRegistro":
            break;
        case"CMD_EliminarRegistro":
            break;
    }
}
}

