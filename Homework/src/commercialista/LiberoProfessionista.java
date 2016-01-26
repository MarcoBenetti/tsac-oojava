package commercialista;

public class LiberoProfessionista extends Cliente {
	//attributes
	private String piva;
	private int fattureRegistrate;
	
	//constructor
	public LiberoProfessionista(String nome, String cognome, String cf, String piva, int fattureRegistrate) {
		super(nome, cognome, cf);
		this.piva = piva;
		this.fattureRegistrate = fattureRegistrate;
	}
	
	//methods
	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public int getFattureRegistrate() {
		return fattureRegistrate;
	}

	public void setFattureRegistrate(int fattureRegistrate) {
		this.fattureRegistrate = fattureRegistrate;
	}
	
	public double calcolaParcella(){
		return 50 + (0.5 * this.fattureRegistrate);
	}
}
