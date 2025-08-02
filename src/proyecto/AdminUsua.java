
package proyecto;

import java.awt.Color;


public class AdminUsua extends javax.swing.JFrame {

   
    public AdminUsua() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        J4 = new javax.swing.JLabel();
        J5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Administrar Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        J2.setFont(new java.awt.Font("Arial Narrow", 0, 48)); // NOI18N
        J2.setForeground(new java.awt.Color(255, 255, 255));
        J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J2.setText("Eliminar");
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
        jPanel1.add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 190, 80));

        J4.setFont(new java.awt.Font("Arial Narrow", 0, 48)); // NOI18N
        J4.setForeground(new java.awt.Color(255, 255, 255));
        J4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J4.setText("Modificar");
        J4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J4MouseExited(evt);
            }
        });
        jPanel1.add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 190, 80));

        J5.setFont(new java.awt.Font("Arial Narrow", 0, 48)); // NOI18N
        J5.setForeground(new java.awt.Color(255, 255, 255));
        J5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J5.setText("Regresar");
        J5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J5MouseExited(evt);
            }
        });
        jPanel1.add(J5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseEntered
        J2.setForeground(Color.yellow);
    }//GEN-LAST:event_J2MouseEntered

    private void J2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseExited
         J2.setForeground(Color.white);
    }//GEN-LAST:event_J2MouseExited

    private void J2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseClicked
             ElimiUs eu = new ElimiUs();
     eu.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_J2MouseClicked

    private void J4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseClicked
             ModifUs mu = new ModifUs();
        mu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_J4MouseClicked

    private void J4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseEntered
         J4.setForeground(Color.yellow);
    }//GEN-LAST:event_J4MouseEntered

    private void J4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseExited
         J4.setForeground(Color.white);
    }//GEN-LAST:event_J4MouseExited

    private void J5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseClicked
               EmpleadosPri ep = new EmpleadosPri();
        ep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_J5MouseClicked

    private void J5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseEntered
         J5.setForeground(Color.yellow);
    }//GEN-LAST:event_J5MouseEntered

    private void J5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseExited
         J5.setForeground(Color.white);
    }//GEN-LAST:event_J5MouseExited

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUsua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
