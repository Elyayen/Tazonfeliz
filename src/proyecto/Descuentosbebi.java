
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Descuentosbebi {
    public  String cuen="";
    
    public String descuentos() throws IOException{
        File fl =new File("cuentabebi.txt");
        try {
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String contenido;
            int cuenta=0;
            while(((contenido=br.readLine())!=null)){
                cuenta=Integer.parseInt(contenido); 
                
                if (cuenta >= 150 && cuenta <= 250){
            cuenta -= (cuenta*0.06);}
               else if (cuenta > 260 && cuenta <= 350 ){
            cuenta -= (cuenta*0.1);}
                else if (cuenta > 350){
            cuenta -= (cuenta*0.2);}
                else{
                    cuenta=cuenta;}
            }
          cuen=String.valueOf(cuenta);
            br.close();
            reescribir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Descuentosbebi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuen;
    }
    public  void reescribir(){
        try {
            FileOutputStream act1 = new FileOutputStream("cuentabebi.txt",false);
            byte es [] = cuen.getBytes();
            act1.write(es);
        }catch (Exception e){
            
        }
    }
}
