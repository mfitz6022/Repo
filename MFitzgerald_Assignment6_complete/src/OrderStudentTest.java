import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderStudentTest {

    private Order order;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 25);
        order = new Order(12, Day.MONDAY, customer);
    }

    @Test
    public void testAddNewBeverageCoffee() {
        order.addNewBeverage("dark coffee", Size.SMALL, true, false);
        
        assertEquals(1, order.getTotalItems());
        assertEquals(2.5, order.calcOrderTotal(), 0.01);
    }

    @Test
    public void testAddNewBeverageSmoothie() {
        order.addNewBeverage("strawberry-banana", Size.MEDIUM, 3, true);
        
        assertEquals(1, order.getTotalItems());
        assertEquals(6.0, order.calcOrderTotal(), 0.01);
    }

    @Test
    public void testAddNewBeverageAlcohol() {
        order.addNewBeverage("Mohito", Size.LARGE);
        
        assertEquals(1, order.getTotalItems());
        assertEquals(4.0, order.calcOrderTotal(), 0.01);
    }

    @Test
    public void testCalcOrderTotal() {
        order.addNewBeverage("dark coffee", Size.SMALL, false, false);
        order.addNewBeverage("strawberry-banana", Size.MEDIUM, 2, true);
        order.addNewBeverage("Mohito", Size.LARGE);
        
        assertEquals(11.5, order.calcOrderTotal(), 0.01);
    }
}
