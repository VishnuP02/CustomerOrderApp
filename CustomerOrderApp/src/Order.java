/**
 * This class represents an order with sales tax and shipping cost.
 */
public class Order {
    // Fields
    private double salesTaxRate; // sales tax rate as a decimal
    private double subtotal; // subtotal of the order
    private double shippingCost; // shipping cost of the order
    private double salesTax; // sales tax of the order
    private double totalCost; // total cost of the order

    /**
     * Constructor to set the sales tax rate and initialize other fields to zero.
     * @param salesTaxRate The sales tax rate as a decimal.
     */
    public Order(double salesTaxRate) {
        this.salesTaxRate = salesTaxRate;
        this.subtotal = 0.0;
        this.shippingCost = 0.0;
        this.salesTax = 0.0;
        this.totalCost = 0.0;
    }

    /**
     * Sets the cost of the order and calculates the sales tax and total cost.
     * @param subtotal The subtotal of the order.
     */
    public void setCost(double subtotal) {
        this.subtotal = subtotal;
        this.salesTax = calculateSalesTax();
        this.shippingCost = calculateShippingCost();
        this.totalCost = calculateTotalCost();
    }

    // Helper method to calculate sales tax
    private double calculateSalesTax() {
        return subtotal * salesTaxRate;
    }

    // Helper method to calculate shipping cost
    private double calculateShippingCost() {
        if (subtotal <= 50.0) {
            return subtotal * 0.08; // 8% of subtotal
        } else {
            return 0.0; // free shipping
        }
    }

    // Helper method to calculate total cost
    private double calculateTotalCost() {
        return subtotal + salesTax + shippingCost;
    }

    // Getters for the fields (optional)
    public double getSubtotal() {
        return subtotal;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}