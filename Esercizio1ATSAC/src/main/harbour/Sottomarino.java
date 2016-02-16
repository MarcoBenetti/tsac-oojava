package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore{
	
	private int nArmamenti;
	private int stazza;
	
	public int getnArmamenti() {
		return nArmamenti;
	}
	public void setnArmamenti(int armamenti) {
		this.nArmamenti = armamenti;
	}
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	// la potenza di fuoco è il
	// 25% del prodotto tra numero armamenti e stazza.
	// il valore è arrotondato all'intero più vicino.
	
	@Override
	public int potenzaFuoco(){
		return Math.round(((nArmamenti * stazza) / 100.0f) * 25.0f);
	}
	
}
