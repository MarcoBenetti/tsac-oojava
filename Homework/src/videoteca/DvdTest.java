package videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class DvdTest {

	@Test
	public void test() {
		Dvd d = new Dvd();
		
		assertEquals(500, d.calcolaCosto(3));
	}

}
