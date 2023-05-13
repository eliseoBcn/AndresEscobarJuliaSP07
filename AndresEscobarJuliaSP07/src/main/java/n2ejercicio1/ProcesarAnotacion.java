package n2ejercicio1;

import com.google.gson.Gson;
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

    private static final Logger LOG = Logger.getLogger(ProcesarAnotacion.class.getName());

    public void operate(Object weapon) throws IOException {
        final String className = weapon.getClass().getName();

        System.out.println( "className" + className );
        
        if( weapon.getClass().getAnnotation(ToJsonFile.class) != null ) {
            
            Gson gson = new Gson();
            
            // Serializar objeto � Convertir objeto `Person` a string JSON
            String jsonString = gson.toJson(weapon);
            String ruta = weapon.getClass().getAnnotation(ToJsonFile.class).name();
            System.out.println( "Json : " + jsonString   );
            
            
            String fileName = ruta;
            String text = jsonString +  "\r\n" ;
     
            // `true` agregará los nuevos datos
            try(FileWriter fw = new FileWriter(fileName, true))
            {
                fw.write(text);
                System.out.println("Successfully written data to the file");
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            
//        
//			try (BufferedWriter bw = new BufferedWriter(new FileWriter( weapon.getClass().getAnnotation(ToJsonFile.class).name() ))) {
//			    bw.write(jsonString);
//			    System.out.println("Fichero creado");
//			} catch (IOException ex) {
// 			    System.out.println(ex.getMessage());
//			}
// 
        }else {
            System.out.println( "No hay anotacion ") ;       	
        };  
        
 
    }
 
}
