package videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BluRayTest {

	@Test
	public void test() {
		BluRay b = new BluRay();
		
		assertEquals(161, b.calcolaCosto(6));
	}

}
