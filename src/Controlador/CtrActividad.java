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

import Modelo.BDActividad;
import Modelo.ModActividad;
import Vista.VistaActividad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author poncho
 */
public class CtrActividad implements ActionListener
{
    Modelo.ModActividad mac;
    Vista.VistaActividad vac;
    Modelo.BDActividad mBDac;
    public CtrActividad(ModActividad mac, VistaActividad vac, BDActividad mBDac) {
        this.mac = mac;
        this.vac = vac;
        this.mBDac = mBDac;
        vac.btnAgregarActividad.addActionListener(this);
        vac.btnModificarActividad.addActionListener(this);
        vac.btnEliminarActividad.addActionListener(this);
        vac.btnBuscarActividad.addActionListener(this);

        vac.btnListarActividad.addActionListener(this);
        vac.btnLimpiarActividad.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    System.out.println(cmd);
    switch(cmd){
        case "CMD_AgregarActividad":
           System.out.println("Agregar Actividad");
           ModActividad agr = new ModActividad();
           agr.setTipo(vac.txtTipoActividad.getText());
           agr.setIdActividad(Integer.parseInt(vac.txtIdActividad.getText()));
            System.out.println(agr.getFrecuencia());
           mBDac.guardar(agr);
           limpiar();
            break;
        case "CMD_EliminarActividad":
            System.out.println("Eliminar actividad");
            mBDac.eliminar(Integer.parseInt(vac.txtIdActividad.getText()));
            limpiar();
            break;
        case "CMD_ModificarActividad":
            System.out.println("Modificar Actividad");
            ModActividad modi = new ModActividad();
            modi.setTipo(vac.txtTipoActividad.getText());
            modi.setIdActividad(Integer.parseInt(vac.txtIdActividad.getText()));
            mBDac.modificar(Integer.parseInt(vac.txtBuscadorActividad.getText()), modi);
            limpiar();
            break;
        case "CMD_BuscarActividad":
            System.out.println("Encontrar Actividad");
            ModActividad busca = new ModActividad();           
            try {
            mBDac.buscar(Integer.parseInt(vac.txtBuscadorActividad.getText()), busca);
            vac.txtIdActividad.setText(String.valueOf(busca.getIdActividad()));
            vac.txtTipoActividad.setText(busca.getTipo());
            } catch (NumberFormatException NFE){
                vac.txtBuscadorActividad.setText("AQUI LA ID");
                vac.txtIdActividad.setText("ACA NO");
                vac.txtTipoActividad.setText("ID=NUMERO");
            }
            break;
        case "CMD_ListarActividad" :
            break;

        case "CMD_LimpiarActividad" :
            limpiar();
            break;
        }
    }
    public void limpiar(){
        vac.txtBuscadorActividad.setText("");
        vac.txtIdActividad.setText("");
        vac.txtTipoActividad.setText("");
    }
}