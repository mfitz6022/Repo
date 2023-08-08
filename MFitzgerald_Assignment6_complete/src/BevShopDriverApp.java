import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BevShop bevShop = new BevShop();
        
        String shouldContinue = "yes";
        
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer age: ");
        int customerAge = Integer.parseInt(scanner.nextLine());
        Customer customer = new Customer(customerName, customerAge);
        
        System.out.print("Enter order time (8-23): ");
        int orderTime = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter order day (MONDAY, TUESDAY, ...): ");
        Day orderDay = Day.valueOf(scanner.nextLine().toUpperCase());
        
        Order order = new Order(orderTime, orderDay, customer);
        bevShop.startNewOrder(order.getOrderTime(), order.getOrderDay(), order.getCustomer().getName(), order.getCustomer().getAge());
        
        while ((order.getTotalItems() < 4 && shouldContinue.equals("yes")) && 
               (bevShop.getNumOfAlcoholDrink() < BevShopInterface.MAX_ORDER_FOR_ALCOHOL || 
                customer.getAge() < BevShopInterface.MIN_AGE_FOR_ALCOHOL)) {
            System.out.println("Available beverage types: COFFEE, SMOOTHIE, ALCOHOL");
            System.out.print("Enter beverage type to add: ");
            String beverageType = scanner.nextLine().toUpperCase();
            System.out.print("Enter beverage name: ");
            String beverageName = scanner.nextLine();
            System.out.print("Enter beverage size (SMALL, MEDIUM, LARGE): ");
            Size beverageSize = Size.valueOf(scanner.nextLine().toUpperCase());
            
            if (beverageType.equals("COFFEE")) {
                System.out.print("Does it have extra shot (true/false): ");
                boolean extraShot = Boolean.parseBoolean(scanner.nextLine());
                System.out.print("Does it have extra syrup (true/false): ");
                boolean extraSyrup = Boolean.parseBoolean(scanner.nextLine());
                order.addNewBeverage(beverageName, beverageSize, extraShot, extraSyrup);
            } else if (beverageType.equals("SMOOTHIE")) {
                System.out.print("Enter number of fruits: ");
                int numOfFruits = Integer.parseInt(scanner.nextLine());
                System.out.print("Is protein added (true/false): ");
                boolean addProtein = Boolean.parseBoolean(scanner.nextLine());
                order.addNewBeverage(beverageName, beverageSize, numOfFruits, addProtein);
            } else if (beverageType.equals("ALCOHOL") && customer.getAge() >= BevShopInterface.MIN_AGE_FOR_ALCOHOL) {
                if (bevShop.getNumOfAlcoholDrink() < BevShopInterface.MAX_ORDER_FOR_ALCOHOL) {
                    order.addNewBeverage(beverageName, beverageSize);
                } else {
                    System.out.println("You have reached the maximum number of alcohol drinks for this order.");
                }
            }
            
            System.out.println("Current order total: $" + order.calcOrderTotal());
            System.out.println("Number of items in the order: " + order.getTotalItems());
            
            if (order.getTotalItems() < 4) {
            	System.out.print("Would you like to continue? (yes/no): ");
            	shouldContinue = scanner.nextLine().toLowerCase();
            }
        }
        
        // Display the final order details
        System.out.println("Final order details:");
        System.out.println(order);
        
        // Calculate and display the total monthly sale
        double totalMonthlySale = bevShop.totalMonthlySale();
        System.out.println("Total monthly sale: $" + totalMonthlySale);
    }
}
