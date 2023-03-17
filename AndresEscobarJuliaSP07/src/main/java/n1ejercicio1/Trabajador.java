package n1ejercicio1;

public class Trabajador {
	
	public Trabajador(String nom, String cognom) {
		super();
		this.nom = nom;
		this.cognom = cognom;
	}

	String nom = "";
	String cognom = "";
	double preciohora = 25;

	public double CalcularSueldo(double horastrabajadas ) {
		return preciohora * horastrabajadas;
	}
	
}
