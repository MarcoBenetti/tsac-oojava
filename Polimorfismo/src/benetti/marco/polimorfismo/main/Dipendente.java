package benetti.marco.polimorfismo.main;

public class Dipendente {

	private String nome;
	private String cognome;
	private int anzianita;
	private int pagaBase;
	
	
	
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



	public int getPagaBase() {
		return pagaBase;
	}



	public void setPagaBase(int pagaBase) {
		this.pagaBase = pagaBase;
	}



	public int calcoloStipendio() {
		return Math.round(pagaBase + pagaBase * anzianita * 2 / 100.0f);
	}
}
