package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import main.harbour.Cacciabombardiere;
import main.harbour.Gioco;
import main.harbour.Invasore;
import main.harbour.Porto;
import main.harbour.Sottomarino;

/**
 * NON MODIFICARE
 */
public class GiocoTest {

	@Test
	public void testAttacco() {
		
		Porto p = new Porto();
		p.setDimensioneSqMeters(5000);
		
		Gioco gioco = new Gioco(p);
		
		Sottomarino s = new Sottomarino();
		s.setnArmamenti(13);
		s.setStazza(47);
		
		Cacciabombardiere a = new Cacciabombardiere();
		a.setnArmamentiAlpha(10);
		a.setnArmamentiBeta(20);
		
		Invasore[] invasoriA = new Invasore[]{ s, a };
		/*
		 * L'attacco somma la potenza di fuoco degli invasori e 
		 * distrugge il porto secondo questa equazione:
		 * metri_quadri_distrutti_del_porto = potenza_di_fuoco_invasori * 2.5
		 */
		
		gioco.attacco(invasoriA);
		assertFalse(gioco.portoDistrutto());
		
		Cacciabombardiere a2 = new Cacciabombardiere();
		a2.setnArmamentiAlpha(10);
		a2.setnArmamentiBeta(20);
		
		Invasore[] invasoriB = new Invasore[]{ s, a, a2 };
		gioco.attacco(invasoriB);
		assertTrue(gioco.portoDistrutto());
		
	}

}
