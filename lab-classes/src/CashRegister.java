import java.text.*;

/**
 * The cash register stores cash.
 *
 * You can add cash to the cash register.
 */
public class CashRegister {
    private double cash;

    public CashRegister(double cash) {

    }

    private String formatted(double value) {
        DecimalFormat f = new DecimalFormat("###, ##0.00");
        return f.format(value);
    }

    public double addCash(double cash) {
        this.cash += cash;
        return cash;
    }

    /**
     * Return a string in the form:
     *
     * Cash register: $[cash]
     *
     * e.g. "Cash register: $29.90"
     *
     * If there is no cash, instead return:
     *
     * "Cash register: empty"
     */

    @Override
    public String toString() {
        if (cash == 0) {
            return "Cash register: empty";
        }
        return "Cash register: $" + formatted(this.cash);
    }
}
