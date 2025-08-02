
package proyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Postres extends javax.swing.JFrame {
MenuConfig CON= new MenuConfig();

   int FC = 20; int PC = 20;   int FN = 20;   int PM = 20;   int GM = 20;   int GG = 20;   int RP = 20;
   int TQ = 20; int AL = 20;   int PL = 20;   int cero = 0;   int total = 0;
   int contador = 0, c = 0,o=0,na=0,t=0,a=0,d=0,O=0,r=0;
   public void pedido() throws IOException{
       jButton1.setEnabled(CON.PB1); 
  File fl= new File("Pedidopos.txt");
    FileWriter crear= new FileWriter(fl,false);
    PrintWriter escribir= new PrintWriter(crear);   
   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15;
   
n1=jlb1.getText();
n2=jlb2.getText();
n3=jlb3.getText();
n4=jlb4.getText();
n5=jlb5.getText();
n6=jlb6.getText();
n7=jlb7.getText();
n8=jlb8.getText();
n9=jlb9.getText();
n10=jlb10.getText();


if(n1!="0"){
     escribir.println("Fresas con Creama   "+n1);
   
}
  if(n2!="0"){
    escribir.println("Platanos con Crema   "+n2);
    
}  
  if(n3!="0"){
    escribir.println("Flan Napolitano  "+n3);
  
}
  if(n4!="0"){
    escribir.println("Pay de Manzana  "+n4);
  
}
  if(n5!="0"){
    escribir.println("Gelatina de Mosaico   "+n5);
   
}
  if(n6!="0"){
    escribir.println("Gelatina de galletas Maria  "+n6);
   
}
  if(n7!="0"){
    escribir.println("Torta de queso   "+n7);
   
}
  if(n8!="0"){
    escribir.println("Arroz con leche  "+n8);
 
}
  if(n9!="0"){
    escribir.println("Pay de limon  "+n9);
  
}
  if(n10!="0"){
    escribir.println("Pastel de chocolate     "+n10);
  
}
 crear.close();
}
   
   public void cuenta() throws IOException {
    File fl= new File("cuentapos.txt");
    FileWriter crear= new FileWriter(fl,false);
    PrintWriter escribir= new PrintWriter(crear); 
        int n1 = Integer.parseInt(jlb1.getText());
        int n2 = Integer.parseInt(jlb2.getText());
        int n3 = Integer.parseInt(jlb3.getText());
        int n4 = Integer.parseInt(jlb4.getText());
        int n5 = Integer.parseInt(jlb5.getText());
        int n6 = Integer.parseInt(jlb6.getText());
        int n7 = Integer.parseInt(jlb7.getText());
        int n8 = Integer.parseInt(jlb8.getText());
        int n9 = Integer.parseInt(jlb9.getText());
        int n10 = Integer.parseInt(jlb10.getText());
        

        total = n1 * FC + n2 * PC + n3 * FN + n4 * PM + n5 * GM + n6 * GG + n7 * RP + n8*TQ + n9*AL + n10*PL;
        String tota= String.valueOf(total);
        escribir.write(tota);
        escribir.close();
        
    }
   
    public Postres() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jlb6 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jlb7 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jlb8 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jlb10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlb1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jlb2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jlb3 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jlb9 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jlb5 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jlb4 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(2375, 1200));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/gelama.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 190, 200));

        jButton8.setText("<");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 840, -1, 30));

        jlb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb6.setText("0");
        jPanel1.add(jlb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 840, 20, -1));

        jButton19.setText(">");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 840, -1, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/payqueso.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 190, 200));

        jButton11.setText("<");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 840, -1, 30));

        jlb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb7.setText("0");
        jPanel1.add(jlb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 820, -1, 60));

        jButton16.setText(">");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 840, -1, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel22.setText("Torta de Queso");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel38.setText("$20");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel24.setText("Gelatina de Galletas Maria");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel39.setText("$20");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        jButton22.setText("Resetear");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 900, 266, 70));

        jButton23.setText("Hacer Pedido");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 900, 267, 70));

        jButton21.setText("Ver Menús");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 900, 266, 70));

        jButton9.setText("<");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 840, -1, 30));

        jlb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb8.setText("0");
        jPanel1.add(jlb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 830, -1, 60));

        jButton17.setText(">");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 840, -1, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel27.setText("Arroz con Leche");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/arrozle.png"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 190, 200));

        jButton20.setText(">");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 830, -1, 30));

        jlb10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb10.setText("0");
        jPanel1.add(jlb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 810, -1, 60));

        jButton7.setText("<");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 830, -1, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/paylim.png"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 190, 200));

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel28.setText("Pay de Limon");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel37.setText("$20");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, -1, 20));

        jButton1.setText("<");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        jlb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb1.setText("0");
        jPanel1.add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, 54));

        jButton2.setText(">");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/frescre.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, 195));

        jLabel30.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel30.setText("$20");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setText("Fresas con Crema");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel29.setText("$20");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setText("Platanos con Crema");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/platcre.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 190, 195));

        jButton4.setText("<");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        jlb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb2.setText("0");
        jPanel1.add(jlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, 54));

        jButton12.setText(">");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        jButton5.setText("<");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        jlb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb3.setText("0");
        jPanel1.add(jlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, 54));

        jButton13.setText(">");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/flannap.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 190, 195));

        jLabel32.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel32.setText("$20");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel25.setText("Flan Napolitano");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jButton10.setText("<");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 840, -1, -1));

        jlb9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb9.setText("0");
        jPanel1.add(jlb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 820, -1, 59));

        jButton18.setText(">");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 840, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel21.setText("Pastel de Chocolate");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/pastcho.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 190, 195));

        jLabel40.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel40.setText("$20");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 600, -1, 20));

        jLabel36.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel36.setText("$20");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, -1, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/payman.png"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 190, 195));

        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel26.setText("Pay de Manzana");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel31.setText("$20");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/gelamoi.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 190, 195));

        jLabel35.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel35.setText("$20");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, -1, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel23.setText("Gelatina de Mosaico");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, -1, -1));

        jButton3.setText("<");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 540, -1, -1));

        jlb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb5.setText("0");
        jPanel1.add(jlb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, -1, 54));

        jButton15.setText(">");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 540, -1, -1));

        jButton6.setText("<");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        jlb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb4.setText("0");
        jPanel1.add(jlb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 20, 54));

        jButton14.setText(">");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, -1, -1));

        jLabel34.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel34.setText("POSTRES");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 48));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel4.setText("MENÚ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chi.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tazo.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 810, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
contador++;
        String numero = String.valueOf(contador);
        jlb2.setText(numero);       
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        cero++;
        String numero = String.valueOf(cero);
        jlb1.setText(numero);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked
Descuentospos dp = new Descuentospos(); 
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
     try {
            cuenta();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pedido();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
           dp.descuento();
       } catch (IOException ex) {
           Logger.getLogger(Postres.class.getName()).log(Level.SEVERE, null, ex);
       }
        JOptionPane.showMessageDialog(null, "Pedido Realizado con Exito");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String n="0";
        jlb1.setText(n);
        jlb2.setText(n);
        jlb3.setText(n);
        jlb4.setText(n);
        jlb5.setText(n);
        jlb6.setText(n);
        jlb7.setText(n);
        jlb8.setText(n);
        jlb9.setText(n);
        jlb10.setText(n);
        cero=0;
        contador = 0;
        c = 0;
        o=0;
        na=0;
        t=0;
        a=0;
        d=0;
        O=0;r=0;
       
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       c++;
        String numero = String.valueOf(c);
        jlb3.setText(numero);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
     
        o++;
        String numero = String.valueOf(o);
        jlb4.setText(numero);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       na++;
        String numero = String.valueOf(na);
        jlb5.setText(numero);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        t++;
        String numero = String.valueOf(t);
        jlb6.setText(numero);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
      a++;
        String numero = String.valueOf(a);
        jlb7.setText(numero);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       d++;
        String numero = String.valueOf(d);
        jlb8.setText(numero);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        O++;
        String numero = String.valueOf(O);
        jlb9.setText(numero);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    r++;
        String numero = String.valueOf(r);
        jlb10.setText(numero);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   cero--;
        if (cero < 0) {
            evt.consume();
            cero = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cero);

        jlb1.setText(numero);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       contador--;
        if (contador < 0) {
            evt.consume();
            contador = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(contador);

        jlb2.setText(numero);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        c--;
        if (c < 0) {
            evt.consume();
            c = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(c);

        jlb3.setText(numero);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
         o--;
        if (o < 0) {
            evt.consume();
            o = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(o);

        jlb4.setText(numero);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
     na--;
        if (na < 0) {
            evt.consume();
            na = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(na);

        jlb5.setText(numero);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
      t--;
        if (t < 0) {
            evt.consume();
            t = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(t);

        jlb6.setText(numero);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
       a--;
        if (a < 0) {
            evt.consume();
            a = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(a);

        jlb7.setText(numero);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
         d--;
        if (d < 0) {
            evt.consume();
            d = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(d);

        jlb8.setText(numero);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
       O--;
        if (O < 0) {
            evt.consume();
            O = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(O);

        jlb9.setText(numero);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
         r--;
        if (r < 0) {
            evt.consume();
            r = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(r);

        jlb10.setText(numero);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        DIFMENUS df = new DIFMENUS();
        df.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
       jButton1.setEnabled(CON.PP1); 
       jButton2.setEnabled(CON.PP1);
              jButton4.setEnabled(CON.PP2); 
       jButton12.setEnabled(CON.PP2);
              jButton5.setEnabled(CON.PP3); 
       jButton13.setEnabled(CON.PP3);
              jButton6.setEnabled(CON.PP4); 
       jButton14.setEnabled(CON.PP4);
              jButton3.setEnabled(CON.PP5); 
       jButton15.setEnabled(CON.PP5);
              jButton8.setEnabled(CON.PP6); 
       jButton19.setEnabled(CON.PP6);
              jButton11.setEnabled(CON.PP7); 
       jButton16.setEnabled(CON.PP7);
              jButton9.setEnabled(CON.PP8); 
       jButton17.setEnabled(CON.PP8);
              jButton10.setEnabled(CON.PP9); 
       jButton18.setEnabled(CON.PP9);
              jButton7.setEnabled(CON.PP10); 
       jButton20.setEnabled(CON.PP10);
    }//GEN-LAST:event_formMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       jButton1.setEnabled(CON.PP1); 
       jButton2.setEnabled(CON.PP1);
              jButton4.setEnabled(CON.PP2); 
       jButton12.setEnabled(CON.PP2);
              jButton5.setEnabled(CON.PP3); 
       jButton13.setEnabled(CON.PP3);
              jButton6.setEnabled(CON.PP4); 
       jButton14.setEnabled(CON.PP4);
              jButton3.setEnabled(CON.PP5); 
       jButton15.setEnabled(CON.PP5);
              jButton8.setEnabled(CON.PP6); 
       jButton19.setEnabled(CON.PP6);
              jButton11.setEnabled(CON.PP7); 
       jButton16.setEnabled(CON.PP7);
              jButton9.setEnabled(CON.PP8); 
       jButton17.setEnabled(CON.PP8);
              jButton10.setEnabled(CON.PP9); 
       jButton18.setEnabled(CON.PP9);
              jButton7.setEnabled(CON.PP10); 
       jButton20.setEnabled(CON.PP10);
    }//GEN-LAST:event_jPanel1MouseEntered

    
    public static void main(String args[]) {
        


        java.awt.EventQueue.invokeLater(() -> {
            new Postres().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb10;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlb4;
    private javax.swing.JLabel jlb5;
    private javax.swing.JLabel jlb6;
    private javax.swing.JLabel jlb7;
    private javax.swing.JLabel jlb8;
    private javax.swing.JLabel jlb9;
    // End of variables declaration//GEN-END:variables
}
