/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.proyectoventas.vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class VistaAgregar extends javax.swing.JFrame {

    /**
     * Creates new form VistaAgregar
     */
    public VistaAgregar() {
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

        jPanel1 = new javax.swing.JPanel();
        TituloAgregar = new javax.swing.JLabel();
        codigoProducto = new javax.swing.JTextField();
        nombreProducto = new javax.swing.JTextField();
        descripcionProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonGuardarProducto = new javax.swing.JButton();
        msgError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setToolTipText("");

        TituloAgregar.setFont(new java.awt.Font("Ancizar Sans", 1, 24)); // NOI18N
        TituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloAgregar.setText("Adicionar registros a la BD");
        TituloAgregar.setFocusable(false);
        TituloAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        codigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProductoActionPerformed(evt);
            }
        });

        nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProductoActionPerformed(evt);
            }
        });

        precioProducto.setToolTipText("");
        precioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioProductoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ancizar Serif", 0, 18)); // NOI18N
        jLabel2.setText("Código Producto");

        jLabel3.setFont(new java.awt.Font("Ancizar Serif", 0, 18)); // NOI18N
        jLabel3.setText("Nombre Producto");

        jLabel4.setFont(new java.awt.Font("Ancizar Serif", 0, 18)); // NOI18N
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("Ancizar Sans", 0, 18)); // NOI18N
        jLabel5.setText("Precio");

        botonGuardarProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonGuardarProducto.setText("Guardar registro");

        msgError.setFont(new java.awt.Font("Ancizar Sans", 0, 18)); // NOI18N
        msgError.setForeground(new java.awt.Color(255, 51, 51));
        msgError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(codigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(nombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(descripcionProducto)
                                    .addComponent(precioProducto)))
                            .addComponent(msgError, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(botonGuardarProducto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(TituloAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloAgregar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(botonGuardarProducto)
                .addGap(18, 18, 18)
                .addComponent(msgError, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProductoActionPerformed

    private void precioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioProductoActionPerformed

    private void nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProductoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloAgregar;
    private javax.swing.JButton botonGuardarProducto;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField descripcionProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msgError;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioProducto;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonGuardarProducto() {
        return botonGuardarProducto;
    }

    public void setBotonGuardarProducto(JButton botonGuardarProducto) {
        this.botonGuardarProducto = botonGuardarProducto;
    }

    public JTextField getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(JTextField codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public JTextField getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(JTextField descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public JLabel getMsgError() {
        return msgError;
    }

    public void setMsgError(JLabel msgError) {
        this.msgError = msgError;
    }

    public JTextField getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(JTextField nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public JTextField getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(JTextField precioProducto) {
        this.precioProducto = precioProducto;
    }
    


}