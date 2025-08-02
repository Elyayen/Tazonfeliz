package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Ticket extends javax.swing.JFrame {

    int cuencom, cuenbebi, cuendes, cuenpos;
    String pedicomi = "", pedibebi = "", pedides = "", pedipos = "";

    public Ticket() throws IOException {
        initComponents();
        di();               //Declara Fecha
        cuentatotal();
        pedidototal();
        hora();
        repar();
        usuar();

        this.setLocationRelativeTo(null);
    }

    public int cuentacomida() throws IOException {

        try {

            File Cuent1 = new File("cuentacomi.txt");
            if (Cuent1.exists()) {
                Scanner leer_cuenta = new Scanner(Cuent1);
                while (leer_cuenta.hasNextLine()) {
                    String recibo = leer_cuenta.nextLine();
                    cuencom = Integer.parseInt(recibo);
                }
            } else {
                cuencom = 0;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuencom;
    }

    public String pedidocomida() {
        try {
            File prod1 = new File("PedidoComi.txt");
            //Scanner leer_prod = new Scanner(prod1);
            if (prod1.exists()) {
                FileReader fr = new FileReader(prod1);
                BufferedReader br = new BufferedReader(fr);
                String linea;

                while (((linea = br.readLine()) != null)) {
                    pedicomi += linea + "\n";

                }
            } else {
                pedicomi = "";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return pedicomi;
    }

    public int cuentabebida() throws IOException {

        try {
            File Cuent1 = new File("cuentabebi.txt");
            if (Cuent1.exists()) {
                Scanner leer_cuenta = new Scanner(Cuent1);

                while (leer_cuenta.hasNextLine()) {
                    String recibo = leer_cuenta.nextLine();
                    cuenbebi = Integer.parseInt(recibo);
                }

            } else {
                cuenbebi = 0;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cuenbebi;
    }

    public String pedidobebida() {
        try {

            File prod1 = new File("Pedidobebi.txt");
            if (prod1.exists()) {
                Scanner leer_prod = new Scanner(prod1);
                FileReader fr = new FileReader(prod1);
                BufferedReader br = new BufferedReader(fr);
                String texto = "";
                String linea;
                while (((linea = br.readLine()) != null)) {
                    pedibebi += linea + "\n";

                }
            } else {
                pedibebi = "";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pedibebi;
    }

    public int cuentapostre() {
        try {
            File Cuent1 = new File("cuentapos.txt");
            if (Cuent1.exists()) {
                Scanner leer_cuenta = new Scanner(Cuent1);

                while (leer_cuenta.hasNextLine()) {
                    String recibo = leer_cuenta.nextLine();
                    cuenpos = Integer.parseInt(recibo);
                }

            } else {
                cuenpos = 0;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cuenpos;
    }

    public int cuentadesayuno() {
        try {
            File Cuent1 = new File("cuentades.txt");
            if (Cuent1.exists()) {
                Scanner leer_cuenta = new Scanner(Cuent1);

                while (leer_cuenta.hasNextLine()) {
                    String recibo = leer_cuenta.nextLine();
                    cuendes = Integer.parseInt(recibo);
                }
            } else {
                cuendes = 0;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuendes;
    }

    public String pedidodesayuno() {
        try {
            File prod1 = new File("Pedidodes.txt");
            if (prod1.exists()) {
                Scanner leer_prod = new Scanner(prod1);
                FileReader fr = new FileReader(prod1);
                BufferedReader br = new BufferedReader(fr);

                String linea;
                while (((linea = br.readLine()) != null)) {
                    pedides += linea + "\n";

                }
            } else {
                pedides = "";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pedides;

    }

    public String pedidopostre() {

        try {
            File prod1 = new File("Pedidopos.txt");
            if (prod1.exists()) {
                Scanner leer_prod = new Scanner(prod1);
                FileReader fr = new FileReader(prod1);
                BufferedReader br = new BufferedReader(fr);

                String linea;
                while (((linea = br.readLine()) != null)) {
                    pedipos += linea + "\n";

                }
            } else {
                pedipos = "";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pedipos;
    }

    public void cuentatotal() {
        try {
            cuentacomida();
            cuentabebida();
            cuentadesayuno();
            cuentapostre();
        } catch (Exception e) {

        }
        int cuentatodo;
        cuentatodo = cuencom + cuenbebi + cuendes + cuenpos;
        String enviar = String.valueOf(cuentatodo);
        jtotal.setText(enviar);
    }

    public void pedidototal() {
        try {
            pedidocomida();
            pedidobebida();
            pedidopostre();
            pedidodesayuno();
        } catch (Exception e) {

        }

        String todo = pedicomi + pedibebi + pedipos + pedides;
        tex.setText(todo);
    }

    public void repar() {
        int empeu;

        try {
            FileReader f = new FileReader("Empleados.txt");
            File fi = new File("Empleados.txt");
            Scanner leer = new Scanner(fi);
            BufferedReader b = new BufferedReader(f);
            empeu = (int) b.lines().count();
            String lepeu[] = new String[empeu];

            for (int i = 0; i < empeu; i++) {
                lepeu[i] = leer.nextLine();
            }
            int numero = (int) (Math.random() * empeu);
            StringTokenizer token = new StringTokenizer(lepeu[numero], ",");
            String nam = token.nextToken().trim();
            lepeu[numero] = nam;
            rep.setText(nam);

        } catch (Exception e) {

        }

    }

    public void usuar() {
        Iniciar itl = new Iniciar();
        Registro reg = new Registro();
        if (usa.equals("")) {
            usa.setText(itl.usuario);
            dir.setText(itl.direccio);
            
        } 
        else{
            usa.setText(reg.noom);
            dir.setText(reg.diic);
        }

    }

    public String hora() {
        int min = 1;
        int max = 2;

        Random random = new Random();

        int value = random.nextInt(max + min) + min;

        String hor = String.valueOf(value);
        hora.setText(hor + "Hrs.");
        return hor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jfecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tex = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        rep = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usa = new javax.swing.JLabel();
        dir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("RESTAURANTE DE COMIDA MEXICANA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("\"EL TAZON FELIZ\"");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fecha:");

        jfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Productos");

        jtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tex.setColumns(20);
        tex.setRows(5);
        tex.setEnabled(false);
        jScrollPane1.setViewportView(tex);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Repartidor");

        rep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Hora de llegada");

        hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Con direccion a:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Destinado a :");

        usa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usa.setOpaque(true);

        dir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rep, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(16, 16, 16)
                        .addComponent(usa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(rep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void di() {
        jfecha.setText(LocalDate.now().toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Ticket().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dir;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jfecha;
    private javax.swing.JLabel jtotal;
    private javax.swing.JLabel rep;
    private javax.swing.JTextArea tex;
    private javax.swing.JLabel usa;
    // End of variables declaration//GEN-END:variables
}
