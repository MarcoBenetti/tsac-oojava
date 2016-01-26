package benetti.marco.azienda;

public class Azienda {
	//attributes
	private String ragioneSociale;
	private Dipendente[] dipendentiAssociati;
	
	//constructor
	Azienda(String ragioneSociale, Dipendente[] dipendenti){
		this.ragioneSociale = ragioneSociale;
		this.dipendentiAssociati = dipendenti;
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Dipendente[] getDipendentiAssociati() {
		return dipendentiAssociati;
	}

	public void setDipendentiAssociati(Dipendente[] dipendentiAssociati) {
		this.dipendentiAssociati = dipendentiAssociati;
	}

	//methods
	public int sommaStipendi(){
		int sum = 0;
		for (int i = 0; i < dipendentiAssociati.length; i++) {
			sum += dipendentiAssociati[i].calcoloStipendio();
		}
		return sum;
	}
	
	public Dipendente[] maxStipendi(){
		int max = 0;
		int i = 0;
		int counter = 0;
		
		for (i = 0; i < dipendentiAssociati.length; i++) {
			if(dipendentiAssociati[i].calcoloStipendio() > max){
				max = dipendentiAssociati[i].calcoloStipendio();
			}
		}
		
		for (i = 0; i < dipendentiAssociati.length; i++) {
			if(dipendentiAssociati[i].calcoloStipendio() == max){
				counter++;
			}
		}
		
		Dipendente[] ricchi = new Dipendente[counter];
		int j = 0;
		
		for (i = 0; i < dipendentiAssociati.length; i++) {
			if(dipendentiAssociati[i].calcoloStipendio() == max){
				ricchi[j] = dipendentiAssociati[i];
				j++;
			}
		}
		
		return ricchi;
	}
}
