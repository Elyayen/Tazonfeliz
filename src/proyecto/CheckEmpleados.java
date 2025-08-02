package proyecto;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CheckEmpleados extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    String id, nomem, tel, dic, cor, curp;
    int table;
    Empleados em = new Empleados();
    public CheckEmpleados() {
        initComponents();
        String[] titulo = new String[]{"Nombre del Empleado", "Telefono", "Direccion", "Correo", "CURP","ID"};
        dtm.setColumnIdentifiers(titulo);
        tabla.setModel(dtm);
        this.setLocationRelativeTo(null);
    }

    public void leer() {
        File sr = new File("Empleados.txt");
        try {
            Scanner leer = new Scanner(sr);
            while (leer.hasNextLine()) {
                String Linea = leer.nextLine();
                StringTokenizer chi = new StringTokenizer(Linea, ",");
                nomem = chi.nextToken().trim();
                tel = chi.nextToken().trim();
                dic = chi.nextToken().trim();
                cor = chi.nextToken().trim();
                curp = chi.nextToken().trim();
                id = chi.nextToken().trim();
                dtm.addRow(new Object[]{
                 nomem, tel, dic, cor, curp,id
                });
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtf1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf6 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        J1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        J3 = new javax.swing.JLabel();
        J4 = new javax.swing.JLabel();
        J5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del empleado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

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
        jPanel1.add(jtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 268, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 53, -1));

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
        jPanel1.add(jtf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 268, -1));

        jtf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf5KeyTyped(evt);
            }
        });
        jPanel1.add(jtf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 268, -1));

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
        jPanel1.add(jtf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 270, -1));

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
        jPanel1.add(jtf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 270, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 50, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 20, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CURP:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 40, -1));

        jtf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf4KeyReleased(evt);
            }
        });
        jPanel1.add(jtf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 268, -1));

        tabla.setBackground(new java.awt.Color(255, 102, 102));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 1108, 408));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empleados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, -1, -1));

        J1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        J1.setForeground(new java.awt.Color(255, 255, 255));
        J1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J1.setText("Ver");
        J1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                J1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                J1MouseExited(evt);
            }
        });
        jPanel1.add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, 30));

        J2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        J2.setForeground(new java.awt.Color(255, 255, 255));
        J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J2.setText("Editar");
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
        jPanel1.add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, 30));

        J3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        J3.setForeground(new java.awt.Color(255, 255, 255));
        J3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J3.setText("Dar de baja");
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
        jPanel1.add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, 30));

        J4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        J4.setForeground(new java.awt.Color(255, 255, 255));
        J4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J4.setText("Regresar");
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
        jPanel1.add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, 30));

        J5.setBackground(new java.awt.Color(0, 0, 0));
        J5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        J5.setForeground(new java.awt.Color(255, 255, 255));
        J5.setText("Menu Extra ¿");
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
        jPanel1.add(J5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 30));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        this.dtm=(DefaultTableModel)tabla.getModel();
        int seleccion=tabla.getSelectedRow();
        jtf1.setText(tabla.getValueAt(seleccion,0).toString());
        jtf2.setText(tabla.getValueAt(seleccion,1).toString());
        jtf3.setText(tabla.getValueAt(seleccion,2).toString());
        jtf4.setText(tabla.getValueAt(seleccion,3).toString());
        jtf5.setText(tabla.getValueAt(seleccion,4).toString());
        jtf6.setText(tabla.getValueAt(seleccion,5).toString());
        table=seleccion;
    }//GEN-LAST:event_tablaMouseClicked

    private void jtf4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf4KeyReleased

    }//GEN-LAST:event_jtf4KeyReleased

    private void jtf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf3KeyTyped

    }//GEN-LAST:event_jtf3KeyTyped

    private void jtf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf3KeyReleased

    }//GEN-LAST:event_jtf3KeyReleased

    private void jtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf3ActionPerformed

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

    private void jtf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf2KeyReleased

    }//GEN-LAST:event_jtf2KeyReleased

    private void jtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf2ActionPerformed

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

    private void jtf5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf5KeyReleased

    }//GEN-LAST:event_jtf5KeyReleased

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

    private void jtf6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf6KeyReleased

    }//GEN-LAST:event_jtf6KeyReleased

    private void jtf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf6ActionPerformed

    }//GEN-LAST:event_jtf6ActionPerformed

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

    private void jtf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf1KeyReleased

    }//GEN-LAST:event_jtf1KeyReleased

    private void jtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf1ActionPerformed

    }//GEN-LAST:event_jtf1ActionPerformed

    private void J1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseClicked
    leer();
    }//GEN-LAST:event_J1MouseClicked

    private void J2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseClicked
        String [] datos = new String[6];
        datos[0]=jtf1.getText();
        datos[1]=jtf2.getText();
        datos[2]=jtf3.getText();
        datos[3]=jtf4.getText();
        datos[4]=jtf5.getText();
        datos[5]=jtf6.getText();

        for(int k=0;k<tabla.getColumnCount();k++){
            tabla.setValueAt(datos[k], table, k);
        }

        try{
            String archivo = "Empleados.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0;i<tabla.getRowCount();i++){
                for(int j=0;j<tabla.getColumnCount();j++){
                    bw.write((String)(tabla.getValueAt(i, j)));
                    if(j<tabla.getColumnCount()-1){
                        bw.write(",");
                    }
                }
                bw.newLine();
            }
            bw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        JOptionPane.showMessageDialog(null,"!Registro Actualizado¡");
        jtf1.setText("");
        jtf2.setText("");
        jtf3.setText("");
        jtf4.setText("");
        jtf5.setText("");
        jtf6.setText("");
    }//GEN-LAST:event_J2MouseClicked

    private void J3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseClicked
     this.dtm = (DefaultTableModel) tabla.getModel();
        dtm.removeRow(tabla.getSelectedRow());
        try {
            String archivo = "Empleados.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < tabla.getRowCount(); i++) {
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                    bw.write((String) (tabla.getValueAt(i, j)));
                    if (j<tabla.getColumnCount()-1) {
                        bw.write(",");

                    }
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        JOptionPane.showMessageDialog(null,"!Registro Eliminado¡");
        jtf1.setText("");
        jtf2.setText("");
        jtf3.setText("");
        jtf4.setText("");
        jtf5.setText("");
        jtf6.setText("");
    }//GEN-LAST:event_J3MouseClicked

    private void J4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseClicked
          EmpleadosPri ep = new EmpleadosPri();
        ep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_J4MouseClicked

    private void J1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseEntered
      J1.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J1MouseEntered

    private void J1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseExited
      J1.setForeground(Color.white);
    }//GEN-LAST:event_J1MouseExited

    private void J2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseEntered
       J2.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J2MouseEntered

    private void J2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J2MouseExited
       J2.setForeground(Color.white);
    }//GEN-LAST:event_J2MouseExited

    private void J3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseEntered
         J3.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J3MouseEntered

    private void J3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J3MouseExited
        J3.setForeground(Color.white);
    }//GEN-LAST:event_J3MouseExited

    private void J4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseEntered
        J4.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J4MouseEntered

    private void J4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J4MouseExited
       J4.setForeground(Color.white);
    }//GEN-LAST:event_J4MouseExited

    private void J5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseClicked
        MenuConfig MC = new MenuConfig();
        MC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_J5MouseClicked

    private void J5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseEntered
        J5.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_J5MouseEntered

    private void J5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J5MouseExited
        J5.setForeground(Color.white);
    }//GEN-LAST:event_J5MouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    private javax.swing.JTextField jtf4;
    private javax.swing.JTextField jtf5;
    private javax.swing.JTextField jtf6;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
