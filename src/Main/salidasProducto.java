/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luix_
 */
public class salidasProducto extends javax.swing.JDialog {

    private static Font fuenteSans16P = new Font("Open Sans", Font.PLAIN,16);
    private static Font fuenteSans12P = new Font("Open Sans", Font.PLAIN,12);
    private static Font fuenteSans12B = new Font("Open Sans", Font.BOLD,12);
    private static Color gris = new Color(120,120,120);
    private static Color azulF = new Color(25,30,111);
    private static String claveProducto;
    private static String usuario;
    Connection con;
    int cantidadS;
    int cantidadD;
    float precioP;
    
    /**
     * Creates new form correctAddProduct
     */
    public salidasProducto(java.awt.Frame parent, boolean modal, String clave, Connection cone, String user, float precio, int cantidadDisp) {
        super(parent, modal);
        initComponents();
        jpColor jpVista = new jpColor(Color.WHITE,new Color(25, 30, 111,53));
        jpVista.setSize(this.getSize());
        Backgroud.add(jpVista);
        setLocationRelativeTo(null);
        claveProducto=clave;
        con=cone;
        usuario=user;
        precioP=precio;
        cantidadD=cantidadDisp;
        GhostText ghostText = new GhostText(detalles, "Opcional: Detalles de la salida del producto");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backgroud = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menosCantidad = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        masCantidad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        noNotaTF = new javax.swing.JTextField();
        receptorTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        detalles = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 30, 111)));
        Panel.setOpaque(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(fuenteSans16P);
        jLabel3.setForeground(new java.awt.Color(43, 43, 43));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad a restar");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 430, 20));
        Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 30, 420, -1));

        menosCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menos.png"))); // NOI18N
        menosCantidad.setBorderPainted(false);
        menosCantidad.setContentAreaFilled(false);
        menosCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosCantidadActionPerformed(evt);
            }
        });
        Panel.add(menosCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, 40));

        cantidad.setFont(fuenteSans12P);
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("0");
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMouseClicked(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        Panel.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, 40));

        masCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mas.png"))); // NOI18N
        masCantidad.setBorderPainted(false);
        masCantidad.setContentAreaFilled(false);
        masCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masCantidadActionPerformed(evt);
            }
        });
        Panel.add(masCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 40, 40));

        jLabel2.setFont(fuenteSans12B);
        jLabel2.setForeground(new java.awt.Color(25, 30, 111));
        jLabel2.setText("*Numero de nota:");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        noNotaTF.setFont(fuenteSans12P);
        noNotaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noNotaTFKeyReleased(evt);
            }
        });
        Panel.add(noNotaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 390, 30));

        receptorTF.setFont(fuenteSans12P);
        receptorTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                receptorTFKeyReleased(evt);
            }
        });
        Panel.add(receptorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 390, 30));

        jLabel4.setFont(fuenteSans12B);
        jLabel4.setForeground(new java.awt.Color(25, 30, 111));
        jLabel4.setText("*Receptor:");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, -1));

        detalles.setFont(fuenteSans12P);
        Panel.add(detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 390, 90));

        Aceptar.setBackground(new java.awt.Color(120, 120, 120));
        Aceptar.setFont(fuenteSans12P);
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setText("Aceptar");
        Aceptar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Aceptar.setContentAreaFilled(false);
        Aceptar.setEnabled(false);
        Aceptar.setOpaque(true);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        Panel.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 40));

        Cancelar.setBackground(new java.awt.Color(25, 30, 111));
        Cancelar.setFont(fuenteSans12P);
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Cancelar.setContentAreaFilled(false);
        Cancelar.setOpaque(true);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        Panel.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 100, 40));

        javax.swing.GroupLayout BackgroudLayout = new javax.swing.GroupLayout(Backgroud);
        Backgroud.setLayout(BackgroudLayout);
        BackgroudLayout.setHorizontalGroup(
            BackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroudLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroudLayout.setVerticalGroup(
            BackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        cantidadS=Integer.parseInt(cantidad.getText());
        String detal;
        String noNota = noNotaTF.getText();
        String receptor = receptorTF.getText();
        Date f = new Date();
        DateFormat DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = DF.format(f);
        if(detalles.getText().compareToIgnoreCase("Opcional: Detalles de la salida del producto")!=0){
            detal = detalles.getText();
        }
        else{
            detal = "";
        }
        if(cantidadS>0){
            try {
                cantidadS=cantidadS*-1;
                float total = cantidadS*precioP;
                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO registro values(null,'"+fecha+"',"+cantidadS+","+total+",'"+detal+"','"+noNota+"','"+receptor+"','"+usuario+"','"+claveProducto+"')");
            } catch (SQLException ex) {
                Logger.getLogger(salidasProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.dispose();
    }//GEN-LAST:event_AceptarActionPerformed

    private void menosCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosCantidadActionPerformed
        int u = Integer.parseInt(cantidad.getText());
        String aux2 = noNotaTF.getText();
        if(u>0){
            u-=1;
            cantidad.setText(u+"");
        }
        if(u>0 && aux2.length()>0){
            Aceptar.setEnabled(true);
            Aceptar.setBackground(azulF);
        }else{
            Aceptar.setEnabled(false);
            Aceptar.setBackground(gris);
        }
    }//GEN-LAST:event_menosCantidadActionPerformed

    private void masCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masCantidadActionPerformed
        int u = Integer.parseInt(cantidad.getText());
        String aux2 = noNotaTF.getText();
        if(u<cantidadD){
            u+=1;
        }
        if(aux2.length()>0 && u>0){
            Aceptar.setEnabled(true);
            Aceptar.setBackground(azulF);
        }else{
            Aceptar.setEnabled(false);
            Aceptar.setBackground(gris);
        }
        cantidad.setText(u+"");
    }//GEN-LAST:event_masCantidadActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        int c = evt.getKeyChar();
        if(!(c>47 && c<58)){
           evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased
        if(cantidad.getText().length()>0){
            if(cantidad.getText().length()!=0){
                if(Integer.parseInt(cantidad.getText())>cantidadD){
                    cantidad.setText(cantidadD+"");
                }
            }
            String aux = cantidad.getText();
            if(aux!=null && aux.length()>0){
                int u = Integer.parseInt(aux);
                cantidad.setText(u+"");
                cantidad.setCaretPosition(cantidad.getText().length());
                String aux2 = noNotaTF.getText();
                String aux3 = receptorTF.getText();
                if(aux2.length()>0 && aux3.length()>0 && u>0){
                    Aceptar.setEnabled(true);
                    Aceptar.setBackground(azulF);
                }else{
                    Aceptar.setEnabled(false);
                    Aceptar.setBackground(gris);
                }
            }
        }else{
            if(!cantidad.isFocusOwner())
                cantidad.setText("0");
        }
    }//GEN-LAST:event_cantidadKeyReleased

    private void noNotaTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noNotaTFKeyReleased
        if(cantidad.getText().length()!=0){
            if(Integer.parseInt(cantidad.getText())>cantidadD){
                cantidad.setText(cantidadD+"");
            }
        }
        String aux = cantidad.getText();
        if(aux!=null && aux.length()>0){
            int u = Integer.parseInt(aux);
            String aux2 = noNotaTF.getText();
            String aux3 = receptorTF.getText();
            if(aux2.length()>0 && aux3.length()>0 && u>0){
                Aceptar.setEnabled(true);
                Aceptar.setBackground(azulF);
            }else{
                Aceptar.setEnabled(false);
                Aceptar.setBackground(gris);
            }
        }
    }//GEN-LAST:event_noNotaTFKeyReleased

    private void receptorTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_receptorTFKeyReleased
        if(cantidad.getText().length()!=0){
            if(Integer.parseInt(cantidad.getText())>cantidadD){
                cantidad.setText(cantidadD+"");
            }
        }
        String aux = cantidad.getText();
        if(aux!=null && aux.length()>0){
            int u = Integer.parseInt(aux);
            String aux2 = noNotaTF.getText();
            String aux3 = receptorTF.getText();
            if(aux2.length()>0 && aux3.length()>0 && u>0){
                Aceptar.setEnabled(true);
                Aceptar.setBackground(azulF);
            }else{
                Aceptar.setEnabled(false);
                Aceptar.setBackground(gris);
            }
        }
    }//GEN-LAST:event_receptorTFKeyReleased

    private void cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseClicked
        if(cantidad.getText().length()>0 && (cantidad.getSelectedText()==null || cantidad.getSelectedText().length()==0)){
            cantidad.selectAll();
        }
    }//GEN-LAST:event_cantidadMouseClicked

    public int getCantidadI() {
        return cantidadS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JPanel Backgroud;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField detalles;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton masCantidad;
    private javax.swing.JButton menosCantidad;
    private javax.swing.JTextField noNotaTF;
    private javax.swing.JTextField receptorTF;
    // End of variables declaration//GEN-END:variables
}
