package proyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    MenuConfig CON= new MenuConfig();
    int contador = 0, c = 0,o=0,na=0,t=0,a=0,d=0,O=0,r=0,on=0,si=0,doc=0,tre=0,cat=0,qui=0;
    int enver = 55, enro = 55, enmol = 60, chila = 60, chire = 60, soptor = 50, tora = 60, pozba = 70, pozro = 70, birria = 70, talcoyo = 65, pam = 60, huara = 60, huedi = 60, gord = 30;
    int total;
   
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        b19 = new javax.swing.JButton();
        La10 = new javax.swing.JLabel();
        b20 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        b21 = new javax.swing.JButton();
        La11 = new javax.swing.JLabel();
        b22 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        b13 = new javax.swing.JButton();
        La7 = new javax.swing.JLabel();
        b14 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        b23 = new javax.swing.JButton();
        La12 = new javax.swing.JLabel();
        b24 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        b25 = new javax.swing.JButton();
        La13 = new javax.swing.JLabel();
        b26 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        b28 = new javax.swing.JButton();
        La14 = new javax.swing.JLabel();
        b27 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        b29 = new javax.swing.JButton();
        La15 = new javax.swing.JLabel();
        b30 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        La1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        La2 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        La3 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        La4 = new javax.swing.JLabel();
        b8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        b9 = new javax.swing.JButton();
        La5 = new javax.swing.JLabel();
        b10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b11 = new javax.swing.JButton();
        La6 = new javax.swing.JLabel();
        b12 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        La8 = new javax.swing.JLabel();
        b15 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        b17 = new javax.swing.JButton();
        La9 = new javax.swing.JLabel();
        b18 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel32.setText("Pozole Rojo");
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel46.setText("Precio: $70");
        jLabel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/poro.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 190, 195));

        jLabel31.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel31.setText("Birria");
        jLabel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel35.setText("Precio: $70");
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel45.setText("Precio: $65");
        jLabel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel30.setText("Tlacoyos");
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel29.setText("Pambazos");
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 630, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel47.setText("Precio: $60");
        jLabel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, -1, -1));

        b19.setText("<");
        b19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b19MouseClicked(evt);
            }
        });
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        jPanel1.add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 870, -1, -1));

        La10.setText("0");
        jPanel1.add(La10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 880, -1, -1));

        b20.setText(">");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        jPanel1.add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 870, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/birria.png"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 190, 195));

        b21.setText("<");
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b21MouseClicked(evt);
            }
        });
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        jPanel1.add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 870, -1, -1));

        La11.setText("0");
        jPanel1.add(La11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 870, -1, -1));

        b22.setText(">");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        jPanel1.add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 870, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tlacoyo.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 190, 195));

        b13.setText("<");
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b13MouseClicked(evt);
            }
        });
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jPanel1.add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 870, -1, -1));

        La7.setText("0");
        jPanel1.add(La7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 870, -1, -1));

        b14.setText(">");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel1.add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 870, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pambaazo.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 670, 190, 195));

        b23.setText("<");
        b23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b23MouseClicked(evt);
            }
        });
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        jPanel1.add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 870, -1, -1));

        La12.setText("0");
        jPanel1.add(La12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 870, 20, -1));

        b24.setText(">");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        jPanel1.add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 870, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel49.setText("Precio: $60");
        jLabel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 650, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel28.setText("Huaraches");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 630, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel33.setText("Huevos Divorciados");
        jLabel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 630, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel48.setText("Precio: $60");
        jLabel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 650, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel27.setText("Gorditas");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 630, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel50.setText("Precio: $30");
        jLabel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 650, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huaracha.png"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 190, 195));

        b25.setText("<");
        b25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b25MouseClicked(evt);
            }
        });
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        jPanel1.add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, -1, -1));

        La13.setText("0");
        jPanel1.add(La13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 870, -1, -1));

        b26.setText(">");
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        jPanel1.add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 870, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevos.png"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 670, 190, 195));

        b28.setText("<");
        b28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b28MouseClicked(evt);
            }
        });
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        jPanel1.add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 870, -1, -1));

        La14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        La14.setText("0");
        jPanel1.add(La14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 870, 20, -1));

        b27.setText(">");
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        jPanel1.add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 870, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gorditas.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 670, 190, 195));

        b29.setText("<");
        b29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b29MouseClicked(evt);
            }
        });
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        jPanel1.add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 870, -1, -1));

        La15.setText("0");
        jPanel1.add(La15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 870, -1, -1));

        b30.setText(">");
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        jPanel1.add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 870, -1, -1));

        jButton3.setText("Hacer pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 900, 266, 66));

        jButton1.setText("Ver Menús");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 900, 221, 66));

        jButton2.setText("Resetear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 940, 208, 66));

        b1.setText("<");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        La1.setText("0");
        jPanel1.add(La1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enchi.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 195));

        b2.setText(">");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b2MousePressed(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel44.setText("Precio: $55");
        jLabel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setText("Enchiladas Verdes");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        b3.setText("<");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        La2.setText("0");
        jPanel1.add(La2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        b4.setText(">");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/roja.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 190, 195));

        jLabel40.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel40.setText("Precio: $55");
        jLabel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setText("Enchiladas Rojas");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel21.setText("Enchiladas de Mole");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel37.setText("Precio: $60");
        jLabel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mole.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 190, 195));

        b5.setText("<");
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        La3.setText("0");
        jPanel1.add(La3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, -1, -1));

        b6.setText(">");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        b7.setText("<");
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        La4.setText("0");
        jPanel1.add(La4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, -1, -1));

        b8.setText(">");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chila.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 190, 195));

        jLabel38.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel38.setText("Precio: $60");
        jLabel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel22.setText("Chilaquiles");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

        b9.setText("<");
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, -1, -1));

        La5.setText("0");
        jPanel1.add(La5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, -1));

        b10.setText(">");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rellenos.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 190, 195));

        jLabel39.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel39.setText("Precio: $60");
        jLabel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel23.setText("Chilaquiles Rellenos");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel41.setText("Precio: $50");
        jLabel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 340, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel24.setText("Sopa de Tortilla");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 320, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tortilla.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 370, 190, 195));

        b11.setText("<");
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b11MouseClicked(evt);
            }
        });
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 580, -1, -1));

        La6.setText("0");
        jPanel1.add(La6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 580, -1, -1));

        b12.setText(">");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 580, -1, -1));

        b16.setText("<");
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b16MouseClicked(evt);
            }
        });
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jPanel1.add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 570, -1, -1));

        La8.setText("0");
        jPanel1.add(La8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 570, -1, -1));

        b15.setText(">");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel1.add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 570, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ahogada.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 370, 190, 195));

        jLabel43.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel43.setText("Precio: $60");
        jLabel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 350, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel25.setText("Torta Ahogada");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 330, -1, -1));

        b17.setText("<");
        b17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b17MouseClicked(evt);
            }
        });
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        jPanel1.add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 570, -1, -1));

        La9.setText("0");
        jPanel1.add(La9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 570, -1, -1));

        b18.setText(">");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        jPanel1.add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 570, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/poba.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 370, 190, 195));

        jLabel42.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel42.setText("Precio: $70");
        jLabel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 350, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel26.setText("Pozole Blanco");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tazo.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setText("MENÚ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, 48));

        jLabel34.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel34.setText("PLATILLOS");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, -1, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chi.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b19ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b23ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        c++;
        String numero = String.valueOf(c);
        La2.setText(numero);
    }//GEN-LAST:event_b4ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
       doc++;
       String numero = String.valueOf(doc);
        La12.setText(numero);
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b25ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
tre++;
       String numero = String.valueOf(tre);
        La13.setText(numero);
    }//GEN-LAST:event_b26ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        cat++;
       String numero = String.valueOf(cat);
        La14.setText(numero);
    }//GEN-LAST:event_b27ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b28ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b29ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        qui++;
       String numero = String.valueOf(qui);
        La15.setText(numero);
    }//GEN-LAST:event_b30ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        contador++;
        String numero = String.valueOf(contador);
        La1.setText(numero);
    }//GEN-LAST:event_b2ActionPerformed

    private void b2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MousePressed


    }//GEN-LAST:event_b2MousePressed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        
    }//GEN-LAST:event_b2MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        contador--;
        if (contador < 0) {
            evt.consume();
            contador = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(contador);

        La1.setText(numero);
    }//GEN-LAST:event_b1MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
      
        c--;
        if (c < 0) {
            evt.consume();
            c = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(c);

        La2.setText(numero);
    }//GEN-LAST:event_b3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
 
       DIFMENUS df = new DIFMENUS();
       df.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        o--;
        if (o < 0) {
            evt.consume();
            o = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(o);

        La3.setText(numero);
    }//GEN-LAST:event_b5MouseClicked

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       o++;
        String numero = String.valueOf(o);
        La3.setText(numero);
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        na++;
        String numero = String.valueOf(na);
        La4.setText(numero);
    }//GEN-LAST:event_b8ActionPerformed

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        na--;
        if (na < 0) {
            evt.consume();
            na = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(na);

        La4.setText(numero);
    }//GEN-LAST:event_b7MouseClicked

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        t++;
        String numero = String.valueOf(t);
        La5.setText(numero);
    }//GEN-LAST:event_b10ActionPerformed

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        t--;
        if (t < 0) {
            evt.consume();
            t = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(t);

        La5.setText(numero);
    }//GEN-LAST:event_b9MouseClicked

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        a++;
        String numero = String.valueOf(a);
        La6.setText(numero);
    }//GEN-LAST:event_b12ActionPerformed

    private void b11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseClicked
       a--;
        if (a < 0) {
            evt.consume();
            a = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(a);

        La6.setText(numero);
    }//GEN-LAST:event_b11MouseClicked

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
       d++;
        String numero = String.valueOf(d);
        La8.setText(numero);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseClicked
       d--;
        if (d < 0) {
            evt.consume();
            d = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(d);

        La8.setText(numero);
    }//GEN-LAST:event_b16MouseClicked

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        O++;
        
        String numero = String.valueOf(O);
        La9.setText(numero);
    }//GEN-LAST:event_b18ActionPerformed

    private void b17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b17MouseClicked
        O--;
        if (O < 0) {
            evt.consume();
            O = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(O);

        La9.setText(numero);
    }//GEN-LAST:event_b17MouseClicked

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        r++;
        String numero = String.valueOf(r);
        La10.setText(numero);
    }//GEN-LAST:event_b20ActionPerformed

    private void b19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseClicked
        r--;
        if (r < 0) {
            evt.consume();
            r = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(r);

        La10.setText(numero);
    }//GEN-LAST:event_b19MouseClicked

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
      on++;
        String numero = String.valueOf(on);
        La11.setText(numero);
    }//GEN-LAST:event_b22ActionPerformed

    private void b21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseClicked
