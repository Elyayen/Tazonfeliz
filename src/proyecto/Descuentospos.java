
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Descuentospos {
    public String cuen="";
    
    public String descuento() throws IOException{
         File fl =new File("cuentapos.txt");
        try {
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String contenido;
            int cuenta=0;
            while(((contenido=br.readLine())!=null)){
                cuenta=Integer.parseInt(contenido); 
                
                if (cuenta >= 70 && cuenta <= 80){
            cuenta -= (cuenta*0.06);}
               else if (cuenta > 80 && cuenta <= 120 ){
            cuenta -= (cuenta*0.1);}
                else if (cuenta > 130){
            cuenta -= (cuenta*0.2);}
                else{
                    cuenta=cuenta;}
               
            }
            cuen=String.valueOf(cuenta);
            br.close();
            reescribir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Descuentospos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  cuen;
    }
    public  void reescribir(){
        try {
            FileOutputStream act1 = new FileOutputStream("cuentapos.txt",false);
            byte es [] = cuen.getBytes();
            act1.write(es);
        }catch (Exception e){
            
        }
    }
}
