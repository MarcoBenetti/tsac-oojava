package harbour;

public class Aereo extends Invasore{
	//attributes
	private int armamentiAlpha;
	private int armamentiBeta;
	private final int potenzaArmamentiAlpha = 10;
	private final int potenzaArmamentiBeta = 25;
	
	//methods
	public int getArmamentiAlpha() {
		return armamentiAlpha;
	}
	public void setArmamentiAlpha(int armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}
	public int getArmamentiBeta() {
		return armamentiBeta;
	}
	public void setArmamentiBeta(int armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}
	
	public double calcolaPotenzaDiFuoco(){
		return this.armamentiAlpha * potenzaArmamentiAlpha + this.armamentiBeta * potenzaArmamentiBeta;
	}
}
