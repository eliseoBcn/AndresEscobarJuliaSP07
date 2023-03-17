package n1ejercicio1;



public class TestEjercicio1 
{
//    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
 
        
        
        Trabajador trabajador = new Trabajador("Ruben" , "Dario");
        TrabajadorOnline  trabajadoronline = new TrabajadorOnline("Alejandro" , "Magno");
        TrabajadorPresencial  trabajadorpresencial = new TrabajadorPresencial("Juana" , "De Arco");
        
        
        System.out.println ( trabajador.CalcularSueldo(10));
 
        System.out.println ( trabajadoronline.CalcularSueldo(10.50));

        System.out.println ( trabajadorpresencial.CalcularSueldo(10));
        
        
    }
}
