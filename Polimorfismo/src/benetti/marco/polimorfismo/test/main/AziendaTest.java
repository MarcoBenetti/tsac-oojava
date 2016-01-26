package benetti.marco.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import benetti.marco.polimorfismo.main.Azienda;
import benetti.marco.polimorfismo.main.Dipendente;
import benetti.marco.polimorfismo.main.Manager;
import benetti.marco.polimorfismo.main.Sviluppatore;

public class AziendaTest {

	@Test
	public void test() {
		
		Manager m = new Manager();
		m.setAnzianita(10);
		m.setBonus(100);
		m.setPagaBase(10000);
		m.setNome("Primo");
		m.setCognome("Levi");
		
		Sviluppatore s = new Sviluppatore();
		s.setAnzianita(10);
		s.setPagaBase(10000);
		s.setNome("Secondo");
		s.setCognome("La Polizia");
		
		Sviluppatore s2 = new Sviluppatore();
		s2.setAnzianita(5);
		s2.setPagaBase(10000);
		s2.setNome("Terzo");
		s2.setCognome("Tempo");
		
		Dipendente[] dipendenti = new Dipendente[] {m, s, s2};
		
		Azienda a = new Azienda();
		a.setDipendenti(dipendenti);
		a.setRagioneSociale("LOL");
		
		assertEquals(14100, a.totaleStipendi());
	}

}
