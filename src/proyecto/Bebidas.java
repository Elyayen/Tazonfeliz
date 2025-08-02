
package proyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Bebidas extends javax.swing.JFrame {
    MenuConfig CON= new MenuConfig();
    int climon= 0, chorchata= 0,cjamaica=0,cguayaba=0,cfrutas=0,cpiña=0,cpiñacola=0,climonada=0,cpepino=0,ctamarindo=0;
    int plimon=25, phorchata=25, pjamaica=25, pguayaba=25, pfrutas=25, ppiña=25, ppiñacola=27, plimonada=27, ppepino=25, ptamarindo=25;
    int total;
   
    public Bebidas() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        La1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jScrol1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        La2 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        La3 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        La4 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        La5 = new javax.swing.JLabel();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        La6 = new javax.swing.JLabel();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        La7 = new javax.swing.JLabel();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        La8 = new javax.swing.JLabel();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        La9 = new javax.swing.JLabel();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        La10 = new javax.swing.JLabel();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        La11 = new javax.swing.JLabel();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enchi.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        La1.setText("0");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrol1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrol1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrol1.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrol1.setAutoscrolls(true);

        jPanel1.setAutoscrolls(true);
        jPanel1.setEnabled(false);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(1522, 787));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tazo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chi.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/agufru.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 240, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/agulim.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/picola.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/nada.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/agupep.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/agutam.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/agupiñ.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        La2.setText("0");
        jPanel1.add(La2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 40, 30));

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
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        b4.setText(">");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b4MousePressed(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        La3.setText("0");
        jPanel1.add(La3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 50, -1));

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
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        b6.setText(">");
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b6MousePressed(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        La4.setText("0");
        jPanel1.add(La4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 40, -1));

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
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        b8.setText(">");
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b8MousePressed(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        La5.setText("0");
        jPanel1.add(La5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 50, -1));

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
        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        b10.setText(">");
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b10MousePressed(evt);
            }
        });
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, -1, -1));

        La6.setText("0");
        jPanel1.add(La6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 440, 50, -1));

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
        jPanel1.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 440, -1, -1));

        b12.setText(">");
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b12MousePressed(evt);
            }
        });
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 440, -1, -1));

        La7.setText("0");
        jPanel1.add(La7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 50, 30));

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
        jPanel1.add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        b14.setText(">");
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b14MousePressed(evt);
            }
        });
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel1.add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 700, -1, -1));

        La8.setText("0");
        jPanel1.add(La8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 700, 50, -1));

        b15.setText("<");
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b15MouseClicked(evt);
            }
        });
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel1.add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 700, -1, -1));

        b16.setText(">");
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b16MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b16MousePressed(evt);
            }
        });
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jPanel1.add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 700, -1, -1));

        La9.setText("0");
        jPanel1.add(La9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 700, 50, -1));

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
        jPanel1.add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 700, -1, -1));

        b18.setText(">");
        b18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b18MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b18MousePressed(evt);
            }
        });
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        jPanel1.add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, -1, -1));

        La10.setText("0");
        jPanel1.add(La10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 700, 50, -1));

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
        jPanel1.add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, -1, -1));

        b20.setText(">");
        b20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b20MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b20MousePressed(evt);
            }
        });
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        jPanel1.add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 700, -1, -1));

        La11.setText("0");
        jPanel1.add(La11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 700, 50, -1));

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
        jPanel1.add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 700, -1, -1));

        b22.setText(">");
        b22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b22MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b22MousePressed(evt);
            }
        });
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        jPanel1.add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 700, -1, -1));

        jButton2.setText("Ver Menús");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 740, -1, -1));

        jButton1.setText("Hacer pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 740, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setText("Limonada");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel16.setText("Agua de Horchata");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setText("Agua de Jamaica");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setText("Agua de Guayaba");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setText("Agua de Piña");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setText("Agua de Limon");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel21.setText("Piña Colada");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel22.setText("Agua de Pepino");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel24.setText("Agua de Tamarindo");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, -1, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel23.setText("Agua de Frutas");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 220, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel25.setText("$27");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel26.setText("$25");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel27.setText("$25");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel28.setText("$25");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel29.setText("$25");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel30.setText("$25");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel31.setText("$25");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel32.setText("$27");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel33.setText("$25");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 220, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel35.setText("$25");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 480, -1, -1));

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 740, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/aguhor.png"))); // NOI18N
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/agujam.png"))); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/aguguy.png"))); // NOI18N
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setText("MENÚ");

        jLabel34.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel34.setText("BEBIDAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(443, 443, 443))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(476, 476, 476))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 910, 200));

        jScrol1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrol1, javax.swing.GroupLayout.DEFAULT_SIZE, 1378, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrol1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        
    }//GEN-LAST:event_b1MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

    }//GEN-LAST:event_b1ActionPerformed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked

    }//GEN-LAST:event_b2MouseClicked

    private void b2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MousePressed

    }//GEN-LAST:event_b2MousePressed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
    }//GEN-LAST:event_b2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String n="0";
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
        climon= 0;chorchata= 0;cjamaica=0;cguayaba=0;cfrutas=0;cpiña=0;cpiñacola=0;climonada=0;cpepino=0;ctamarindo=0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        cfrutas++;
        String numero = String.valueOf(cfrutas);
        La6.setText(numero);
    }//GEN-LAST:event_b12ActionPerformed

    private void b12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b12MousePressed

    private void b12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b12MouseClicked

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        cguayaba--;
        if (cguayaba < 0) {
            evt.consume();
            cguayaba = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cguayaba);

        La5.setText(numero);
    }//GEN-LAST:event_b9MouseClicked

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseClicked
        cfrutas--;
        if (cfrutas < 0) {
            evt.consume();
            cfrutas = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cfrutas);

        La6.setText(numero);
    }//GEN-LAST:event_b11MouseClicked

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        cpiña++;
        String numero = String.valueOf(cpiña);
        La7.setText(numero);
    }//GEN-LAST:event_b14ActionPerformed

    private void b14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b14MousePressed

    private void b14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b14MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            db.descuentos();
        } catch (IOException ex) {
            Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Pedido Realizado con Exito");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void b21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseClicked
        ctamarindo--;
        if (ctamarindo < 0) {
            evt.consume();
            ctamarindo = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(ctamarindo);

        La11.setText(numero);
    }//GEN-LAST:event_b21MouseClicked

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b19ActionPerformed

    private void b19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseClicked
        cpepino--;
        if (cpepino < 0) {
            evt.consume();
            cpepino = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cpepino);

        La10.setText(numero);
    }//GEN-LAST:event_b19MouseClicked

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        cpepino++;
        String numero = String.valueOf(cpepino);
        La10.setText(numero);
    }//GEN-LAST:event_b20ActionPerformed

    private void b20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b20MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b20MousePressed

    private void b20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b20MouseClicked

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b17MouseClicked
        cpiñacola--;
        if (cpiñacola < 0) {
            evt.consume();
            cpiñacola = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cpiñacola);

        La9.setText(numero);
    }//GEN-LAST:event_b17MouseClicked

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        climon++;
        String numero = String.valueOf(climon);
        La8.setText(numero);
    }//GEN-LAST:event_b16ActionPerformed

    private void b16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b16MousePressed

    private void b16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b16MouseClicked

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        cpiñacola++;
        String numero = String.valueOf(cpiñacola);
        La9.setText(numero);
    }//GEN-LAST:event_b18ActionPerformed

    private void b18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b18MousePressed

    private void b18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b18MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DIFMENUS df = new DIFMENUS();
        df.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        ctamarindo++;
        String numero = String.valueOf(ctamarindo);
        La11.setText(numero);
    }//GEN-LAST:event_b22ActionPerformed

    private void b22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b22MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b22MousePressed

    private void b22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b22MouseClicked

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b15ActionPerformed

    private void b15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseClicked
        climon--;
        if (climon < 0) {
            evt.consume();
            climon = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(climon);

        La8.setText(numero);
    }//GEN-LAST:event_b15MouseClicked

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        cguayaba++;
        String numero = String.valueOf(cguayaba);
        La5.setText(numero);
    }//GEN-LAST:event_b10ActionPerformed

    private void b10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b10MousePressed

    private void b10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b10MouseClicked

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void b13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseClicked
        cpiña--;
        if (cpiña < 0) {
            evt.consume();
            cpiña = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cpiña);

        La7.setText(numero);
    }//GEN-LAST:event_b13MouseClicked

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        cjamaica++;
        String numero = String.valueOf(cjamaica);
        La4.setText(numero);
    }//GEN-LAST:event_b8ActionPerformed

    private void b8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8MousePressed

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b8MouseClicked

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        cjamaica--;
        if (cjamaica< 0) {
            evt.consume();
            cjamaica = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(cjamaica);

        La4.setText(numero);
    }//GEN-LAST:event_b7MouseClicked

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        chorchata++;
        String numero = String.valueOf(chorchata);
        La3.setText(numero);
    }//GEN-LAST:event_b6ActionPerformed

    private void b6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6MousePressed

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b6MouseClicked

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

    }//GEN-LAST:event_b5ActionPerformed

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        chorchata--;
        if (chorchata < 0) {
            evt.consume();
            chorchata = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(chorchata);

        La3.setText(numero);
    }//GEN-LAST:event_b5MouseClicked

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        climonada++;
        String numero = String.valueOf(climonada);
        La2.setText(numero);
    }//GEN-LAST:event_b4ActionPerformed

    private void b4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MousePressed

    }//GEN-LAST:event_b4MousePressed

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked

    }//GEN-LAST:event_b4MouseClicked

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

    }//GEN-LAST:event_b3ActionPerformed

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        climonada--;
        if (climonada < 0) {
            evt.consume();
            climonada = 0;
            getToolkit().beep();
        }
        String numero = String.valueOf(climonada);

        La2.setText(numero);
    }//GEN-LAST:event_b3MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       b3.setEnabled(CON.PB1); 
       b4.setEnabled(CON.PB1);
       b5.setEnabled(CON.PB2); 
       b6.setEnabled(CON.PB2);
       b7.setEnabled(CON.PB3); 
       b8.setEnabled(CON.PB3);
       b9.setEnabled(CON.PB4); 
       b10.setEnabled(CON.PB4);
       b11.setEnabled(CON.PB5); 
       b12.setEnabled(CON.PB5);
       b13.setEnabled(CON.PB6); 
       b14.setEnabled(CON.PB6);
              b15.setEnabled(CON.PB7);
       b16.setEnabled(CON.PB7); 
       b17.setEnabled(CON.PB8);
       b18.setEnabled(CON.PB8); 
       b19.setEnabled(CON.PB9);
       b20.setEnabled(CON.PB9); 
       b21.setEnabled(CON.PB10);
       b22.setEnabled(CON.PB10);
    }//GEN-LAST:event_jPanel1MouseEntered
