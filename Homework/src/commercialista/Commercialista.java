package commercialista;

public class Commercialista {
	//attributes
	Cliente[] clienti;

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	//methods
	private int calcolaStipendio(){
		int tot = 0;
		for (int i = 0; i < clienti.length; i++) {
			tot += clienti[i].calcolaParcella();
		}
		return tot;
	}
}
