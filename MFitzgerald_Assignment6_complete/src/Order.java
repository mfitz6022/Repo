import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order implements OrderInterface{
    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private List<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.customer = customer;
        this.orderDay = orderDay;
        this.orderNumber = generateRandomOrderNumber();
        this.orderTime = orderTime; 
        this.beverages = new ArrayList<>();
    }

    private int generateRandomOrderNumber() {
        Random random = new Random();
        return random.nextInt(80001) + 10000;
    }

    @Override
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(coffee);
    }

    @Override
    public void addNewBeverage(String bevName, Size size) {
        Alcohol alcohol = new Alcohol(bevName, size, false);
        beverages.add(alcohol);
    }

    @Override
    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(smoothie);
    }

    @Override
    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    @Override
    public Beverage getBeverage(int itemNo) {
        if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        }
        return null;
    }

    @Override
    public double calcOrderTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }

    @Override
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order Number: ").append(orderNumber)
                    .append("\nOrder Time: ").append(orderTime)
                    .append("\nOrder Day: ").append(orderDay)
                    .append("\nCustomer: ").append(customer)
                    .append("\nBeverages:");

        for (Beverage beverage : beverages) {
            orderDetails.append("\n").append(beverage.toString());
        }

        return orderDetails.toString();
    }

    public int compareTo(Order other) {
        if (this.orderNumber == other.orderNumber) {
            return 0;
        } else if (this.orderNumber > other.orderNumber) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }
    
    public int getTotalItems() {
    	return beverages.size();
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer); 
    }

    public List<Beverage> getBeverages() {
        return new ArrayList<>(beverages); 
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = new ArrayList<>(beverages); 
    }
}
