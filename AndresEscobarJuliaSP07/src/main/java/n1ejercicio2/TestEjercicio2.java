package n1ejercicio2;

import n1ejercicio1.Trabajador;
import n1ejercicio1.TrabajadorOnline;
import n1ejercicio1.TrabajadorPresencial;

public class TestEjercicio2 {

	public TestEjercicio2() {
		// TODO Auto-generated constructor stub
	}
//  @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println( "Hello World!" );
        
        
        Trabajador trabajador = new Trabajador("Ruben" , "Dario");
        TrabajadorOnline  trabajadoronline = new TrabajadorOnline("Alejandro" , "Magno");
        TrabajadorPresencial  trabajadorpresencial = new TrabajadorPresencial("Juana" , "De Arco");
        
        
        System.out.println ( trabajador.CalcularSueldo(10));
   
        System.out.println ( trabajadoronline.CalcularSueldo(10));

        System.out.println ( trabajadoronline.CalcularSueldo(10.50));

        System.out.println ( trabajadorpresencial.CalcularSueldo(10));
        
        
	}

}
