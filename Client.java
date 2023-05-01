import java.util.ArrayList;

public class Client {
    private final int id;
    private final String name;
    private String nationality;
    private String occupation;
    private String address;
    private int age;
    private final String gender;
    private int pin;
    private String currency;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Client(int id, String name, String nationality, String occupation, String address, int age, String gender){
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void createSavings(SavingsAccount savings){
        accounts.add(savings);
    }
    public void createCurrent(CurrentAccount current){
        accounts.add(current);
    }
}
