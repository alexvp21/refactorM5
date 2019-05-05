package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Leer {
   
   
    public static void main(String[] args) {
        // Creamos la variables
       
        File origen = new File("/home/alex/Documentos/Clase/M3/ficheros/alex_examen.txt");
        FileWriter destino = null;
        FileReader fr = null;
        PrintWriter escribir = null;
        BufferedReader leer = null;
       
    	try {
    		destino = new FileWriter("/home/alex/Documentos/Clase/M3/ficheros/prova_AlexVargas.txt");
            escribir = new PrintWriter(destino);
            fr = new FileReader (origen);
            leer = new BufferedReader(fr);
           
            String line;
            while((line = leer.readLine())!=null) {
            	escribir.println(line);            	
            }
        }
        catch(Exception ex1){
            System.err.println("Error con algún fichero!");
        }finally {
            try{
            	escribir.flush();
                if((fr != null) && (destino != null)){
                    fr.close();
                    destino.close();
                }
            }catch(Exception ex2){
            	System.err.println("Error al intentar cerrar ficheros");
            }
        }
       
    }
 
}