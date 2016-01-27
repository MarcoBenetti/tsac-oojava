package harbour;

import static org.junit.Assert.*;

import org.junit.Test;

public class SottomarinoTest {

	@Test
	public void test() {
		Sottomarino s = new Sottomarino();
		s.setStazza(2500);
		s.setNumeroArmamenti(20);
		
		assertEquals(50000, s.calcolaPotenzaDiFuoco(), 0.0001);
		assertEquals(75000, s.calcolaMQDistrutti(), 0.0001);
	}

}
