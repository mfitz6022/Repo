import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmoothieStudentTest {

    private Smoothie smoothie;

    @BeforeEach
    public void setUp() {
        smoothie = new Smoothie("Berry Blast", Size.MEDIUM, 3, true);
    }

    @Test
    public void testGetNumOfFruits() {
        assertEquals(3, smoothie.getNumFruits());
    }

    @Test
    public void testHasProtein() {
        assertTrue(smoothie.getProteinAdded());
    }

    @Test
    public void testCalcPrice() {
        assertEquals(6.0, smoothie.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expectedString = "name: Berry Blast, size: MEDIUMnumber of fruits: 3protein added: true";
        assertEquals(expectedString, smoothie.toString());
    }

    @Test
    public void testEquals() {
        Smoothie sameSmoothie = new Smoothie("Berry Blast", Size.MEDIUM, 3, true);
        assertEquals(smoothie, sameSmoothie);
    }

}
