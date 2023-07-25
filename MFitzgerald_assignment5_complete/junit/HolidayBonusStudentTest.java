
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusStudentTest {
	private double[][] dataSet1 = {{1.1, 2.2, 3.3, 4.4}, {5.5, 6.6, 7.7}, {8.8, 9.9}};
	private double[][] dataSet2 = {{-169999999999999993.0}, {0.0}, {1.1, -2.2, 3.3}, {-4.5, 5.5, -6.6, 169999999999999993.0}};
	
	@Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}
	
	@Test
	public void testCalculateHolidayBonusStudent() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(8000.0, result[0], .001);
			assertEquals(9000.0, result[1], .001);
			assertEquals(10000.0, result[2], .001);

			result = HolidayBonus.calculateHolidayBonus(dataSet2);
			assertEquals(0.0, result[0], .001);
			assertEquals(0.0, result[1], .001);
			assertEquals(5000.0, result[2], .001);
			assertEquals(10000.0, result[3], .001);

		} catch (Exception e) {
			fail("This should not have caused an Exception");
	    }
	}
	
	@Test
	public void testCalculateTotalHolidayStudent() {
		assertEquals(27000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
		assertEquals(15000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
	}
}
