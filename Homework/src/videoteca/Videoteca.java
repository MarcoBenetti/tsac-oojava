package videoteca;

public class Videoteca {
	//attributes
	Film[] elenco;
	
	//methods
	public Film[] getElenco() {
		return elenco;
	}

	public void setElenco(Film[] elenco) {
		this.elenco = elenco;
	}
	
	public int calcolaTotale(int giorni){
		int tot = 0;
		for (int i = 0; i < elenco.length; i++) {
			tot += elenco[i].calcolaCosto(giorni);
		}
		return tot;
	}
}
