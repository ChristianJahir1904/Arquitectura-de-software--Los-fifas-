
package vista;

import vista.Cliente.AltaCliente;
import vista.Cliente.consultaCliente;
import vista.Cliente.modificarCliente;

import vista.Poliza.altaPoliza;
import vista.Poliza.consultaPoliza;
import vista.Poliza.eliminacionPoliza;
import vista.Poliza.modificarPoliza;

import vista.beneficiario.altaBeneficiario;
import vista.beneficiario.consultaBeneficiario;


public class MenuPrincipal extends javax.swing.JFrame {

  
    public MenuPrincipal() {
        initComponents();
        

    }

    private void cambiarPanel(javax.swing.JPanel nuevoPanel) {
    nuevoPanel.setSize(panFondo.getWidth(), panFondo.getHeight());
    nuevoPanel.setLocation(0, 0);
    
    panFondo.removeAll();
    panFondo.add(nuevoPanel, java.awt.BorderLayout.CENTER);
    panFondo.revalidate();
    panFondo.repaint();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImgInicio = new javax.swing.JLabel();
        mbPrincipal = new javax.swing.JMenuBar();
        mInicio = new javax.swing.JMenu();
        mCliente = new javax.swing.JMenu();
        miAltaClie = new javax.swing.JMenuItem();
        miConsultaClie = new javax.swing.JMenuItem();
        miModClie = new javax.swing.JMenuItem();
        mPoliza = new javax.swing.JMenu();
        miAltaPoli = new javax.swing.JMenuItem();
        miConsulPoli = new javax.swing.JMenuItem();
        miElimPoli = new javax.swing.JMenuItem();
        miModPoli = new javax.swing.JMenuItem();
        mBeneficiario = new javax.swing.JMenu();
        miAltaBene = new javax.swing.JMenuItem();
        miConsulBene = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Inicio Sistema Pólizas");

        lblImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgSistema.png"))); // NOI18N

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondoLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(lblImgInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblImgInicio)
                .addGap(20, 20, 20))
        );

        mInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgHome.png"))); // NOI18N
        mInicio.setText("Inicio");
        mInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mInicioMouseClicked(evt);
            }
        });
        mbPrincipal.add(mInicio);

        mCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCliente.png"))); // NOI18N
        mCliente.setText("Cliente");

        miAltaClie.setText("Alta Cliente");
        miAltaClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaClieActionPerformed(evt);
            }
        });
        mCliente.add(miAltaClie);

        miConsultaClie.setText("Consulta cliente");
        miConsultaClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaClieActionPerformed(evt);
            }
        });
        mCliente.add(miConsultaClie);

        miModClie.setText("Modificar Cliente");
        miModClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModClieActionPerformed(evt);
            }
        });
        mCliente.add(miModClie);

        mbPrincipal.add(mCliente);

        mPoliza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgPoliza.png"))); // NOI18N
        mPoliza.setText("Póliza");

        miAltaPoli.setText("Alta Póliza");
        miAltaPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaPoliActionPerformed(evt);
            }
        });
        mPoliza.add(miAltaPoli);

        miConsulPoli.setText("Consulta Póliza");
        miConsulPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsulPoliActionPerformed(evt);
            }
        });
        mPoliza.add(miConsulPoli);

        miElimPoli.setText("Eliminacion Póliza");
        miElimPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miElimPoliActionPerformed(evt);
            }
        });
        mPoliza.add(miElimPoli);

        miModPoli.setText("Modificar Póliza");
        miModPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModPoliActionPerformed(evt);
            }
        });
        mPoliza.add(miModPoli);

        mbPrincipal.add(mPoliza);

        mBeneficiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgBeneficiario.png"))); // NOI18N
        mBeneficiario.setText("Beneficiario");

        miAltaBene.setText("Alta Beneficiario");
        miAltaBene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaBeneActionPerformed(evt);
            }
        });
        mBeneficiario.add(miAltaBene);

        miConsulBene.setText("Consulta Beneficiario");
        miConsulBene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsulBeneActionPerformed(evt);
            }
        });
        mBeneficiario.add(miConsulBene);

        mbPrincipal.add(mBeneficiario);

        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgSalir.png"))); // NOI18N
        mSalir.setText("Salir");
        mSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSalirMouseClicked(evt);
            }
        });
        mbPrincipal.add(mSalir);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAltaPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaPoliActionPerformed
        cambiarPanel(new altaPoliza());
    }//GEN-LAST:event_miAltaPoliActionPerformed

    private void miAltaClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaClieActionPerformed
        cambiarPanel(new AltaCliente());
    }//GEN-LAST:event_miAltaClieActionPerformed

    private void miConsultaClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaClieActionPerformed
        cambiarPanel(new consultaCliente());
    }//GEN-LAST:event_miConsultaClieActionPerformed

    private void miModClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModClieActionPerformed
        cambiarPanel(new modificarCliente());
    }//GEN-LAST:event_miModClieActionPerformed

    private void miConsulPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsulPoliActionPerformed
        cambiarPanel(new consultaPoliza());
    }//GEN-LAST:event_miConsulPoliActionPerformed

    private void miElimPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miElimPoliActionPerformed
        cambiarPanel(new eliminacionPoliza());
    }//GEN-LAST:event_miElimPoliActionPerformed

    private void miModPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModPoliActionPerformed
        cambiarPanel(new modificarPoliza());
    }//GEN-LAST:event_miModPoliActionPerformed

    private void miAltaBeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaBeneActionPerformed
        cambiarPanel(new altaBeneficiario());
    }//GEN-LAST:event_miAltaBeneActionPerformed

    private void miConsulBeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsulBeneActionPerformed
        cambiarPanel(new consultaBeneficiario());
    }//GEN-LAST:event_miConsulBeneActionPerformed

    private void mInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mInicioMouseClicked
        cambiarPanel(new panInicio());
    }//GEN-LAST:event_mInicioMouseClicked

    private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_mSalirMouseClicked

    
    public static void main(String args[]) {
        com.formdev.flatlaf.FlatDarkLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImgInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu mBeneficiario;
    private javax.swing.JMenu mCliente;
    private javax.swing.JMenu mInicio;
    private javax.swing.JMenu mPoliza;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miAltaBene;
    private javax.swing.JMenuItem miAltaClie;
    private javax.swing.JMenuItem miAltaPoli;
    private javax.swing.JMenuItem miConsulBene;
    private javax.swing.JMenuItem miConsulPoli;
    private javax.swing.JMenuItem miConsultaClie;
    private javax.swing.JMenuItem miElimPoli;
    private javax.swing.JMenuItem miModClie;
    private javax.swing.JMenuItem miModPoli;
    private javax.swing.JPanel panFondo;
    // End of variables declaration//GEN-END:variables
}
