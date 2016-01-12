package BMR;

public class Salute {
	public static double calcBMR(Persona p){
		double bmr;
		if(p.sesso == 'm'){
			bmr = 655 + (13.8 * p.peso) + (1.8 * p.altezza) + (4.7 * p.eta);
		} else {
			bmr = 655 + (9.6 * p.peso) + (1.8 * p.altezza) + (4.7 * p.eta);
		}
		switch(p.attivitaFisica){
		case "sedentario":
			bmr = bmr + bmr / 100 * 20;
			break;
		case "moderatamente attivo":
			bmr = bmr + bmr / 100 * 20;
			break;
		case "attivo":
			bmr = bmr + bmr / 100 * 20;
			break;
		case "molto attivo":
			bmr = bmr + bmr / 100 * 20;
			break;
		}
		
		return bmr;
	}
}
