package commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImprenditoreTest {

	@Test
	public void test() {
		Imprenditore i = new Imprenditore("Terzo", "Tempo", "TRZTMP", "AntonioPiva", "NOME", 5);
		assertEquals(50000, i.calcolaParcella());
		
		Imprenditore i2 = new Imprenditore("Quarto", "Grado", "QRTGRD", "AntonioPiva2", "NOME2", 105);
		assertEquals(50500, i2.calcolaParcella());
	}

}