on--;
        if (on < 0) {
            evt.consume();
            on = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(on);

        La11.setText(numero);
    }//GEN-LAST:event_b21MouseClicked

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        si++;
        String numero = String.valueOf(si);
        La7.setText(numero);
    }//GEN-LAST:event_b14ActionPerformed

    private void b13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseClicked
    si--;
        if (si < 0) {
            evt.consume();
            si = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(si);

        La7.setText(numero);
    }//GEN-LAST:event_b13MouseClicked

    private void b23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b23MouseClicked
      doc--;
        if (doc < 0) {
            evt.consume();
            doc = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(doc);

        La12.setText(numero);
    }//GEN-LAST:event_b23MouseClicked

    private void b25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b25MouseClicked
        tre--;
        if (tre < 0) {
            evt.consume();
            tre = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(tre);

        La13.setText(numero);
    }//GEN-LAST:event_b25MouseClicked

    private void b28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b28MouseClicked
       cat--;
        if (cat < 0) {
            evt.consume();
            cat = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cat);

        La14.setText(numero);
    }//GEN-LAST:event_b28MouseClicked

    private void b29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b29MouseClicked
       qui--;
        if (qui < 0) {
            evt.consume();
            qui = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(qui);

        La15.setText(numero);
    }//GEN-LAST:event_b29MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String n="0";
        La1.setText(n);
        La2.setText(n);
        La3.setText(n);
        La4.setText(n);
        La5.setText(n);
        La6.setText(n);
        La7.setText(n);
        La8.setText(n);
        La9.setText(n);
        La10.setText(n);
        La11.setText(n);
        La12.setText(n);
        La13.setText(n);
        La14.setText(n);
        La15.setText(n);
       
        contador = 0;
        c = 0;
        o=0;
        na=0;
        t=0;
        a=0;
        d=0;
        O=0;r=0;on=0;si=0;doc=0;tre=0;cat=0;qui=0;

        
    }//GEN-LAST:event_jButton2ActionPerformed
