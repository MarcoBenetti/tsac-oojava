package videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class CassettaTest {

	@Test
	public void test() {
		Cassetta c = new Cassetta();
		
		assertEquals(500, c.calcolaCosto(3));
	}

}
