package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	
	private Porto p;
	
	public Gioco(Porto p) {
		super();
		this.p = p;
	}

	public Porto getP() {
		return p;
	}

	public void setP(Porto p) {
		this.p = p;
	}
	
	/*
	 * L'attacco somma la potenza di fuoco degli invasori e 
	 * distrugge il porto secondo questa equazione:
	 * metri_quadri_distrutti_del_porto = potenza_di_fuoco_invasori * 2.5
	 */
	
	public void attacco(Invasore[] inv){
		int pf = 0;
		for (int i = 0; i < inv.length; i++) {
			pf += inv[i].potenzaFuoco();
		}
		
		p.addMetriQuadriDistrutti(pf * 2.5);
	}
	
	public boolean portoDistrutto(){
		return p.getDimensioneSqMetersNonDistrutta() == 0;
	}
}
