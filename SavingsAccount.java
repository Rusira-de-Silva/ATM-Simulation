public class SavingsAccount extends Account{

    private double interestRate;
    public SavingsAccount(int accnumber, String currency, String branch, double balance) {
        super(accnumber, currency, branch, balance);
        this.type = "Savings";
    }

    @Override
    public void getLoan(Loan loan) {
        this.loan = loan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calInterest(double balance){
        this.balance += balance * interestRate;
    }

}
