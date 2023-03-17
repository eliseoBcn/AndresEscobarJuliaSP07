package n1ejercicio1;

public class TrabajadorPresencial extends Trabajador {
	private final static double GASOLINA =  70;
	
	
	public TrabajadorPresencial(String nom, String cognom) {
		super(nom, cognom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularSueldo(double horastrabajadas ) {
		
 		return horastrabajadas*preciohora + GASOLINA;
	};
	
	
}
