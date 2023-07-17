import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotTestStudent {
	private Plot plot1, plot2, plot3, plot4;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(2,2,6,6); 
		plot2 = new Plot(1,1,3,2);
		plot3 = new Plot(6,1,4,2);
		plot4 = new Plot(3,4,4,3);
	}

	@After
	public void tearDown() throws Exception {
		plot1=null;
	}

	@Test
	public void testOverlaps1() {
		assertTrue(plot1.overlaps(plot4)); 
		assertTrue(plot4.overlaps(plot1));
		
		assertTrue(plot1.overlaps(plot2)); 
		assertTrue(plot2.overlaps(plot1));
		
		assertTrue(plot1.overlaps(plot3)); 
		assertTrue(plot3.overlaps(plot1));
	}
	
	@Test
	public void testEncompasses() {
		assertTrue(plot1.encompasses(plot4)); 
		assertFalse(plot4.encompasses(plot1));	
		assertFalse(plot2.encompasses(plot1)); 
		assertFalse(plot1.encompasses(plot2)); 
	}

}