Descuentoscomi dc = new Descuentoscomi();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            cuenta();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pedido();
        } 
        
        
        catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dc.descuento();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Pedido Realizado con Exito");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
      
    }//GEN-LAST:event_b4MouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       b1.setEnabled(CON.PN1); 
       b2.setEnabled(CON.PN1);
              b3.setEnabled(CON.PN2); 
       b4.setEnabled(CON.PN2);
         b5.setEnabled(CON.PN3); 
       b6.setEnabled(CON.PN3);
         b7.setEnabled(CON.PN4); 
       b8.setEnabled(CON.PN4);
              b9.setEnabled(CON.PN5); 
       b10.setEnabled(CON.PN5);
              b11.setEnabled(CON.PN6); 
       b12.setEnabled(CON.PN6);
              b16.setEnabled(CON.PN7); 
       b15.setEnabled(CON.PN7);
              b17.setEnabled(CON.PN8); 
       b18.setEnabled(CON.PN8);
              b19.setEnabled(CON.PN9); 
       b20.setEnabled(CON.PN9);
              b21.setEnabled(CON.PN10); 
       b22.setEnabled(CON.PN10);
                     b13.setEnabled(CON.PN11); 
       b14.setEnabled(CON.PN11);
              b23.setEnabled(CON.PN12); 
       b24.setEnabled(CON.PN12);
              b25.setEnabled(CON.PN13); 
       b26.setEnabled(CON.PN13);
              b28.setEnabled(CON.PN14); 
       b27.setEnabled(CON.PN14);
                     b29.setEnabled(CON.PN15); 
       b30.setEnabled(CON.PN15);
    }//GEN-LAST:event_jPanel1MouseEntered
    public void cuenta() throws IOException {
    File fl= new File("cuentacomi.txt");
    FileWriter crear= new FileWriter(fl,false);
    PrintWriter escribir= new PrintWriter(crear); 
        int n1 = Integer.parseInt(La1.getText());
        int n2 = Integer.parseInt(La2.getText());
        int n3 = Integer.parseInt(La3.getText());
        int n4 = Integer.parseInt(La4.getText());
        int n5 = Integer.parseInt(La5.getText());
        int n6 = Integer.parseInt(La6.getText());
        int n7 = Integer.parseInt(La8.getText());
        int n8 = Integer.parseInt(La9.getText());
        int n9 = Integer.parseInt(La10.getText());
        int n10 = Integer.parseInt(La11.getText());
        int n11 = Integer.parseInt(La7.getText());
        int n12 = Integer.parseInt(La12.getText());
        int n13 = Integer.parseInt(La13.getText());
        int n14 = Integer.parseInt(La14.getText());
        int n15 = Integer.parseInt(La15.getText());

        total = n1 * enver + n2 * enro + n3 * enmol + n4 * chila + n5 * chire +n6 * soptor + n7*tora +n8*pozba +n9*pozro +n10*birria + n11* talcoyo  + n12* pam+ n13* huara +n14*huedi +n15* gord;
        String tota= String.valueOf(total);
        escribir.write(tota);
        escribir.close();
        
    }
   
