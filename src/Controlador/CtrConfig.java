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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class CtrConfig implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    System.out.println(cmd);
    switch(cmd){
        case "CMD_Ingresar":
            
        case "CMD_Registrar":
            
        case "CMD_ContraOl":
            
        }
    }
}