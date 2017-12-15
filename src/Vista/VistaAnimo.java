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
package Vista;

/**
 *
 * @author poncho
 */
public class VistaAnimo extends javax.swing.JFrame {

    /**
     * Creates new form VistaAnimo
     */
    public VistaAnimo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgregarAnimo = new javax.swing.JButton();
        btnModificarAnimo = new javax.swing.JButton();
        btnEliminarAnimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdAnimo = new javax.swing.JTextField();
        txtTipoAnimo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoAnimo = new javax.swing.JTextPane();
        btnDescripción = new javax.swing.JButton();
        lblBuscador = new javax.swing.JLabel();
        txtBuscadorAnimo = new javax.swing.JTextField();
        btnEncontrar = new javax.swing.JButton();
        btnProductividad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Configuración de Animo y Productividad");

        btnAgregarAnimo.setText("Agregar Animo");
        btnAgregarAnimo.setActionCommand("CMD_AgregarAnimo");

        btnModificarAnimo.setText("Modificar Animo");
        btnModificarAnimo.setActionCommand("CMD_Modificar Animo");

        btnEliminarAnimo.setText("Eliminar Animo");
        btnEliminarAnimo.setActionCommand("CMD_Eliminar Animo");
        btnEliminarAnimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAnimoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("IdAnimo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipo Animo");

        txtTipoAnimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoAnimoActionPerformed(evt);
            }
        });

        textoAnimo.setBackground(new java.awt.Color(240, 240, 240));
        textoAnimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textoAnimo.setText("Para agregar un ánimo\n\nRellene adecuadamente las 2 casillas de texto dispuestas\ny haga click en el botón agregar ánimo.\n\nPara modificar un ánimo\n\nBusque el ánimo objetivo en la casilla buscadora por su Tipo\ny haga click en el botón Encontrar.\n\nLuego rellene adecudamente las 2 casillas de texto dispuestas\ny haga click en el botón Modificar Animo.\nPara eliminar un ánimo\n\nBusque el ánimo objetivo en la casilla buscador por su IdAnimo,\ny haga click en el botón Eliminar Animo.\n\nPara modificar, eliminar o agregar una descripción de un ánimo\n\nBusque en la casilla buscador por el Tipo Animo,\nhaga click en el botón Encontrar y luego en el de Descripción.\n\nPara administrar los criterios de Productividad\n\nhaga click en botón Config Productividad\nOpción no habilitada en esta versión");
        textoAnimo.setCaretColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(textoAnimo);

        btnDescripción.setText("Descripción");
        btnDescripción.setActionCommand("CMD_Descripción");
        btnDescripción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescripciónActionPerformed(evt);
            }
        });

        lblBuscador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBuscador.setText("Buscador");

        txtBuscadorAnimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorAnimoActionPerformed(evt);
            }
        });

        btnEncontrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEncontrar.setText("Encontrar!");
        btnEncontrar.setActionCommand("CMD_Encontrar");
        btnEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncontrarActionPerformed(evt);
            }
        });

        btnProductividad.setText("Config Productividad");
        btnProductividad.setActionCommand("CMD_ConfigProductividad");
        btnProductividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscadorAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEncontrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificarAnimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDescripción)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProductividad)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscadorAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTipoAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(btnEncontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAnimo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarAnimo)
                    .addComponent(btnEliminarAnimo)
                    .addComponent(btnDescripción)
                    .addComponent(btnProductividad))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarAnimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAnimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAnimoActionPerformed

    private void txtTipoAnimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoAnimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoAnimoActionPerformed

    private void btnDescripciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescripciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescripciónActionPerformed

    private void txtBuscadorAnimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorAnimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorAnimoActionPerformed

    private void btnEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncontrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncontrarActionPerformed

    private void btnProductividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductividadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAnimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAnimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAnimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAnimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAnimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarAnimo;
    public javax.swing.JButton btnDescripción;
    public javax.swing.JButton btnEliminarAnimo;
    public javax.swing.JButton btnEncontrar;
    public javax.swing.JButton btnModificarAnimo;
    public javax.swing.JButton btnProductividad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblBuscador;
    private javax.swing.JTextPane textoAnimo;
    public javax.swing.JTextField txtBuscadorAnimo;
    public javax.swing.JTextField txtIdAnimo;
    public javax.swing.JTextField txtTipoAnimo;
    // End of variables declaration//GEN-END:variables
}