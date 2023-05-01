public class Loan {
    private double amount;
    private double interest;
    private int duration;
    private String paymentMethod;

    public Loan(double amount, double interest, int duration, String paymentMethod) {
        this.amount = amount;
        this.interest = interest;
        this.duration = duration;
        this.paymentMethod = paymentMethod;
    }
}
