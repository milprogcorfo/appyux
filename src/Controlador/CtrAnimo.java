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
package Controlador;

import Modelo.ModAnimo;
import Vista.VistaAnimo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author poncho
 */
public class CtrAnimo implements ActionListener
{
 Modelo.ModAnimo man;
 Vista.VistaAnimo van;
 Modelo.BDAnimo mBDan;
 
    public CtrAnimo(ModAnimo man, VistaAnimo van, Modelo.BDAnimo mBDan) {
        this.man = man;
        this.van = van;
        this.mBDan = mBDan;
        van.btnAgregarAnimo.addActionListener(this);
        van.btnModificarAnimo.addActionListener(this);
        van.btnEliminarAnimo.addActionListener(this);
        van.btnDescripción.addActionListener(this);
        van.btnProductividad.addActionListener(this);
        van.btnEncontrar.addActionListener(this);
//        van.btnListarAnimo.addActionListener(this);
//        van.btnLimpiarTablaAnimo.addActionListener(this);
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    System.out.println(cmd);
    switch(cmd){
        case "CMD_AgregarAnimo":
           System.out.println("Agregar Animo");
           ModAnimo agr = new ModAnimo();
           agr.setTipo(van.txtTipoAnimo.getText());
           agr.setIdanimo(Integer.parseInt(van.txtIdAnimo.getText()));
           mBDan.guardar(agr);
           limpiar();
           break;
        case "CMD_Eliminar Animo":
            System.out.println("Eliminar Animo");
            mBDan.eliminar(Integer.parseInt(van.txtBuscadorAnimo.getText()));
            limpiar();
            break;
        case "CMD_Modificar Animo":
            System.out.println("Modificar Animo");
            ModAnimo modi = new ModAnimo();
            modi.setTipo(van.txtTipoAnimo.getText());
            modi.setIdanimo(Integer.parseInt(van.txtIdAnimo.getText()));
            mBDan.modificar(Integer.parseInt(van.txtBuscadorAnimo.getText()), modi);
            limpiar();
            break;
        case "CMD_Descripción":
            break;
        case "CMD_Encontrar":
            System.out.println("Encontrar Animo");
            ModAnimo busca = new ModAnimo();
            try {
            mBDan.buscar(Integer.parseInt(van.txtBuscadorAnimo.getText()), busca);
            van.txtIdAnimo.setText(String.valueOf(busca.getIdanimo()));
            van.txtTipoAnimo.setText(busca.getTipo());
            } catch (NumberFormatException NFE){
                van.txtBuscadorAnimo.setText("AQUI LA ID");
                van.txtIdAnimo.setText("ACA NO");
                van.txtTipoAnimo.setText("ID = NUMERO");
            }
            break;
        
        case "CMD_ListarAnimo" :
        break;
        
        case "CMD_LimpiarAnimo" :
        break;
    }
    }
    public void limpiar(){
        van.txtBuscadorAnimo.setText("");
        van.txtIdAnimo.setText("");
        van.txtTipoAnimo.setText("");
    }
}
    