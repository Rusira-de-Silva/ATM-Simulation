public abstract class Account {
    private int accnumber;
    protected String type;
    private String currency;
    private String branch;
    protected double balance;
    protected Loan loan;

    public Account(int accnumber, String currency, String branch, double balance) {
        this.accnumber = accnumber;
        this.currency = currency;
        this.branch = branch;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account number : " + this.accnumber + " Account type : " + this.type + " Account Balance : " + this.balance;
    }

    public abstract void getLoan(Loan loan);

    public int getAccnumber() {
        return accnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
