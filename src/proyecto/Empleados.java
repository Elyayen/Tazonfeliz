package proyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Empleados extends javax.swing.JFrame {

    public static String datos;

    public Empleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton1.setEnabled(false);

    }

    public void habilitar() {
        if (!jtf1.getText().isEmpty() && !jtf2.getText().isEmpty() && !jtf3.getText().isEmpty() && !jtf4.getText().isEmpty() && !jtf5.getText().isEmpty()&& !jtf6.getText().isEmpty()) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
            
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jtf6 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jtf4 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 400, 170, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 170, -1));

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, -1, -1));

        jtf6.setBorder(null);
        jtf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf6ActionPerformed(evt);
            }
        });
        jtf6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf6KeyTyped(evt);
            }
        });
        jPanel1.add(jtf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 482, 370, 40));

        jtf5.setBorder(null);
        jtf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf5KeyTyped(evt);
            }
        });
        jPanel1.add(jtf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 412, 380, 40));

        jtf4.setBorder(null);
        jtf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf4KeyReleased(evt);
            }
        });
        jPanel1.add(jtf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 342, 380, 40));

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
        jPanel1.add(jtf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 272, 380, 40));

        jtf2.setBorder(null);
        jtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf2ActionPerformed(evt);
            }
        });
        jtf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf2KeyTyped(evt);
            }
        });
        jPanel1.add(jtf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 192, 380, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setToolTipText("");
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 380, 3));

        jtf1.setBorder(null);
        jtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf1ActionPerformed(evt);
            }
        });
        jtf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf1KeyTyped(evt);
            }
        });
        jPanel1.add(jtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 380, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Por favor ingresa los siguentes datos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del empleado:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CURP:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 920));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setToolTipText("");
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 380, 4));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setToolTipText("");
        jLabel10.setOpaque(true);
        jLabel10.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 380, 4));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setToolTipText("");
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 380, 4));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setToolTipText("");
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 380, 4));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setToolTipText("");
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 380, 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            fichero();
        } catch (IOException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }

       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String vaciar = "";

        jtf1.setText(vaciar);
        jtf2.setText(vaciar);
        jtf3.setText(vaciar);
        jtf4.setText(vaciar);
        jtf5.setText(vaciar);
        jtf6.setText(vaciar);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        EmpleadosPri pr = new EmpleadosPri();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf1KeyReleased
       habilitar();
    }//GEN-LAST:event_jtf1KeyReleased

    private void jtf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf2KeyReleased
        habilitar();
    }//GEN-LAST:event_jtf2KeyReleased

    private void jtf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf3KeyReleased
        habilitar();
    }//GEN-LAST:event_jtf3KeyReleased

    private void jtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf1ActionPerformed

    private void jtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf2ActionPerformed

    private void jtf4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf4KeyReleased
       habilitar();
    }//GEN-LAST:event_jtf4KeyReleased

    private void jtf5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf5KeyReleased
        habilitar();
    }//GEN-LAST:event_jtf5KeyReleased

    private void jtf5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf5KeyTyped
       char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A')|c>'Z' && (c<'0')|c>'9'){
         evt.consume();
        }
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
        
        
        if (jtf5.getText().length() == 18) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtf5KeyTyped

    private void jtf6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf6KeyReleased
        habilitar();
    }//GEN-LAST:event_jtf6KeyReleased

    private void jtf6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf6KeyTyped
       char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A')|c>'Z' && (c<'0')|c>'9'){
         evt.consume();
        }
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
        
        
        if (jtf6.getText().length() >= 4) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtf6KeyTyped

    private void jtf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf6ActionPerformed
           habilitar();
    }//GEN-LAST:event_jtf6ActionPerformed

    private void jtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf3ActionPerformed
    public void fichero() throws IOException {

        File fl = new File("Empleados.txt");

        try {
            FileWriter crear = new FileWriter(fl, true);
            PrintWriter escribir = new PrintWriter(crear); //escribir en el fichero
            String linea = "", nom = "", num = "", dic = "", cor = "", curp = "",id="";
            int lon = jtf1.getText().length();
            if (lon != 0) {
                nom += jtf1.getText() + ",";
                num += jtf2.getText() + ",";
                dic += jtf3.getText() + ",";
                cor += jtf4.getText() + ",";
                curp += jtf5.getText()+",";
                id+=jtf6.getText();
                

                escribir.println(nom + num + dic + cor + curp+ id);
                crear.close();
                JOptionPane.showMessageDialog(rootPane, "¡ Su registro se completo !");
            }
        } catch (IOException e) {

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Empleados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    private javax.swing.JTextField jtf4;
    private javax.swing.JTextField jtf5;
    private javax.swing.JTextField jtf6;
    // End of variables declaration//GEN-END:variables
}
