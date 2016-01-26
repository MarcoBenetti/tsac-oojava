package benetti.marco.azienda;

public class Contratto {
	//attributes
	private int stipendioBase;
	private String nome;
	public int getStipendioBase() {
		return stipendioBase;
	}
	public void setStipendioBase(int stipendioBase) {
		this.stipendioBase = stipendioBase;
	}
	public Contratto(int stipendioBase, String nome) {
		super();
		this.stipendioBase = stipendioBase;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
