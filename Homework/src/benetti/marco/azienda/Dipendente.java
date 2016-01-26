package benetti.marco.azienda;

public class Dipendente {
	//attributes
	private String nome;
	private String cognome;
	private int anzianita;
	private Contratto c;
	
	public Dipendente(String nome, String cognome, int anzianita, Contratto c) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.anzianita = anzianita;
		this.c = c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public Contratto getC() {
		return c;
	}

	public void setC(Contratto c) {
		this.c = c;
	}

	//methods
	public int calcoloStipendio(){
		return Math.round((float)this.c.getStipendioBase() + this.anzianita * (this.c.getStipendioBase() / 100 * 5));
	}
}
