public class Transaction {
    private final int transId;
    private final int bankAccId;
    private String date;
    private String status;
    private String type;
    private double amount;

    public Transaction(int transId, int bankAccId, String date) {
        this.transId = transId;
        this.bankAccId = bankAccId;
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction Receipt -->" +
                "Transaction Id = " + transId +
                ", Bank Account Id = " + bankAccId +
                ", Date = '" + date + '\'' +
                ", Transaction Type = '" + type + '\'' +
                ", Transaction Status = '" + status + '\'';
    }
}
