package harbour;

public class Gioco {
	//attributes
	Porto porto;
	Invasore[] invasori;
	
	//methods
	public Porto getPorto() {
		return porto;
	}
	public void setPorto(Porto porto) {
		this.porto = porto;
	}
	public Invasore[] getInvasori() {
		return invasori;
	}
	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}
	
	public void attacco(){
		double mq = porto.getMetriQuadri();
		
		for (int i = 0; i < invasori.length; i++) {
			mq -= invasori[i].calcolaMQDistrutti();
		}
		
		porto.setMetriQuadri(mq);
	}
	
	public boolean isAlive(){
		return porto.getMetriQuadri() > 0;
	}
}
