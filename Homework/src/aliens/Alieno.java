package aliens;

public class Alieno {
	//attributes
	private String nome;
	private int danno;
	
	//constructor
	public Alieno(String nome, int danno) {
		super();
		this.nome = nome;
		this.danno = danno;
	}
	
	//methods
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDanno() {
		return danno;
	}
	public void setDanno(int danno) {
		this.danno = danno;
	}
	
}
