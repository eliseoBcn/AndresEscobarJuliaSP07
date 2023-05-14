package n3ejercicio1;

import com.google.gson.Gson;

import n2ejercicio1.Persona;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;
import java.lang.annotation.*;
 
import java.lang.annotation.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;


public class ProcesarAnotacion {
	private final String ruta;
    private static final Logger LOG = Logger.getLogger(ProcesarAnotacion.class.getName());

    public ProcesarAnotacion(String ruta)  {
    	this.ruta = ruta;
    }
 
	
    public  <P>  void toJson( P  datos) throws IOException {
 
            Gson gson = new Gson();
            // Serializar objeto � Convertir objeto `Person` a string JSON
            String jsonString = gson.toJson(datos);
  
            System.out.println( "Json : " + jsonString   );
            
            String fileName = ruta;
            String text = jsonString +  "\r\n" ;
   
            try(FileWriter fw = new FileWriter(fileName, true))
            {
                fw.write(text);
                System.out.println("Successfully written data to the file");
            } catch (IOException e) {
                e.printStackTrace();
            }
            
 
    }
 
}
