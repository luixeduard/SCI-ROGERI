/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author luix_
 */
public class ventanaFeed extends javax.swing.JDialog {

    private static Font fuenteSans18P = new Font("Open Sans", Font.PLAIN,18);
    private static Font fuenteSans12P = new Font("Open Sans", Font.PLAIN,12);
    
    /**
     * Creates new form correctAddProduct
     */
    public ventanaFeed(java.awt.Frame parent, boolean modal, String text) {
        super(parent, modal);
        initComponents();
        texto.setText(text);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new JPanelGradient(Color.WHITE, new Color(25, 30, 111,53));
        jButton1 = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(25, 30, 111));
        jButton1.setFont(fuenteSans18P);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, 40));

        texto.setFont(fuenteSans18P);
        texto.setForeground(new java.awt.Color(43, 43, 43));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 360, 50));
        Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