Descuentosbebi db = new Descuentosbebi(); public void cuenta() throws IOException {
    File fl= new File("cuentabebi.txt");
    FileWriter crear= new FileWriter(fl,false);
    PrintWriter escribir= new PrintWriter(crear); 
        int n1 = Integer.parseInt(La2.getText());
        int n2 = Integer.parseInt(La3.getText());
        int n3 = Integer.parseInt(La4.getText());
        int n4 = Integer.parseInt(La5.getText());
        int n5 = Integer.parseInt(La6.getText());
        int n6 = Integer.parseInt(La7.getText());
        int n7 = Integer.parseInt(La8.getText());
        int n8 = Integer.parseInt(La9.getText());
        int n9 = Integer.parseInt(La10.getText());
        int n10 = Integer.parseInt(La11.getText());


        total = n1 * plimonada + n2 * phorchata + n3 * pjamaica + n4 * pguayaba + n5 * pfrutas +n6 * ppiña + n7*plimon +n8*ppiñacola +n9*ppepino +n10*ptamarindo;
        String tota= String.valueOf(total);
        escribir.write(tota);
        escribir.close();
        
    }
 public void pedido() throws IOException{
  File fl= new File("Pedidobebi.txt");
    FileWriter crear= new FileWriter(fl,false);
    PrintWriter escribir= new PrintWriter(crear);   
   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
   
n1=La2.getText();
n2=La3.getText();
n3=La4.getText();
n4=La5.getText();
n5=La6.getText();
n6=La7.getText();
n7=La8.getText();
n8=La9.getText();
n9= La10.getText();
n10=La11.getText();
if(n1!="0"){
     escribir.println("Limonada   "+n1);
   
}
  if(n2!="0"){
    escribir.println("Agua de Horchata   "+n2);
    
}  
  if(n3!="0"){
    escribir.println("Agua de Jamaica   "+n3);
  
}
  if(n4!="0"){
    escribir.println("Agua de Guayaba  "+n4);
  
}
  if(n5!="0"){
    escribir.println("Agua de frutas   "+n5);
   
}
  if(n6!="0"){
    escribir.println("Agua de Piña  "+n6);
   
}
  if(n7!="0"){
    escribir.println("Agua de limon   "+n7);
   
}
  if(n8!="0"){
    escribir.println("Piña colada   "+n8);
 
}
  if(n9!="0"){
    escribir.println("Agua de Pepino  "+n9);
  
}
  if(n10!="0"){
    escribir.println("Agua de Tamarindo    "+n10);
  
}
 crear.close();
}
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel La1;
    private javax.swing.JLabel La10;
    private javax.swing.JLabel La11;
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
    private javax.swing.JButton b3;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrol1;
    // End of variables declaration//GEN-END:variables
}
