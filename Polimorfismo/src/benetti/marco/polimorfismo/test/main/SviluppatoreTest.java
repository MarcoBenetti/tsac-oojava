package benetti.marco.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import benetti.marco.polimorfismo.main.Sviluppatore;

public class SviluppatoreTest {

	@Test
	public void test() {
		Sviluppatore s = new Sviluppatore();
		s.setNome("Giacomo");
		s.setCognome("Zancan");
		s.setAnzianita(3);
		s.setPagaBase(1350);
		
		s.setLinguaggiConosciuti(new String[]{"Java"});
		
		assertEquals(1000, s.calcoloStipendio());
	}

}
