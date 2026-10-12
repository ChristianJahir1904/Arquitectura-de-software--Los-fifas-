
package vista.Poliza;

public class altaPoliza extends javax.swing.JPanel {

   
    public altaPoliza() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAltaPoli = new javax.swing.JPanel();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblApeMa = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblCURP = new javax.swing.JLabel();
        lblDirec = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        btnRegis1 = new javax.swing.JButton();
        btnRegis = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();

        panAltaPoli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta Póliza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(101, 255, 201))); // NOI18N

        lblClave.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblClave.setText("Clave :");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipo.setText("Tipo :");

        lblApeMa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApeMa.setText("Monto :");

        lblCURP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCURP.setText("Descripción :");

        lblDirec.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDirec.setText("CURP Cliente :");

        btnRegis1.setText("Registrar");

        btnRegis.setText("Cancelar");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "Vida ", "Medico" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaPoliLayout = new javax.swing.GroupLayout(panAltaPoli);
        panAltaPoli.setLayout(panAltaPoliLayout);
        panAltaPoliLayout.setHorizontalGroup(
            panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaPoliLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaPoliLayout.createSequentialGroup()
                        .addComponent(btnRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panAltaPoliLayout.createSequentialGroup()
                        .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(lblCURP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApeMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave)
                            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                            .addComponent(txtDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                            .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
        );
        panAltaPoliLayout.setVerticalGroup(
            panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaPoliLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClave)
                    .addComponent(lblClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescripcion)
                    .addComponent(lblCURP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(panAltaPoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAltaPoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAltaPoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnRegis1;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel lblApeMa;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblDirec;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panAltaPoli;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
