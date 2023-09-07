import java.util.Scanner;

public class Account {
    private int accountNumber;
    private double amount;
    Scanner scan = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    static void withdraw(){

    }
}
