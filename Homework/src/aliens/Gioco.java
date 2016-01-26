package aliens;

public class Gioco {
	//attributes
	private Giocatore player;
	private Alieno[] aliens;
	
	//constructor
	public Gioco(Giocatore player, Alieno[] aliens) {
		super();
		this.player = player;
		this.aliens = aliens;
	}
	
	//methods
	public Giocatore getPlayer() {
		return player;
	}

	public void setPlayer(Giocatore player) {
		this.player = player;
	}

	public Alieno[] getAliens() {
		return aliens;
	}

	public void setAliens(Alieno[] aliens) {
		this.aliens = aliens;
	}

	public void slaughter(){
		int vita = player.getVita();
		for (int i = 0; i < aliens.length; i++) {
			vita -= aliens[i].getDanno();
		}
		player.setVita(vita);
	}
	
	public String stillAlive(){
		if(player.getVita() > 0)
			return "S till alive, biatch!";
		else
			return "He's dead, son.";
	}
	
}
