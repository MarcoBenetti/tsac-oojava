package commercialista;

public class Imprenditore extends Cliente {
	//attributes
	String piva;
	String ragioneSociale;
	int fattureRegistrate;
	
	//constructor
	public Imprenditore(String nome, String cognome, String cf, String piva, String ragioneSociale, int fattureRegistrate) {
		super(nome, cognome, cf);
		this.piva = piva;
		this.ragioneSociale = ragioneSociale;
		this.fattureRegistrate = fattureRegistrate;
	}

	//methods
	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getFattureRegistrate() {
		return fattureRegistrate;
	}

	public void setFattureRegistrate(int fattureRegistrate) {
		this.fattureRegistrate = fattureRegistrate;
	}
	
	public double calcolaParcella(){
		if(this.fattureRegistrate <= 100)
			return 500;
		else
			return 500 + (this.fattureRegistrate - 100);
	}
}
