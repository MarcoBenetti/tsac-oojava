package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */

public abstract class Invasore{
	
	private String id;
	private String modello;
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getModello() {
		return modello;
	}



	public void setModello(String modello) {
		this.modello = modello;
	}



	public abstract int potenzaFuoco();
	
}
