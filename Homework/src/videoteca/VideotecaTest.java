package videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideotecaTest {

	@Test
	public void test() {
		Cassetta c = new Cassetta();
		Dvd d = new Dvd();
		BluRay b = new BluRay();
		
		Film[] f = new Film[]{c, d, b};
		
		Videoteca v = new Videoteca();
		v.setElenco(f);
		
		assertEquals(1121, v.calcolaTotale(3));
	}

}
