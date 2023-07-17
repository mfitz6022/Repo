
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestGFA {
	Property propertyOne;
	Property propertyTwo;
	Property propertyThree;


	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("test1", "Silver Spring", 0.0, "Matt Fitzgerald");
		propertyTwo = new Property("test2", "Rockville", 50000.00, "Steve Jobs");
		propertyThree = new Property("test3", "Germantown", 1738.0, "Bill Gates");
		
		propertyOne.setPlot(2, 6, 2, 6);
		propertyTwo.setPlot(6, 2, 6, 2);
		propertyThree.setPlot(1, 2, 3, 4);
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Property ABC", propertyOne.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(0.0, propertyOne.getRentAmount());
		assertEquals(50000.00, propertyTwo.getRentAmount());
		assertEquals(1738.0, propertyThree.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(2, propertyOne.getPlot().getX());
		assertEquals(6, propertyOne.getPlot().getY());
		assertEquals(2, propertyOne.getPlot().getWidth());
		assertEquals(6, propertyOne.getPlot().getDepth());
		
		assertEquals(6, propertyOne.getPlot().getX());
		assertEquals(2, propertyOne.getPlot().getY());
		assertEquals(6, propertyOne.getPlot().getWidth());
		assertEquals(2, propertyOne.getPlot().getDepth());
		
		assertEquals(1, propertyOne.getPlot().getX());
		assertEquals(2, propertyOne.getPlot().getY());
		assertEquals(3, propertyOne.getPlot().getWidth());
		assertEquals(4, propertyOne.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("test1,Silver Spring,Matt Fitzgerald,0.0",propertyOne.toString());
		assertEquals("test1,Rockville,Matt Fitzgerald,50000.00",propertyOne.toString());
		assertEquals("test1,Germantown,Matt Fitzgerald,1738.0",propertyOne.toString());
	}

}