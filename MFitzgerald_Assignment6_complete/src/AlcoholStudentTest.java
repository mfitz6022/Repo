import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlcoholStudentTest {

    private Alcohol alcohol;

    @BeforeEach
    public void setUp() {
        alcohol = new Alcohol("Whiskey", Size.LARGE, true);
    }

    @Test
    public void testGetWeekendOffer() {
        assertTrue(alcohol.getWeekendOffered());
    }

    @Test
    public void testSetWeekendOffer() {
        alcohol.setWeekendOffered(false);
        assertFalse(alcohol.getWeekendOffered());
    }

    @Test
    public void testCalcPrice() {
        assertEquals(4.6, alcohol.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expectedString = "name: Whiskey, size: LARGEoffered on weekend: true";
        assertEquals(expectedString, alcohol.toString());
    }

    @Test
    public void testEquals() {
        Alcohol sameAlcohol = new Alcohol("Whiskey", Size.LARGE, true);
        assertEquals(alcohol, sameAlcohol);
    }

    // Add more tests for other methods and edge cases in Alcohol class

}
