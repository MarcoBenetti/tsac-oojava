package main.harbour;

import java.util.Random;


/**
* NON MODIFICARE
*/
public class Main {

	private static void testA(){
		
		Random rand = new Random(1001);
		int totaleSottomarino = 0;	
		for(int i = 0; i < 1000; ++i) {
			Sottomarino s = new Sottomarino();
			s.setId("s" + i);
			s.setModello("fighter");
			s.setStazza(rand.nextInt(10));
			s.setnArmamenti(rand.nextInt(10));
			totaleSottomarino += s.potenzaFuoco();
		}
		
		int totaleCacciabombardiere = 0;	
		for(int i = 0; i < 1000; ++i) {
			Cacciabombardiere a = new Cacciabombardiere();
			a.setId("a" + i);
			a.setModello("falker");
			a.setnArmamentiAlpha(rand.nextInt(10));
			a.setnArmamentiBeta(rand.nextInt(10));
			totaleCacciabombardiere += a.potenzaFuoco();
		}
		
		Porto porto = new Porto();
		porto.setDimensioneSqMeters(rand.nextInt(100000));
		for(int i = 0; i < 1000; ++i) {
			porto.addMetriQuadriDistrutti(rand.nextInt(10));
		}
		
		System.out.println("Potenza fuoco Sottomarino: " + totaleSottomarino);
		System.out.println("Potenza fuoco Cacciabombardiere: " + totaleCacciabombardiere);
		System.out.println("Porto dimensione non distrutta: " + porto.getDimensioneSqMetersNonDistrutta());
		
	}
	
	private static void testB(){	
		Random rand = new Random(3001);
			
		int counter = 1000; 
		Invasore[] invasori = new Invasore[counter];
		
		Porto porto = new Porto();
		porto.setDimensioneSqMeters(1000000);
		
		for(int i = 0; i < counter; ++i) {
			if (rand.nextInt() % 2 == 0) {
				Sottomarino s = new Sottomarino();
				s.setId("s" + i);
				s.setModello("fighter");
				s.setStazza(rand.nextInt(10));
				s.setnArmamenti(rand.nextInt(10));
				invasori[i] = s;
			} else {
				Cacciabombardiere a = new Cacciabombardiere();
				a.setId("a" + i);
				a.setModello("falker");
				a.setnArmamentiAlpha(rand.nextInt(10));
				a.setnArmamentiBeta(rand.nextInt(10));
				invasori[i] = a;
			}
		}
		
		Gioco gioco = new Gioco(porto);
		gioco.attacco(invasori);
		
		System.out.println("Porto distrutto? " + gioco.portoDistrutto());
		System.out.println("Porto dimensione non distrutta su Gioco: " + porto.getDimensioneSqMetersNonDistrutta());
		
	}
	
	public static void main(String[] args) {
		testA();
		testB();		
	}

}
