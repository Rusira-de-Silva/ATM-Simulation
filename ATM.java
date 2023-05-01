import java.util.Scanner;

public class ATM {
    private int id = 111;
    private Client client;

    public ATM(Client client) {
        this.client = client;
    }
    public Transaction viewBalance(Account acc, Transaction transaction){
        transaction.setAmount(acc.getBalance());
        System.out.println("Current balance is : " + acc.getBalance());
        transaction.setStatus("Success");
        transaction.setType("Balance Inquiries");
        return transaction;
    }

    public Transaction withdraw(Account acc, Transaction transaction, double amount){
        if (amount > acc.getBalance()-1000) {
            System.out.println("Not enough funds");
            transaction.setStatus("Failed");
        } else {
            acc.setBalance(acc.getBalance() - amount);
            transaction.setAmount(amount);
            System.out.println("Withdrawn amount : " + amount);
            transaction.setStatus("Success");
        }
        transaction.setType("Withdraw");
        return transaction;
    }
    public Transaction deposit(Account acc, Transaction transaction, double amount){
        transaction.setAmount(amount);
        System.out.println("Deposited amount : " + amount);
        acc.setBalance(acc.getBalance() + amount);
        transaction.setStatus("Success");
        transaction.setType("Deposit");
        return transaction;
    }
    public void proceed(){
        System.out.println("Welcome!");
        System.out.println("Enter your PIN");
        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() != client.getPin()){
            System.out.println("Incorrect PIN!");
        }
        else {
            for (Account acc : client.getAccounts()) {
                System.out.println(acc);
            }
            System.out.println("Select an account : ");
            Account selectedAcc = client.getAccounts().get(scan.nextInt() - 1);
            System.out.println("Main Menu -: ");
            System.out.println("1.View balance");
            System.out.println("2.Withdraw money");
            System.out.println("3.Deposit money.");
            System.out.println("4.Exit.");
            Transaction transaction = new Transaction(id++, selectedAcc.getAccnumber(), "24/04/2023");
            switch (scan.nextInt()) {
                case 1 -> {
                    transaction = viewBalance(selectedAcc, transaction);
                }
                case 2 -> {
                    System.out.println("Enter amount :");
                    transaction = withdraw(selectedAcc, transaction, scan.nextDouble());
                }
                case 3 -> {
                    System.out.println("Enter amount :");
                    transaction = deposit(selectedAcc, transaction, scan.nextDouble());
                }
                case 4 -> {
                    System.out.println("Exiting.........");
                    transaction.setStatus("Canceled");
                }
            }
            System.out.println(transaction + "\n" + '\n');
        }
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
