package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import main.harbour.Porto;

/**
* NON MODIFICARE
*/
public class PortoTest {

	private static final double EPSILON = 0.01;
	
	@Test
	public void testAddMetriQuadriDistrutti() {
		
		Porto p = new Porto();
		p.setDimensioneSqMeters(20);
		
		assertEquals(20, p.getDimensioneSqMeters(), EPSILON);
		assertEquals(20, p.getDimensioneSqMetersNonDistrutta(), EPSILON);
		
		p.addMetriQuadriDistrutti(12.5);
		assertEquals(20, p.getDimensioneSqMeters(), EPSILON);
		assertEquals(7.5, p.getDimensioneSqMetersNonDistrutta(), EPSILON);
		
		p.addMetriQuadriDistrutti(12.5);
		assertEquals(20, p.getDimensioneSqMeters(), EPSILON);
		assertEquals(0, p.getDimensioneSqMetersNonDistrutta(), EPSILON);
		
	}

}
