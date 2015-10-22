package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	private PlanetExplorer testPlanetExplorer = new PlanetExplorer(3, 3, null);
	private int y;
	private int x; 
	String[][] testGrid = new String [x][y]; 

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPlanetExplorerIsCreated3x3() {
		testPlanetExplorer = new PlanetExplorer(3, 3, null);
		testGrid = new String [3][3];
		
		assertEquals("", testGrid);
		
	}
	
	
	@Test
	public void testTheExplorerMovesToNorthFromStart() {
		testPlanetExplorer = new PlanetExplorer(3, 3, null);
		
		assertEquals("01NORTH", testPlanetExplorer.executeCommand("f") );
			
	}
}
