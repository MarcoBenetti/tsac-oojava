package commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

public class LiberoProfessionistaTest {

	@Test
	public void test() {
		LiberoProfessionista lp = new LiberoProfessionista("Secondo", "La Polizia", "SCNLPZ", "AntonioPiva", 5);
		assertEquals(52.5, lp.calcolaParcella(), 0.00001);
	}

}
