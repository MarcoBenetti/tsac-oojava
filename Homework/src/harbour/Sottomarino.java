package harbour;

public class Sottomarino extends Invasore{
	//attributes
	private int numeroArmamenti;
	private double stazza;
	
	//methods
	public int getNumeroArmamenti() {
		return numeroArmamenti;
	}
	public void setNumeroArmamenti(int numeroArmamenti) {
		this.numeroArmamenti = numeroArmamenti;
	}
	public double getStazza() {
		return stazza;
	}
	public void setStazza(double stazza) {
		this.stazza = stazza;
	}
	
	public double calcolaPotenzaDiFuoco(){
		return this.numeroArmamenti * this.stazza;
	}
}
