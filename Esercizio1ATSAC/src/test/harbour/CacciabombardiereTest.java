package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import main.harbour.Cacciabombardiere;

/**
 * NON MODIFICARE
 */
public class CacciabombardiereTest {

	@Test
	public void testPotenzaFuoco() {
		Cacciabombardiere a = new Cacciabombardiere();
		a.setnArmamentiAlpha(10);
		a.setnArmamentiBeta(20);
		int pf = a.potenzaFuoco();
		
		// la potenza di fuoco è 40 volte la somma
		// del numero di armamenti alpha e beta
		// => (10 + 20) * 40
		assertEquals(1200, pf);
	}

}
