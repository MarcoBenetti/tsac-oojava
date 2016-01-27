package harbour;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiocoTest {

	@Test
	public void test() {
		Gioco g = new Gioco();
		Porto p = new Porto();
		p.setMetriQuadri(100000);
		g.setPorto(p);
		
		Invasore[] i = new Invasore[2];
		
		Aereo a = new Aereo();
		a.setArmamentiAlpha(10);
		a.setArmamentiBeta(5);
		
		Sottomarino s = new Sottomarino();
		s.setStazza(2000);
		s.setNumeroArmamenti(10);
		
		i[0] = a;
		i[1] = s;
		
		g.setInvasori(i);
		
		int counter = 0;
		
		while(g.isAlive()){
			g.attacco();
			counter++;
		}
		
		System.out.println(counter);
		assertEquals(4, counter);
		
	}

}
