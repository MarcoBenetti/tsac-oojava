package aliens.test.gioco;

import static org.junit.Assert.*;

import org.junit.Test;

import aliens.Alieno;
import aliens.Giocatore;
import aliens.Gioco;

public class TestGioco {

	@Test
	public void test() {
		Alieno[] alieni = new Alieno[]{new Alieno("Qualcuno", 100), new Alieno("Qualcuno2", 1)};
		Gioco g = new Gioco(new Giocatore("Mario", 100), alieni);
		g.slaughter();
		assertEquals("He's dead, son.", g.stillAlive());
	}

}
