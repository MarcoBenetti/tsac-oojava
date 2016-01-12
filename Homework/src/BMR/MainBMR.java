package BMR;

public class MainBMR {

	public static void main(String[] args) {
		Persona p = new Persona(180, 60, 20, 'm', "sedentario");
		System.out.println(Salute.calcBMR(p));
	}

}
