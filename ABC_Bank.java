
public class ABC_Bank {
    public static void main(String[] args) {
        Client client01 = new Client(1001, "Amara", "Sri Lankan", "Doctor", "Colombo", 35, "male");
        client01.setPin(1111);
        client01.setCurrency("LKR");

        client01.createSavings(new SavingsAccount(111111, client01.getCurrency(), "Colombo", 100000));
        client01.createCurrent(new CurrentAccount(222222, client01.getCurrency(), "Kaluthara",50000));

        Client client02 = new Client(1002, "Charith", "Korean", "Engineer", "Middeniya", 23, "male");
        client02.setPin(1234);
        client02.setCurrency("Sterling Pound");

        client02.createSavings(new SavingsAccount(333333, client02.getCurrency(), "Hambantota", 69));

        ATM atm1 = new ATM(client01);
        atm1.proceed();
        atm1.proceed();

        atm1.setClient(client02);
        atm1.proceed();
        atm1.proceed();
    }
}
