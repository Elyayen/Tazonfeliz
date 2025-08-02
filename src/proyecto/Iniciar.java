
package proyecto;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Iniciar extends javax.swing.JFrame {

    
    public Iniciar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        J1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        J3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        J4 = new javax.swing.JLabel();
        J5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(944, 820));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel3.setText("Nombre de usuario:");

        J1.setBackground(new java.awt.Color(255, 102, 102));
        J1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        J1.setBorder(null);
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Por favor ingrese su nombre:");

        J2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J2.setText("Regresar");
        J2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J2MouseExited(evt);
            }
        });

        J3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        J3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J3.setText("Iniciar Sesion");
        J3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J3MouseExited(evt);
            }
        });

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
            .addGap(0, 4, Short.MAX_VALUE)
        );

        J4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        J4.setForeground(new java.awt.Color(255, 102, 102));
        J4.setText("<-");

        J5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        J5.setForeground(new java.awt.Color(255, 102, 102));
        J5.setText("->");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(J4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(J1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J2)
                    .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J4)
                    .addComponent(J5))
                .addContainerGap(361, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 740, 810));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

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

    private void J3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseExited
        J3.setForeground(Color.black);
        J5.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J3MouseExited

    private void J3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseEntered
        J3.setForeground(Color.yellow);
        J5.setForeground(Color.yellow);
    }//GEN-LAST:event_J3MouseEntered

    private void J3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseClicked
        
        ini();
    }//GEN-LAST:event_J3MouseClicked

    private void J2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseExited
        J2.setForeground(Color.BLACK);
        J4.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J2MouseExited

    private void J2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseEntered
        J2.setForeground(Color.yellow);
        J4.setForeground(Color.yellow);
    }//GEN-LAST:event_J2MouseEntered

    private void J2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseClicked
        this.setVisible(false);
        Pro pr = new Pro();
        pr.setVisible(true);
    }//GEN-LAST:event_J2MouseClicked

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J1ActionPerformed
 public static String usuario;
 public static String direccio;
    public String ini(){
usuario= J1.getText();
    try {  
          File flwriter = new File("Registro.txt");
          Scanner leer_archivo;
          leer_archivo = new Scanner(flwriter);
          while(leer_archivo.hasNextLine()){
             String Linea_archivo = leer_archivo.nextLine();
             StringTokenizer mistokens = new StringTokenizer(Linea_archivo, ",");
             String nombre = mistokens.nextToken().trim();           
             String numero = mistokens.nextToken().trim();
             String direccion = mistokens.nextToken().trim();
             
            if(usuario.equals(nombre)){
                direccio=direccion;
                 JOptionPane.showMessageDialog(rootPane,"¡ Usuario Encontrado !");
                 DIFMENUS mn = new DIFMENUS();
                 mn.setVisible(true);
                 this.setVisible(false);
                 }           
          }    
       } 
     catch (IOException e) { 
         }
    return usuario;
}
    
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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Iniciar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J1;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
