package harbour;

import static org.junit.Assert.*;

import org.junit.Test;

public class AereoTest {

	@Test
	public void test() {
		Aereo a = new Aereo();
		a.setArmamentiAlpha(10);
		a.setArmamentiBeta(2);
		
		assertEquals(150, a.calcolaPotenzaDiFuoco(), 0.0001);
		assertEquals(225, a.calcolaMQDistrutti(), 0.0001);
	}

}
