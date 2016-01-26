package aliens;

public class Giocatore {
	//attributes
	private String nome;
	private int vita;
	
	//constructor
	public Giocatore(String nome, int vita) {
		super();
		this.nome = nome;
		this.vita = vita;
	}
	
	//methods
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}
	
}
