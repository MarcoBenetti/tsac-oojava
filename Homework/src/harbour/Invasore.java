package harbour;

public abstract class Invasore {
	//attributes
	private String codice;
	private String modello;
	
	//methods
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public double calcolaMQDistrutti(){
		return calcolaPotenzaDiFuoco() * 1.5;
	}
	
	public abstract double calcolaPotenzaDiFuoco();
}
