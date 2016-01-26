package benetti.marco.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import benetti.marco.polimorfismo.main.Dipendente;

public class DipendenteTest {

	@Test
	public void test() {
		Dipendente d = new Dipendente();
		d.setNome("Mimmo");
		d.setCognome("Alemanno");
		d.setAnzianita(5);
		d.setPagaBase(1000);
		
		assertEquals(1100, d.calcoloStipendio());
	}

}
