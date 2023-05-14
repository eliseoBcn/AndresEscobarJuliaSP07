package n3ejercicio1;

import static java.lang.System.out;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import n3ejemplos.ClassDeclarationSpy;
import n3ejemplos.imprimirDatosObjetos;

import java.util.ArrayList;
import n2ejercicio1.Persona;
 
import n2ejercicio1.ToJsonFile;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	
         Class<?> clazz = ClassLoader.getSystemClassLoader()
        		  .loadClass("n2ejercicio1.Persona");
        
         // Mejora pasarlo com parámetro a la clase
         ToJsonFile classAnnotation = clazz.getAnnotation(ToJsonFile.class);
  		System.out.println( "classAnnotation  " + classAnnotation.name());
        		
   		String ruta = classAnnotation.name();
    	
   	   		
        final ProcesarAnotacion  operator = new ProcesarAnotacion(ruta);
    
        //  Método con un parámetro genérico para serializar todo tipo de objetos.
        
        operator.toJson(new Persona("Fiódor", "Dostoievski","3017899b"));
        operator.toJson(new Persona("Antón", "Chéjov","6345133c"));
        operator.toJson(new Persona("León", "Tolstói","7394334Y"));
     	
   }
 	
}
