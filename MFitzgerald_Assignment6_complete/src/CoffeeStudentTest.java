import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeStudentTest {

    private Coffee coffee;

    @BeforeEach
    public void setUp() {
        coffee = new Coffee("Espresso", Size.SMALL, true, false);
    }

    @Test
    public void testHasExtraShot() {
        assertTrue(coffee.hasExtraShot());
    }

    @Test
    public void testHasExtraSyrup() {
        assertFalse(coffee.hasExtraSyrup());
    }

    @Test
    public void testCalcPrice() {
        assertEquals(2.5, coffee.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expectedString = "name: Espresso, size: SMALLextra shot: true extra syrup: false price: 2.5";
        assertEquals(expectedString, coffee.toString());
    }

    @Test
    public void testEquals() {
        Coffee sameCoffee = new Coffee("Espresso", Size.SMALL, true, false);
        assertEquals(coffee, sameCoffee);
    }

    // Add more tests for other methods and edge cases in Coffee class

}
