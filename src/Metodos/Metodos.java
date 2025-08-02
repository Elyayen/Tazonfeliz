
package Metodos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {
    public DefaultTableModel listacliente(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre del usuario");
        cabeceras.addElement("Telefono");
        cabeceras.addElement("Direccion");
        DefaultTableModel table = new DefaultTableModel(cabeceras,0);
        
        try{
            FileReader fr = new FileReader("Registro.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer st = new StringTokenizer(d,",");
                Vector x = new Vector();
                while(st.hasMoreTokens()){
                x.addElement(st.nextToken());
            }
                table.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return table;
    }
}
