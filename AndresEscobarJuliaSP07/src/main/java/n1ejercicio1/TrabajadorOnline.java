package n1ejercicio1;

public class TrabajadorOnline extends Trabajador {

	public TrabajadorOnline(String nom, String cognom) {
		super(nom, cognom);
		// TODO Auto-generated constructor stub
	}

	private final static double TARIFAPLANA =  45;
 
	@Override
	public double CalcularSueldo(double horastrabajadas) {
		// TODO Auto-generated method stub
		return horastrabajadas*preciohora + TARIFAPLANA ;
	}
	
 
	@Deprecated
	public double CalcularSueldo(int  horastrabajadas) {
		// TODO Auto-generated method stub
		return horastrabajadas*preciohora + TARIFAPLANA ;
	}
	

}
