package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Porto {
	
	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	
	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}
	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
	}
	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}
	
	public void addMetriQuadriDistrutti(double mqd){
		if(mqd < dimensioneSqMetersNonDistrutta)
			dimensioneSqMetersNonDistrutta -= mqd;
		else
			dimensioneSqMetersNonDistrutta = 0;
	}
	
}
