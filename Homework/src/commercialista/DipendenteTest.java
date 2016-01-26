package commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

public class DipendenteTest {

	@Test
	public void test() {
		Dipendente d = new Dipendente("Primo", "Levi", "PRMLEV");
		assertEquals(50, d.calcolaParcella(), 0.00001);
	}

}
