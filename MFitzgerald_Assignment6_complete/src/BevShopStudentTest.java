import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BevShopStudentTest {

    private BevShop bevShop;

    @BeforeEach
    public void setUp() {
        bevShop = new BevShop();
    }

    @Test
    public void testIsEligibleForMore() {
        assertTrue(bevShop.isEligibleForMore());
    }

    @Test
    public void testAddOrderAndGetOrderAtIndex() {
        Order order = new Order(12, Day.MONDAY, new Customer("John", 25));
        bevShop.addOrder(order);
        
        assertEquals(order, bevShop.getOrderAtIndex(0));
    }

    @Test
    public void testTotalMonthlySale() {
        Order order1 = new Order(12, Day.MONDAY, new Customer("John", 25));
        Order order2 = new Order(14, Day.TUESDAY, new Customer("Alice", 28));
        bevShop.addOrder(order1);
        bevShop.addOrder(order2);
        
        double expectedTotalSale = order1.calcOrderTotal() + order2.calcOrderTotal();
        assertEquals(expectedTotalSale, bevShop.totalMonthlySale(), 0.01);
    }

    @Test
    public void testTotalNumOfMonthlyOrders() {
        Order order1 = new Order(12, Day.MONDAY, new Customer("John", 25));
        Order order2 = new Order(14, Day.TUESDAY, new Customer("Alice", 28));
        bevShop.addOrder(order1);
        bevShop.addOrder(order2);
        
        assertEquals(2, bevShop.totalNumOfMonthlyOrders());
    }

}
