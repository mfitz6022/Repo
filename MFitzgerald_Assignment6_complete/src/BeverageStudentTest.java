import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeverageStudentTest {

    private Beverage beverage;

    @BeforeEach
    public void setUp() {
        beverage = new Beverage("Coffee", Type.COFFEE, Size.MEDIUM);
    }

    @Test
    public void testGetName() {
        assertEquals("Coffee", beverage.getName());
    }

    @Test
    public void testGetType() {
        assertEquals(Type.COFFEE, beverage.getType());
    }

    @Test
    public void testGetSize() {
        assertEquals(Size.MEDIUM, beverage.getSize());
    }

    @Test
    public void testSetName() {
        beverage.setName("Latte");
        assertEquals("Latte", beverage.getName());
    }

    @Test
    public void testSetType() {
        beverage.setType(Type.ALCOHOL);
        assertEquals(Type.ALCOHOL, beverage.getType());
    }

    @Test
    public void testSetSize() {
        beverage.setSize(Size.SMALL);
        assertEquals(Size.SMALL, beverage.getSize());
    }

    @Test
    public void testCalcPrice() {
        assertEquals(3.0, beverage.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expectedString = "name: Coffee, size: MEDIUM";
        assertEquals(expectedString, beverage.toString());
    }

    @Test
    public void testEquals() {
        Beverage sameBeverage = new Beverage("Coffee", Type.COFFEE, Size.MEDIUM);
        assertEquals(beverage, sameBeverage);
    }

    // Add more tests for other methods and edge cases in Beverage class

}
