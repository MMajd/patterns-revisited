package ChainOfResposibility.Abstract;

public abstract class BaseFinancialReport {
    protected double total;

    public BaseFinancialReport(final double total) {
        this.total = total;
    }

    public double getValue() {
        return total;
    }
}
