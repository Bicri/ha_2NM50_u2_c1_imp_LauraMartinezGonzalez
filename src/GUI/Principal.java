/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;

/**
 *
 * @author miriam
 */
public  class Principal extends javax.swing.JFrame implements ActionListener  {

    /**
     * Creates new form Principal
     */
   
    private PanelVisualiza visualiza = new PanelVisualiza();
    private PanelAgregar agregar = new PanelAgregar();
    private PanelEditar editar = new PanelEditar();
   
    private int flagAgregar = 0, flagVisualizar = 1, flagEditar = 0; 
    
   
    
    public Principal() {
        
        initComponents();
        setSize(1100,600);
        setLocationRelativeTo(null);
        
        
         
         
        btnVisualizar.setBackground(new Color (0,160,255));
        Contenedor.add(visualiza);
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Opciones = new javax.swing.JPanel();
        btnVisualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestón de Alumnos");
        setResizable(false);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ContenedorComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                ContenedorComponentRemoved(evt);
            }
        });
        Contenedor.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                ContenedorHierarchyChanged(evt);
            }
        });
        Contenedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ContenedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                ContenedorAncestorRemoved(evt);
            }
        });
        Contenedor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ContenedorComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                ContenedorComponentMoved(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ContenedorComponentShown(evt);
            }
        });
        Contenedor.setLayout(new java.awt.BorderLayout());

        Opciones.setBackground(new java.awt.Color(1, 112, 250));
        Opciones.setPreferredSize(new java.awt.Dimension(320, 600));
        Opciones.setLayout(new javax.swing.BoxLayout(Opciones, javax.swing.BoxLayout.Y_AXIS));

        btnVisualizar.setBackground(new java.awt.Color(1, 112, 250));
        btnVisualizar.setFont(new java.awt.Font("Serif", 1, 60)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setMaximumSize(new java.awt.Dimension(320, 150));
        btnVisualizar.setMinimumSize(new java.awt.Dimension(320, 150));
        btnVisualizar.setPreferredSize(new java.awt.Dimension(320, 150));
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseExited(evt);
            }
        });
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        Opciones.add(btnVisualizar);

        btnAgregar.setBackground(new java.awt.Color(1, 112, 250));
        btnAgregar.setFont(new java.awt.Font("Serif", 1, 60)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(320, 150));
        btnAgregar.setMinimumSize(new java.awt.Dimension(320, 150));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Opciones.add(btnAgregar);

        btnEditar.setBackground(new java.awt.Color(1, 112, 250));
        btnEditar.setFont(new java.awt.Font("Serif", 1, 60)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(320, 150));
        btnEditar.setMinimumSize(new java.awt.Dimension(320, 150));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        Opciones.add(btnEditar);

        btncerrar.setBackground(new java.awt.Color(1, 112, 250));
        btncerrar.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar.setText("Cerrar Sesión");
        btncerrar.setMaximumSize(new java.awt.Dimension(350, 150));
        btncerrar.setMinimumSize(new java.awt.Dimension(350, 23));
        btncerrar.setPreferredSize(new java.awt.Dimension(350, 23));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncerrarMouseExited(evt);
            }
        });
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        Opciones.add(btncerrar);

        Contenedor.add(Opciones, java.awt.BorderLayout.LINE_START);

        getContentPane().add(Contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
       //------------  Animacion ------------------------------------------- 
       flagAgregar = 0;
       flagVisualizar = 1;
       flagEditar = 0;
       btnEditar.setBackground(new Color(1,112,250));
       btnAgregar.setBackground(new Color(1,112,250));
       //------------------------------------------------------------------
       visualiza.setVisible(true);
       agregar.setVisible(false);
       editar.setVisible(false);
       Contenedor.add(visualiza);
       Contenedor.validate();
       visualiza.listallena();
       visualiza.noSelec();
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnVisualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseEntered
        if(flagVisualizar == 0)
        {
            btnVisualizar.setBackground(new Color(0,160,255));
        }
    }//GEN-LAST:event_btnVisualizarMouseEntered

    private void btnVisualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseExited
        if(flagVisualizar == 0) 
        {
            btnVisualizar.setBackground(new Color(1,112,250));
        }
    }//GEN-LAST:event_btnVisualizarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
       if(flagAgregar==0)
       {
           btnAgregar.setBackground(new Color(0,160,255));
       }
        
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        if(flagAgregar==0)
        {
            btnAgregar.setBackground(new Color(1,112,250));
        }
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        if(flagEditar == 0)
        {
           btnEditar.setBackground(new Color(0,160,255)); 
        }
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        if(flagEditar == 0)
        {
            btnEditar.setBackground(new Color(1,112,250));
        }
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //-------------   Animacion --------------------------------------------
        flagAgregar = 1;
        flagVisualizar = 0;
        flagEditar = 0;
        btnVisualizar.setBackground(new Color(1,112,250));
        btnEditar.setBackground(new Color(1,112,250));
        //----------------------------------------------------------------------
        visualiza.setVisible(false);
        agregar.setVisible(true);
        editar.setVisible(false);
        
        Contenedor.add(agregar);
        Contenedor.validate();
        
        agregar.limpia();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEdita();
    }//GEN-LAST:event_btnEditarActionPerformed

    
    private void ContenedorComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ContenedorComponentRemoved
        // TODO add your handling code here:
       /*System.out.println(evt.getComponent().getClass().getName() + " --- ");
        if(visualiza.isVisible())
        {
            System.out.println("muestra");
        }
        else
        {
            System.out.println("oculto");
        }*/
    }//GEN-LAST:event_ContenedorComponentRemoved

    private void ContenedorComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ContenedorComponentHidden
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ContenedorComponentHidden
    
    private void ContenedorHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_ContenedorHierarchyChanged
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_ContenedorHierarchyChanged

    private void ContenedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ContenedorAncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ContenedorAncestorAdded

    private void ContenedorAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ContenedorAncestorRemoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ContenedorAncestorRemoved

    private void ContenedorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ContenedorComponentAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ContenedorComponentAdded

    private void ContenedorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ContenedorComponentShown
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ContenedorComponentShown

    private void ContenedorComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ContenedorComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ContenedorComponentMoved

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered
        // TODO add your handling code here:
        btncerrar.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_btncerrarMouseEntered

    private void btncerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseExited
        // TODO add your handling code here:
        btncerrar.setBackground(new Color(1,112,250));
    }//GEN-LAST:event_btncerrarMouseExited

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
         InicioSesion back = new InicioSesion();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

 
    public void btnEdita()
    {
        
        //-------------- Animacion  --------------------------------------------
        flagEditar = 1;
        flagVisualizar = 0;
        flagAgregar = 0;
        btnVisualizar.setBackground(new Color(1,112,250));
        btnAgregar.setBackground(new Color(1,112,250));
        //----------------------------------------------------------------------
        editar.setVisible(true);
        agregar.setVisible(false);
        visualiza.setVisible(false);
        
        Contenedor.add(editar);
        Contenedor.validate();
        
       
    }
       
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Opciones;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btncerrar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
    }
    
}
