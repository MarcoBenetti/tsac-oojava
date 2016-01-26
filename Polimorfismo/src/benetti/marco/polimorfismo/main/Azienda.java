package benetti.marco.polimorfismo.main;

public class Azienda {
	private String ragioneSociale;
	
	private Dipendente[] dipendenti;

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}

	public int totaleStipendi() {
		int tot = 0;
		for (int i = 0; i < dipendenti.length; i++) {
			tot += dipendenti[i].calcoloStipendio();
		}
		return tot;
	}
}
