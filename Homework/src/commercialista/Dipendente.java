package commercialista;

public class Dipendente extends Cliente{

	public Dipendente(String nome, String cognome, String cf) {
		super(nome, cognome, cf);
	}
	
	//methods
	public int calcolaParcella(){
		return 5000;
	}
}
