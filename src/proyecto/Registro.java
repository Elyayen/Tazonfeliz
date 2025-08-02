package proyecto;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public static String datos;

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton1.setEnabled(false);

    }

    public void habilitar() {
        if (!jtf1.getText().isEmpty() && !jtf2.getText().isEmpty() && !jtf3.getText().isEmpty()) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf2 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf1.setBackground(new java.awt.Color(255, 255, 204));
        jtf1.setBorder(null);
        jtf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf1KeyTyped(evt);
            }
        });
        jPanel2.add(jtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 172, 420, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Nombre de usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jtf2.setBackground(new java.awt.Color(255, 255, 204));
        jtf2.setBorder(null);
        jtf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf2KeyTyped(evt);
            }
        });
        jPanel2.add(jtf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 420, 40));

        jtf3.setBackground(new java.awt.Color(255, 255, 204));
        jtf3.setBorder(null);
        jtf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf3ActionPerformed(evt);
            }
        });
        jtf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf3KeyTyped(evt);
            }
        });
        jPanel2.add(jtf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 410, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Dirección:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 160, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 170, 50));

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, 50));

        jButton4.setBackground(new java.awt.Color(153, 0, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Telefono:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 160, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 420, 2));
        jPanel3.getAccessibleContext().setAccessibleName("");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 420, 4));
        jPanel4.getAccessibleContext().setAccessibleName("");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 420, 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Por favor ingresa los siguentes datos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 950, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf2KeyTyped
        char letra = evt.getKeyChar();
        if (!(Character.isDigit(letra))) {
            evt.consume();
            getToolkit().beep();
        }
        if (jtf2.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtf2KeyTyped

    private void jtf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf1KeyTyped
        char letra = evt.getKeyChar();
        if (!(Character.isLetter(letra))) {
            evt.consume();
            getToolkit().beep();
        }
        if (jtf1.getText().length() > 40) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtf1KeyTyped

    private void jtf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf3KeyTyped

    }//GEN-LAST:event_jtf3KeyTyped

    private void jtf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf1KeyReleased
       habilitar();
    }//GEN-LAST:event_jtf1KeyReleased

    private void jtf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf2KeyReleased
        habilitar();
    }//GEN-LAST:event_jtf2KeyReleased

    private void jtf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf3KeyReleased
        habilitar();
    }//GEN-LAST:event_jtf3KeyReleased

    private void jtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Comienzo cm = new Comienzo();
cm.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String s="";
jtf1.setText(s);
jtf2.setText(s);
jtf3.setText(s);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            fichero();
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        DIFMENUS fd= new DIFMENUS();
        fd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static String noom;
    public static String diic;
    public void fichero() throws IOException {

        File fl = new File("Registro.txt");

        try {
            FileWriter crear = new FileWriter(fl, true);
            PrintWriter escribir = new PrintWriter(crear); //escribir en el fichero
            String nom = "", num = "", dic = "";
            int lon = jtf1.getText().length();
            if (lon != 0) {
                nom += jtf1.getText() + ",";
                num += jtf2.getText() + ",";
                dic += jtf3.getText();
                noom=nom;
                diic=dic;
                escribir.println(nom + num + dic);
                crear.close();
                JOptionPane.showMessageDialog(rootPane, "¡ Su registro se completo !");
            }
        } catch (IOException e) {

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    // End of variables declaration//GEN-END:variables
}
