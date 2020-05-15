/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import GUI.*;
import GUI.Modales.Modal2;
import MySql.Conexiones;
import Objetos.Alumno;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author miriam
 */
public class PanelEditar extends javax.swing.JPanel {

    /**
     * Creates new form PanelAgregar
     */
    private char valida; //Para evento keytyped
    private Alumno alumno = new Alumno();
    private Conexiones conexion = new Conexiones();
    
    public PanelEditar() {
        initComponents();
        lblError.setVisible(false);
        
        txtBoleta.setPlaceholder("Boleta Actual");
        txtBoleta2.setPlaceholder("Boleta Nueva");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        txtBoleta2 = new rscomponentshade.RSTextFieldShade();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Alumnos");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        txtMat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMat.setMaximumSize(new java.awt.Dimension(450, 60));
        txtMat.setMinimumSize(new java.awt.Dimension(450, 60));
        txtMat.setPlaceholder("");
        txtMat.setPreferredSize(new java.awt.Dimension(450, 60));
        txtMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatKeyTyped(evt);
            }
        });

        txtBoleta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtBoleta.setMaximumSize(new java.awt.Dimension(450, 60));
        txtBoleta.setMinimumSize(new java.awt.Dimension(450, 60));
        txtBoleta.setPlaceholder("Boleta Actual");
        txtBoleta.setPreferredSize(new java.awt.Dimension(450, 60));
        txtBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBoletaMouseClicked(evt);
            }
        });
        txtBoleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBoletaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoletaKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(450, 60));
        txtNombre.setMinimumSize(new java.awt.Dimension(450, 60));
        txtNombre.setPlaceholder("");
        txtNombre.setPreferredSize(new java.awt.Dimension(450, 60));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPat.setMaximumSize(new java.awt.Dimension(450, 60));
        txtPat.setMinimumSize(new java.awt.Dimension(450, 60));
        txtPat.setPlaceholder("");
        txtPat.setPreferredSize(new java.awt.Dimension(450, 60));
        txtPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatKeyTyped(evt);
            }
        });

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

        txtBoleta2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtBoleta2.setMaximumSize(new java.awt.Dimension(450, 60));
        txtBoleta2.setMinimumSize(new java.awt.Dimension(450, 60));
        txtBoleta2.setPlaceholder("Boleta Nueva");
        txtBoleta2.setPreferredSize(new java.awt.Dimension(450, 60));
        txtBoleta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBoleta2MouseClicked(evt);
            }
        });
        txtBoleta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoleta2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblBoleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBoleta2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBoleta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBoleta)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPat)
                    .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if(txtBoleta.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPat.getText().isEmpty() || txtBoleta2.getText().isEmpty())
        {
            lblError.setVisible(true);
            if(txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            if(txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            if(txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            if(txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(!txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            //
            if(!txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta");
                lblBoleta.setForeground(Color.BLACK);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(!txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            if(txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(!txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta");
                lblBoleta.setForeground(Color.BLACK);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(!txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            if(txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && !txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido");
                lblPat.setForeground(Color.BLACK);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(!txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta");
                lblBoleta.setForeground(Color.BLACK);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(!txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
            if(txtBoleta.getText().isEmpty() && !txtBoleta2.getText().isEmpty() && txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s) *");
                lblNombre.setForeground(Color.red);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva");
            }
            if(txtBoleta.getText().isEmpty() && txtBoleta2.getText().isEmpty() && !txtNombre.getText().isEmpty() && txtPat.getText().isEmpty())
            {
                lblBoleta.setText("Boleta *");
                lblBoleta.setForeground(Color.red);
                lblNombre.setText("Nombre(s)");
                lblNombre.setForeground(Color.BLACK);
                lblPat.setText("Primer Apellido *");
                lblPat.setForeground(Color.red);
                
                txtBoleta.setPlaceholder("Boleta Actual *");
                txtBoleta2.setPlaceholder("Boleta Nueva *");
            }
        }
        else
        {
            conexion.conectar();
            if(conexion.existencia(txtBoleta.getText()))
            {
               
               if( (txtBoleta2.getText().equals(txtBoleta.getText())) || (!txtBoleta2.getText().equals(txtBoleta.getText()) && !conexion.existencia(txtBoleta2.getText())))
               {
                   if(Long.parseLong(txtBoleta2.getText()) > 2147483647)
                   {
                       JOptionPane.showMessageDialog(null, "Error com.mysql.jdbc.MysqlDataTruncation: Data truncation: Out of range value for column 'boleta' at row 1");
                   }
                   else
                   {
                        alumno.setMatricula(Integer.parseInt(txtBoleta2.getText()));
                        alumno.setNombre(txtNombre.getText());
                        alumno.setPrimerAp(txtPat.getText());
                        alumno.setSegundoAp(txtMat.getText());
                        conexion.actualiza(alumno, txtBoleta.getText());
                        Window parentWindow = SwingUtilities.windowForComponent(this);
                        Frame parentframe = null;
                        if(parentWindow instanceof Frame)
                         {
                             parentframe = (Frame)parentWindow;
                         }
                         Modal2 m = new Modal2(parentframe,true,6);
                         m.setVisible(true);
                         limpia();
                   }
 
               }
               else
               {
                   Window parentWindow = SwingUtilities.windowForComponent(this);
                   Frame parentframe = null;
                   if(parentWindow instanceof Frame)
                   {
                       parentframe = (Frame)parentWindow;
                   }
                    Modal2 m = new Modal2(parentframe,true,5);
                    m.setVisible(true);
               }
            }
            else
            {
                Window parentWindow = SwingUtilities.windowForComponent(this);
                Frame parentframe = null;
                if(parentWindow instanceof Frame)
                {
                    parentframe = (Frame)parentWindow;
                }
                Modal2 m = new Modal2(parentframe,true,4);
                m.setVisible(true);
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
        txtBoleta2.setText("");
        txtNombre.setText("");
        txtPat.setText("");
        txtMat.setText("");
        txtBoleta.setPlaceholder("Boleta Actual");
        txtBoleta2.setPlaceholder("Boleta Nueva");
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
        valida = evt.getKeyChar();
        if(Character.isLetter(valida) || valida == KeyEvent.VK_SPACE)
        {
            getToolkit().beep();
            evt.consume();
        }
        else if(txtBoleta.getText().length() == 10)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBoletaKeyTyped

    private void txtBoleta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoleta2KeyTyped
        valida = evt.getKeyChar();
        if(Character.isLetter(valida) || valida == KeyEvent.VK_SPACE)
        {
            getToolkit().beep();
            evt.consume();
        }
        else if(txtBoleta2.getText().length() == 10)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBoleta2KeyTyped

    private void txtBoletaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoletaKeyReleased
        txtBoleta2.setText(txtBoleta.getText());
    }//GEN-LAST:event_txtBoletaKeyReleased

    private void txtBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoletaMouseClicked
        txtBoleta.setPlaceholder("Boleta Actual");
    }//GEN-LAST:event_txtBoletaMouseClicked

    private void txtBoleta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoleta2MouseClicked
        txtBoleta2.setPlaceholder("Boleta Nueva");
    }//GEN-LAST:event_txtBoleta2MouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        valida = evt.getKeyChar();
        if(Character.isDigit(valida))
        {
            getToolkit().beep();
            evt.consume();
        }
        else if(txtNombre.getText().length() == 40)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatKeyTyped
        // TODO add your handling code here:
        valida = evt.getKeyChar();
        if(Character.isDigit(valida))
        {
            getToolkit().beep();
            evt.consume();
        }
        else if(txtPat.getText().length() == 30)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPatKeyTyped

    private void txtMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKeyTyped
        // TODO add your handling code here:
        valida = evt.getKeyChar();
        if(Character.isDigit(valida))
        {
            getToolkit().beep();
            evt.consume();
        }
        else if(txtMat.getText().length() == 30)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtMatKeyTyped


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
    private rscomponentshade.RSTextFieldShade txtBoleta2;
    private rscomponentshade.RSTextFieldShade txtMat;
    private rscomponentshade.RSTextFieldShade txtNombre;
    private rscomponentshade.RSTextFieldShade txtPat;
    // End of variables declaration//GEN-END:variables
}
