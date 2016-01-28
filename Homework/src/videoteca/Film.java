package videoteca;

public abstract class Film {
	//attributes
	String titolo;
	String regista;
	String attoriPrincipali;
	
	//methods
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public String getAttoriPrincipali() {
		return attoriPrincipali;
	}
	public void setAttoriPrincipali(String attoriPrincipali) {
		this.attoriPrincipali = attoriPrincipali;
	}
	
	public abstract int calcolaCosto(int giorni);
}
