
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Descuentoscomi {
    public  String cuen="";   
    public  String descuento() throws IOException{
        File fl =new File("cuentacomi.txt");
        try {
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String contenido;
            int cuenta=0;
            while(((contenido=br.readLine())!=null)){
                cuenta=Integer.parseInt(contenido); 
                
                if (cuenta >= 450 && cuenta <= 600){
            cuenta -= (cuenta*0.06);}
               else if (cuenta > 600 && cuenta <= 800 ){
            cuenta -= (cuenta*0.1);}
                else if (cuenta > 800){
            cuenta -= (cuenta*0.2);}
                else{
                    cuenta=cuenta;}
               
            }
            cuen=String.valueOf(cuenta);
            br.close();
            reescribir();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Descuentoscomi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cuen;
    }
    
    public  void reescribir(){
        try {
            FileOutputStream act1 = new FileOutputStream("cuentacomi.txt",false);
            byte es [] = cuen.getBytes();
            act1.write(es);
        }catch (Exception e){
            
        }
    }
    
}
