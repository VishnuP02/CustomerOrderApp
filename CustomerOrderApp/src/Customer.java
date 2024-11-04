import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a customer with a first name, last name, customer code, and a list of past orders.
 */
public class Customer {
    // Private fields
    private String firstName;
    private String lastName;
    private int customerCode;
    private List<Order> pastOrders;

    /**
     * Constructor to initialize the customer's information and past orders.
     * @param firstName The customer's first name.
     * @param lastName The customer's last name.
     * @param customerCode The customer's unique code.
     * @param orders Array of past orders for initialization.
     */
    public Customer(String firstName, String lastName, int customerCode, Order[] orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerCode = customerCode;
        this.pastOrders = new ArrayList<>();

        // Add orders to the list
        for (Order order : orders) {
            this.pastOrders.add(order);
        }
    }

    /**
     * Adds an order to the customer's past orders.
     * @param order The order to add.
     */
    public void addOrder(Order order) {
        pastOrders.add(order);
    }

    /**
     * Calculates the average total cost of all past orders.
     * @return The average total cost.
     */
    public double AveragePayment() {
        if (pastOrders.isEmpty()) {
            return 0.0;
        }

        double totalCost = 0.0;
        for (Order order : pastOrders) {
            totalCost += order.getTotalCost();
        }
        return totalCost / pastOrders.size();
    }

    /**
     * Returns a formatted string containing the customer's information.
     * @return A string representation of the customer.
     */
    @Override
    public String toString() {
        return String.format(
                "CUSTOMER INFORMATION\n" +
                        "Name : %s %s\n" +
                        "Id Code : %d",
                firstName, lastName, customerCode);
    }
}