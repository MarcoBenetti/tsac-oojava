package test.harbour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.harbour.Sottomarino;

/**
* NON MODIFICARE
*/
public class SottomarinoTest {

	@Test
	public void testPotenzaFuoco() {
		Sottomarino s = new Sottomarino();
		s.setnArmamenti(13);
		s.setStazza(47);
		int pf = s.potenzaFuoco();
		
		// la potenza di fuoco è il
		// 25% del prodotto tra numero armamenti e stazza.
		// il valore è arrotondato all'intero più vicino.
		assertEquals(153, pf);
	}

}
