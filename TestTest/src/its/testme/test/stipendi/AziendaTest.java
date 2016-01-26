package its.testme.test.stipendi;

import static org.junit.Assert.*;

import org.junit.Test;

import its.testme.stipendi.Azienda;

public class AziendaTest {

	@Test
	public void testCalcolaStipendi() {
		Azienda azienda = new Azienda();
		azienda.setNumDipendenti(5);
		azienda.setPagaBase(1000);
		
		int tot = azienda.calcolaStipendi();
		
		assertEquals(5 * 1000, tot);
		
		azienda.setNumDipendenti(0);
		azienda.setPagaBase(1000);
		
		assertEquals(0, azienda.calcolaStipendi());
	}

}
