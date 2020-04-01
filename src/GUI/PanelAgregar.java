/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Modales.Modal2;
import MySql.Conexiones;
import Objetos.Alumno;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.SwingUtilities;

/**
 *
 * @author miriam
 */
public class PanelAgregar extends javax.swing.JPanel {

    /**
     * Creates new form PanelAgregar
     */
    private char validar;
    private Alumno alumno = new Alumno();
    private Conexiones conexion = new Conexiones();
    
    public PanelAgregar() {
        initComponents();
        lblError.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMat = new rscomponentshade.RSTextFieldShade();
        txtBoleta = new rscomponentshade.RSTextFieldShade();
        txtNombre = new rscomponentshade.RSTextFieldShade();
        txtPat = new rscomponentshade.RSTextFieldShade();
        lblBoleta = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPat = new javax.swing.JLabel();
        lblMat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Alumnos");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        txtMat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMat.setMaximumSize(new java.awt.Dimension(450, 60));
        txtMat.setMinimumSize(new java.awt.Dimension(450, 60));
        txtMat.setPlaceholder("");
        txtMat.setPreferredSize(new java.awt.Dimension(450, 60));

        txtBoleta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtBoleta.setMaximumSize(new java.awt.Dimension(450, 60));
        txtBoleta.setMinimumSize(new java.awt.Dimension(450, 60));
        txtBoleta.setPlaceholder("");
        txtBoleta.setPreferredSize(new java.awt.Dimension(450, 60));
        txtBoleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoletaKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(450, 60));
        txtNombre.setMinimumSize(new java.awt.Dimension(450, 60));
        txtNombre.setPlaceholder("");
        txtNombre.setPreferredSize(new java.awt.Dimension(450, 60));

        txtPat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPat.setMaximumSize(new java.awt.Dimension(450, 60));
        txtPat.setMinimumSize(new java.awt.Dimension(450, 60));
        txtPat.setPlaceholder("");
        txtPat.setPreferredSize(new java.awt.Dimension(450, 60));

        lblBoleta.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblBoleta.setText("Boleta");

        lblNombre.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblNombre.setText("Nombre(s)");

        lblPat.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblPat.setText("Primer Apellido");

        lblMat.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblMat.setText("Segundo Apellido");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnLimpiar.setBackground(new java.awt.Color(1, 112, 250));
        btnLimpiar.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(250, 60));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(250, 60));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(250, 60));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(1, 112, 250));
        btnAceptar.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(250, 60));
        btnAceptar.setMinimumSize(new java.awt.Dimension(250, 60));
        btnAceptar.setPreferredSize(new java.awt.Dimension(250, 60));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 51));
        lblError.setText("Los campos con * no deben estar vacíos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPat)
                            .addComponent(lblMat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblBoleta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBoleta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMat))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // VALIDAR CAMPOS LLENOS
        if(txtBoleta.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPat.getText().isEmpty())
        {
            lblError.setVisible(true);
            if(txtBoleta.getText().isEmpty() && txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
            }
            else if(txtBoleta.getText().isEmpty() && (txtNombre.getText() != " " && txtPat.getText() != " "))
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombr(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
            }
            else if(txtBoleta.getText().isEmpty() && txtNombre.getText().isEmpty() && txtPat.getText() != " ")
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
            }
            else if(txtBoleta.getText() != " " && txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta");
                lblBoleta.setForeground(Color.BLACK);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
            }
            else if(txtBoleta.getText() != " " && txtNombre.getText() != " " && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta");
                lblBoleta.setForeground(Color.BLACK);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
            }
            else if(txtBoleta.getText() != " " && txtNombre.getText().isEmpty() && txtPat.getText() != " ")
            {
                lblBoleta.setText("Boleta");
                lblBoleta.setForeground(Color.BLACK);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
            }
        }
        else
        {

            
            alumno.setMatricula(Long.parseLong(txtBoleta.getText()));
            alumno.setNombre(txtNombre.getText());
            alumno.setPrimer_apellido(txtPat.getText());
            alumno.setSegundo_apellido(txtMat.getText());
            conexion.conectar();
            if(conexion.existencia(txtBoleta.getText()))
            {
                //EXISTE REGISTRO
                Window parentWindow = SwingUtilities.windowForComponent(this);
                Frame parentframe = null;
                if(parentWindow instanceof Frame)
                {
                    parentframe = (Frame)parentWindow;
                }
                Modal2 m = new Modal2(parentframe,true,3);
                m.setVisible(true);
            }
            else
            {
                //INSERTA
                conexion.inserta(alumno);
                Window parentWindow = SwingUtilities.windowForComponent(this);
                Frame parentframe = null;
                if(parentWindow instanceof Frame)
                {
                    parentframe = (Frame)parentWindow;
                }
                Modal2 m = new Modal2(parentframe,true,2);
                m.setVisible(true);
                limpia();
            }
            conexion.desconectar();
            
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    public void limpia()
    {
        lblBoleta.setText("Boleta");
        lblBoleta.setForeground(Color.BLACK);
        lblNombre.setText("Nombre(s)");
        lblNombre.setForeground(Color.BLACK);
        lblPat.setText("Primer Apellido");
        lblPat.setForeground(Color.BLACK);
        lblError.setVisible(false);
        
        txtBoleta.setText("");
        txtNombre.setText("");
        txtPat.setText("");
        txtMat.setText("");
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpia();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(new Color(1,112,250));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(1,112,250));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void txtBoletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoletaKeyTyped
        validar = evt.getKeyChar();
        if(Character.isLetter(validar) || validar == KeyEvent.VK_SPACE)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBoletaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBoleta;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPat;
    private rscomponentshade.RSTextFieldShade txtBoleta;
    private rscomponentshade.RSTextFieldShade txtMat;
    private rscomponentshade.RSTextFieldShade txtNombre;
    private rscomponentshade.RSTextFieldShade txtPat;
    // End of variables declaration//GEN-END:variables
}
