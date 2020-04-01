/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Modales;

import MySql.Conexiones;
import Objetos.Alumno;
import javax.swing.JFrame;

/**
 *
 * @author miriam
 */
public class Modal extends javax.swing.JDialog {

  
    private Alumno alumno = new Alumno();
    private Conexiones conexion = new Conexiones();
    private boolean devuelve = true;
    
    public boolean getRespuesta ()
    {
        return devuelve;
    }
    
    public Modal(java.awt.Frame parent, boolean modal, Alumno a, int flag) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setSize(600,300);
        if(flag == 2)
        {
            lblTexto.setText("<html><body>¿Deseas eliminar al alumno<br>Boleta: "+a.getMatricula()+"<br>Nombre: "+a.getNombre()+" "+a.getPrimer_apellido()+" "+a.getSegundo_apellido()+"?  </body></html>");
            alumno = a;
        }
    }

    private Modal(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        PanelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PanelFooter = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        PanelBody = new javax.swing.JPanel();
        lblTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 300));
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 112, 250), 2));
        jPanel5.setLayout(new java.awt.BorderLayout());

        PanelHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Serif", 1, 50)); // NOI18N
        lblTitulo.setText("Eliminar registro");
        PanelHeader.add(lblTitulo);

        jPanel5.add(PanelHeader, java.awt.BorderLayout.PAGE_START);

        PanelFooter.setBackground(new java.awt.Color(255, 255, 255));

        btnAceptar.setBackground(new java.awt.Color(1, 112, 250));
        btnAceptar.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(250, 60));
        btnAceptar.setMinimumSize(new java.awt.Dimension(250, 60));
        btnAceptar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        PanelFooter.add(btnAceptar);

        btnCancelar.setBackground(new java.awt.Color(1, 112, 250));
        btnCancelar.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(250, 60));
        btnCancelar.setMinimumSize(new java.awt.Dimension(250, 60));
        btnCancelar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PanelFooter.add(btnCancelar);

        jPanel5.add(PanelFooter, java.awt.BorderLayout.PAGE_END);

        PanelBody.setBackground(new java.awt.Color(255, 255, 255));

        lblTexto.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblTexto.setText("Deseas Eliminar al alumno");

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel5.add(PanelBody, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        devuelve = false;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        devuelve = true;
        conexion.conectar();
        conexion.elimina(String.valueOf(alumno.getMatricula()));
        conexion.desconectar();
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modal dialog = new Modal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
