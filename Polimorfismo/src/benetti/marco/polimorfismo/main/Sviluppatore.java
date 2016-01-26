package benetti.marco.polimorfismo.main;

public class Sviluppatore extends Dipendente{
	private String[] linguaggiConosciuti;
	
	public String[] getLinguaggiConosciuti() {
		return linguaggiConosciuti;
	}

	public void setLinguaggiConosciuti(String[] linguaggiConosciuti) {
		this.linguaggiConosciuti = linguaggiConosciuti;
	}

	public int calcoloStipendio(){
		return 1000;
	}
}
