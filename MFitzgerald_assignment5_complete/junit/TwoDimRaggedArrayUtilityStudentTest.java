
import static org.junit.Assert.*;

public class TwoDimRaggedArrayUtilityStudentTest {
	private double[][] dataSet1 = {{1.1, 2.2, 3.3, 4.4}, {5.5, 6.6, 7.7}, {8.8, 9.9}};
	private double[][] dataSet2 = {{-169999999999999993.0}, {0.0}, {1.1, -2.2, 3.3}, {-4.5, 5.5, -6.6, 169999999999999993.0}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetRowTotalStudent() {
		assertEquals(11.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,0),.001);
		assertEquals(-1700000000000000000.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,0),.001);
	}
	
	@Test
	public void testGetTotalStudent() {
		assertEquals(49.5,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getTotal(dataSet2),.001);
	}

	@Test
	public void testGetColumnTotalStudent() {
		assertEquals(15.4,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
		assertEquals(-1700000000000000000.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet2,0),.001);
	}

	@Test
	public void testGetHighestInRowStudent() {
		assertEquals(4.4,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,0),.001);
		assertEquals(1700000000000000000.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet2,2),.001);
	}

	@Test
	public void testGetHighestInRowIndexStudent() {
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,0));
		assertEquals(1,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2,2));
	}

	@Test
	public void testGetLowestInColumnStudent() {
		assertEquals(1.1,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,0),.001);
		assertEquals(-1700000000000000000.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2,0),.001);
	}

	@Test
	public void testGetLowestInColumnIndexStudent() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,0));
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2,0));
	}

	@Test
	public void testGetLowestInArrayStudent() {
		assertEquals(1.1,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
		assertEquals(-1700000000000000000.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet2),.001);
	}
}
