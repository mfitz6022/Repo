import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gradeBook1 = new GradeBook(5);
	GradeBook gradeBook2 = new GradeBook(5);

	@BeforeEach
	void setUp() throws Exception {
		gradeBook1.addScore(96);
		gradeBook1.addScore(87);
		gradeBook1.addScore(78);
		
		gradeBook2.addScore(98);
		gradeBook2.addScore(89);
		gradeBook2.addScore(80);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void test() {
		assertTrue(gradeBook1.toString().equals("96.0 87.0 78.0 0.0 0.0 "));
		assertTrue(gradeBook2.toString().equals("98.0 89.0 80.0 0.0 0.0 "));
		
		assertEquals(3, gradeBook1.getScoreSize());
		assertEquals(3, gradeBook2.getScoreSize());
		
		assertEquals(261, gradeBook1.sum());
		assertEquals(267, gradeBook2.sum());
		
		assertEquals(78.0, gradeBook1.minimum());
		assertEquals(80.0, gradeBook2.minimum());
		
		assertEquals(78.0, gradeBook1.finalScore());
		assertEquals(80.0, gradeBook2.finalScore());
	}

}
