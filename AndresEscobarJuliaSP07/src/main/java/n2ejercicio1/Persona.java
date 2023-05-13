package n2ejercicio1;



@ToJsonFile(name="c:/Users/usuario/datos_persona.json") 
public class Persona { 

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Persona(String nom, String cognom, String dNI) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		DNI = dNI;
	}

	String nom =  "";

	String cognom = "";

	String DNI = "";
	
}
