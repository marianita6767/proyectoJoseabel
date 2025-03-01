/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import RSMaterialComponent.RSComboBoxMaterial;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ZenBook
 */
public class nuevoMateriales extends javax.swing.JDialog {
        private materiales panelMateriales;

    /**
     * Creates new form nuevoMateriales
     */
    public nuevoMateriales(java.awt.Frame parent, boolean panelMateriales) {
        super(parent, "Agregar Material", true);
    
        
        initComponents();
        
        setLayout(new GridLayout(9, 2, 5, 5));
        
                // Campos de entrada
        add(new JLabel("Código:"));
        txtCodigo = new RSMaterialComponent.RSTextFieldMaterial();
        add(txtCodigo);

        add(new JLabel("Nombre:"));
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        add(txtNombre);

        add(new JLabel("Descripción:"));
        txtDescripcion = new RSMaterialComponent.RSTextFieldMaterial();
        add(txtDescripcion);

        add(new JLabel("Categoría:"));
        cmbCategoria = new RSMaterialComponent.RSComboBoxMaterial<>();
        add(cmbCategoria);

        add(new JLabel("Unidad de Medida:"));
        cmbUnidad = new RSMaterialComponent.RSComboBoxMaterial<>();
        add(cmbUnidad);

        add(new JLabel("Cantidad:"));
        txtCantidad = new RSMaterialComponent.RSTextFieldMaterial();
        add(txtCantidad);

        add(new JLabel("Proveedor:"));
        txtProveedor = new RSMaterialComponent.RSTextFieldMaterial();
        add(txtProveedor);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        txtProveedor = new RSMaterialComponent.RSTextFieldMaterial();
        txtCodigo = new RSMaterialComponent.RSTextFieldMaterial();
        cmbCategoria = new RSMaterialComponent.RSComboBoxMaterial();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        txtDescripcion = new RSMaterialComponent.RSTextFieldMaterial();
        cmbUnidad = new RSMaterialComponent.RSComboBoxMaterial();
        txtCantidad = new RSMaterialComponent.RSTextFieldMaterial();
        btnCancelar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        cmdPrueba = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 515));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 49, 82));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century751 BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar material");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Categoria:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Descripcion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Unidad de medida:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Cantidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Proveedor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up-arrow (1).png"))); // NOI18N
        rSButton1.setText(" Subir imagen");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 150, 30));

        txtProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtProveedor.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProveedor.setPhColor(new java.awt.Color(0, 0, 0));
        txtProveedor.setPlaceholder("Ingrese el proveedor...");
        txtProveedor.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 30));

        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigo.setPhColor(new java.awt.Color(0, 0, 0));
        txtCodigo.setPlaceholder("Ingrese el codigo...");
        txtCodigo.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        cmbCategoria.setColorMaterial(new java.awt.Color(0, 0, 0));
        cmbCategoria.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombre.setPlaceholder("Ingrese el nombre...");
        txtNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 200, 30));

        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setPhColor(new java.awt.Color(0, 0, 0));
        txtDescripcion.setPlaceholder("Ingrese el detalle...");
        txtDescripcion.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 30));

        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoría 1", "Categoría 2", "Categoría 3" }));
        cmbUnidad.setColorMaterial(new java.awt.Color(0, 0, 0));
        cmbUnidad.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        cmbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnidadActionPerformed(evt);
            }
        });
        jPanel1.add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 200, 30));

        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.setPhColor(new java.awt.Color(0, 0, 0));
        txtCantidad.setPlaceholder("Ingrese la cantidad...");
        txtCantidad.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 200, 30));

        btnCancelar.setBackground(new java.awt.Color(46, 49, 82));
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorHover(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Humnst777 BlkCn BT", 1, 14)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 140, -1));

        btnGuardar.setBackground(new java.awt.Color(46, 49, 82));
        btnGuardar.setText("Guardar");
        btnGuardar.setColorHover(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Humnst777 BlkCn BT", 1, 14)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 140, -1));

        cmdPrueba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmdPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cmbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUnidadActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    JPanel tarjeta = new JPanel();
    tarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    tarjeta.setBackground(new java.awt.Color(46, 49, 82));
    tarjeta.setPreferredSize(new java.awt.Dimension(200, 300));
    
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose(); // Cierra la ventana emergente
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevoMateriales dialog = new nuevoMateriales(new javax.swing.JFrame(), true);
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
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private RSMaterialComponent.RSComboBoxMaterial cmbCategoria;
    private RSMaterialComponent.RSComboBoxMaterial cmbUnidad;
    private javax.swing.JComboBox<String> cmdPrueba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSButton rSButton1;
    private RSMaterialComponent.RSTextFieldMaterial txtCantidad;
    private RSMaterialComponent.RSTextFieldMaterial txtCodigo;
    private RSMaterialComponent.RSTextFieldMaterial txtDescripcion;
    private RSMaterialComponent.RSTextFieldMaterial txtNombre;
    private RSMaterialComponent.RSTextFieldMaterial txtProveedor;
    // End of variables declaration//GEN-END:variables
}
