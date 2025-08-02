
package proyecto;

import java.awt.Color;
import java.io.File;
import proyecto.EmpleadosPri;
import proyecto.Pro;


public class Comienzo extends javax.swing.JFrame {

    
    public Comienzo() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        J2 = new javax.swing.JLabel();
        J3 = new javax.swing.JLabel();
        J5 = new javax.swing.JLabel();
        J6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tazo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chi.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 200, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("El Tazón Feliz los saluda");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 153));
        jLabel4.setText("Selecciona una opción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 450));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 200, 450));

        J2.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J2.setText("Usuario");
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
        jPanel1.add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 540, 90));

        J3.setFont(new java.awt.Font("Tahoma", 2, 40)); // NOI18N
        J3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J3.setText("Pertenecer a nuestro equipo");
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
        jPanel1.add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 550, 100));

        J5.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        J5.setForeground(new java.awt.Color(255, 255, 255));
        J5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J5.setText("->");
        jPanel1.add(J5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 80, 60));

        J6.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        J6.setForeground(new java.awt.Color(255, 255, 255));
        J6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J6.setText("->");
        jPanel1.add(J6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseClicked
                Pro pr = new Pro();
        pr.setVisible(true);
        this.setVisible(false);
        
        try{
            File archivo1 = new File("PedidoComi.txt");
            archivo1.delete();
            File archivo2 = new File("cuentacomi.txt");
            archivo2.delete();
            File archivo3 = new File("cuentabebi.txt");
            archivo3.delete();
            File archivo4 = new File("Pedidobebi.txt");
            archivo4.delete();
            File archivo5 = new File("cuentapos.txt");
            archivo5.delete();
            File archivo6 = new File("cuentades.txt");
            archivo6.delete();
            File archivo7 = new File("Pedidodes.txt");
            archivo7.delete();
            File archivo8 = new File("Pedidopos.txt");
            archivo8.delete();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_J2MouseClicked

    private void J2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseEntered
       J2.setForeground(new Color(102,102,255));
       J5.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_J2MouseEntered

    private void J2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseExited
       J2.setForeground(Color.black);
       J5.setForeground(Color.white);
    }//GEN-LAST:event_J2MouseExited

    private void J3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseClicked
          EmpleadosPri em = new EmpleadosPri();
        em.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_J3MouseClicked

    private void J3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseEntered
       J3.setForeground(new Color(102,102,255));
       J6.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_J3MouseEntered

    private void J3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseExited
        J3.setForeground(Color.black);
        J6.setForeground(Color.WHITE);
    }//GEN-LAST:event_J3MouseExited

    
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
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comienzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel J6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
