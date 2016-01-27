package commercialista;

public abstract class Cliente { //new Cliente() da errore
	//attributes
	private String nome;
	private String cognome;
	private String cf;
		
	//constructor
	public Cliente(String nome, String cognome, String cf) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	
	//methods
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

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	//ereditarietà multipla -> interfacce, non devono avere dati, solo metodi dichiarati
	//in sostanza serve a calmare il compilatore, visto che non sa se sto metodo esiste
	
	public abstract int calcolaParcella(); //meodo astratto, dichiaro il metodo
	//ma non lo definisco. Assicuro che tutte le sottoclassi conterranno tale metodo
}
