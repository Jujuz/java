import org.w3c.dom.ls.LSOutput;

import java.text.*;

/**
 * Each product has a name, stock and price.
 *
 * You can sell and restock a product.
 */
public class Product {
    // insert 3 fields here
    private double price;
    private int stock;
    private String name;
    // insert 1 constructor here

    public Product (String name, int stock, double price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    /**
     * This pseudo-procedure sells "n" amount of stock.
     * The stock should decrease by "n".
     *
     * This method also returns the money earned from the sale.
     *
     * This is a rare occasion where a procedure returns something.
     */


    public double sell(int n) {
        double amountSold = n * (this.price);
//TODO If the stock amount goes below zero, return fail.
        if (stock - n >= 0 ) {
            this.stock = stock - n;
            return amountSold; // a dummy return value - which you will change
        }
        return 0;
    }

    /**
     * Add "n" amount to this product's stock.
     */
    public void restock(int n) {
        this.stock = stock + n;
    }

    /**
     * Return a string in the form:
     *
     * [stock] [name] at $[price]
     *
     * e.g. "200 Sticky tape at $2.99"
     *
     * DO NOT hard code the data in this string
     * or you will be penalised for a spoof.
     */
    @Override
    public String toString() {
        return this.stock + " " + this.name + " at $" + this.price;
    }
}
