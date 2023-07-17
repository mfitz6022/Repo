import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
	
	ManagementCompany managementCompany ; 
	
	@Before
	public void setUp() throws Exception {
		
		managementCompany = new ManagementCompany("FITZ", "1235",6);
	 
		managementCompany.addProperty("test1", "Silver Spring", 1234.56, "John Smith",2,1,2,2);
		managementCompany.addProperty("test2", "Rockville", 5432.10, "Matt Fitzgerald",4,1,2,2);
		managementCompany.addProperty("test3", "Germantown", 2468.80, "Steve Jobs",6,1,2,2);
	}

	@After
	public void tearDown() {
		managementCompany=null;
	}

 	@Test
	public void testAddPropertyWithPlot() {

		assertEquals(managementCompany.addProperty("test5", "Silver Spring", 1234.56, "Bill Gates",1,4,2,2),3,0); 
		assertEquals(managementCompany.addProperty("test6", "Rockville", 5432.10, "Joe Schmoe",3,4,2,2),4,0); 
		assertEquals(managementCompany.addProperty("test7", "Germantown", 2468.80, "Fake Guy",3,6,2,2),-1,0); 
	}
 	
	@Test
	public void testAddPropertyDefaultPlot() {

		assertEquals(managementCompany.addProperty("test8", "Silver Spring", 1000, "Jim Bo"),3,0); 
		assertEquals(managementCompany.addProperty("test9", "Rockville", 3000, "Frank Guy",3,4,2,2),4,0); 
		assertEquals(managementCompany.addProperty("test10", "Germantown", 3000, "James Dude",3,6,2,2),-1,0);	
	}


	@Test
	public void testTotalRent() {

		assertEquals(managementCompany.getTotalRent(),9135.46);
	}

 }
