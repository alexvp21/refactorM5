package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Leer {
   
   
    public static void main(String[] args) {
        // Creamos la variables
       
        File origen = new File("/home/alex/Documentos/Clase/M3/old/ficheros/alex_examen.txt");
        FileWriter destino = null;
        FileReader fr = null;
        PrintWriter escribir = null;
        BufferedReader leer = null;
       
    	try {
    		escribir(origen, destino, fr, escribir, leer);
        }
        catch(Exception ex1){
            System.err.println("Error con algún fichero!");
        }finally {
            try{
                if((fr != null) && (destino != null)){
                    fr.close();
                    destino.close();
                }
            }catch(Exception ex2){
            	System.err.println("Error al intentar cerrar ficheros");
            }
        }
       
    }
    
    private static void escribir(File origen, FileWriter destino, FileReader fr, PrintWriter escribir, BufferedReader leer) throws IOException {
    	destino = new FileWriter("/home/alex/Documentos/Clase/M3/old/ficheros/prova_AlexVargas.txt");
        escribir = new PrintWriter(destino);
        fr = new FileReader (origen);
        leer = new BufferedReader(fr);
       
        String line;
        while((line = leer.readLine())!=null) {
        	escribir.println(line);            	
        }
        escribir.flush();
        escribir.close();
        leer.close();
    }
 
}