
package vista.Cliente;
import vista.MenuPrincipal;

public class AltaCliente extends javax.swing.JPanel {

   
    public AltaCliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        panAlta = new javax.swing.JPanel();
        lblApePa = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblApeMa = new javax.swing.JLabel();
        lblCURP = new javax.swing.JLabel();
        lblDirec = new javax.swing.JLabel();
        lblFechaNa = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();
        btnRegis1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApePa = new javax.swing.JTextField();
        txtApeMa = new javax.swing.JTextField();
        txtCurp = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        txtFechaNa = new javax.swing.JTextField();

        panAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alta Cliente"), "Alta Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(102, 255, 204))); // NOI18N

        lblApePa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApePa.setText("Apellido Paterno :");

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombre1.setText("Nombre (s):");

        lblApeMa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApeMa.setText("Apellido Materno :");

        lblCURP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCURP.setText("CURP :");

        lblDirec.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDirec.setText("Dirección :");

        lblFechaNa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFechaNa.setText("Fecha Nacimiento :");

        btnRegis.setText("Cancelar");

        btnRegis1.setText("Registrar");

        javax.swing.GroupLayout panAltaLayout = new javax.swing.GroupLayout(panAlta);
        panAlta.setLayout(panAltaLayout);
        panAltaLayout.setHorizontalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaLayout.createSequentialGroup()
                        .addComponent(btnRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panAltaLayout.createSequentialGroup()
                        .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaNa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDirec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCURP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApeMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApePa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtApePa, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addComponent(txtApeMa, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addComponent(txtCurp, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addComponent(txtDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addComponent(txtFechaNa, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
        );
        panAltaLayout.setVerticalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(lblNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApePa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApePa, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApeMa, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCurp)
                    .addComponent(lblCURP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNa, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnRegis1;
    private javax.swing.JLabel lblApeMa;
    private javax.swing.JLabel lblApePa;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblDirec;
    private javax.swing.JLabel lblFechaNa;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JPanel panAlta;
    private javax.swing.JPanel panFondo;
    private javax.swing.JTextField txtApeMa;
    private javax.swing.JTextField txtApePa;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtFechaNa;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