public void pedido() throws IOException{
  File fl= new File("PedidoComi.txt");
        try (FileWriter crear = new FileWriter(fl,false)) {
            PrintWriter escribir= new PrintWriter(crear);
            String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15;
            n1=La1.getText();
            n2=La2.getText();
            n3=La3.getText();
            n4=La4.getText();
            n5=La5.getText();
            n6=La6.getText();
            n7=La8.getText();
            n8=La9.getText();
            n9= La10.getText();
            n10=La11.getText();
            n11=La7.getText();
            n12=La12.getText();
            n13=La13.getText();
            n14=La14.getText();
            n15=La15.getText();
            if(n1!="0"){
                escribir.println("Enchiladas Verdes   "+n1);
                
            }           if(n2!="0"){
                escribir.println("Enchiladas Rojas   "+n2);
                
            }           if(n3!="0"){
                escribir.println("Enchiladas de Mole   "+n3);
                
            }           if(n4!="0"){
                escribir.println("Chilaquiles  "+n4);
                
            }           if(n5!="0"){
                escribir.println("Chilaquiles Rellenos   "+n5);
                
            }           if(n6!="0"){
                escribir.println("Sopa de tortilla  "+n6);
                
            }           if(n7!="0"){
                escribir.println("Torta ahogada   "+n7);
                
            }           if(n8!="0"){
                escribir.println("Pozole Blanco   "+n8);
                
            }           if(n9!="0"){
                escribir.println("Pozole Rojo  "+n9);
                
            }           if(n10!="0"){
                escribir.println("Birria    "+n10);
                
            }           if(n11!="0"){
                escribir.println("Tlacoyos  "+n11);
                
            }           if(n12!="0"){
                escribir.println("Pambazos   "+n12);
                
            }           if(n13!="0"){
                escribir.println("Huaraches   "+n13);
                
            }           if(n14!="0"){
                escribir.println("Huevos Divorciados   "+n14);
                
            }           if(n15!="0"){
                escribir.println("Gorditas  "+n15);
                
            }       }
}
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel La1;
    private javax.swing.JLabel La10;
    private javax.swing.JLabel La11;
    private javax.swing.JLabel La12;
    private javax.swing.JLabel La13;
    private javax.swing.JLabel La14;
    private javax.swing.JLabel La15;
    private javax.swing.JLabel La2;
    private javax.swing.JLabel La3;
    private javax.swing.JLabel La4;
    private javax.swing.JLabel La5;
    private javax.swing.JLabel La6;
    private javax.swing.JLabel La7;
    private javax.swing.JLabel La8;
    private javax.swing.JLabel La9;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
