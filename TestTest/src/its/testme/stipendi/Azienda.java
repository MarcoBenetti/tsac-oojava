package its.testme.stipendi;

public class Azienda {
	int numDipendenti;
	int pagaBase;
	public int getNumDipendenti() {
		return numDipendenti;
	}
	public void setNumDipendenti(int numDipendenti) {
		this.numDipendenti = numDipendenti;
	}
	public int getPagaBase() {
		return pagaBase;
	}
	public void setPagaBase(int pagaBase) {
		this.pagaBase = pagaBase;
	}
	
	public int calcolaStipendi(){
		return numDipendenti * pagaBase;
	}
}
