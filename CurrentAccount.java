public class CurrentAccount extends Account{

    public CurrentAccount(int accnumber, String currency, String branch, double balance) {
        super(accnumber, currency, branch, balance);
        this.type = "Current";
    }
    public void getLoan(Loan loan){
        this.loan = loan;
    }
}
