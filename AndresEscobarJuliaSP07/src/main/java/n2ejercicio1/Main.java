package n2ejercicio1;

import java.io.IOException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	
    public static void main(String[] args) throws IOException {

       final ProcesarAnotacion  operator = new ProcesarAnotacion();

         Persona  persona = new Persona("gabriel", "garcia marquez","20165284b");
         operator.operate(persona);
         
         Persona  persona2 = new Persona("miguel", "cervantes saavedraa","3345133c");
         operator.operate(persona2);
         
   }
    
    
    
	
	
}
