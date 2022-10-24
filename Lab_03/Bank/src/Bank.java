import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        BankAccount b = new BankAccount(initialBalance, customerName);
        this.accounts.add(b);
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        for(BankAccount ba : this.accounts){
            if(ba.getAccountNumber() == accountNumber)
                ba.deposit(amount);
        }
    }

    public void withdraw(int accountNumber, double amount) {
        for(BankAccount ba : this.accounts){
            if(ba.getAccountNumber() == accountNumber)
                ba.withdraw(amount);
        }
    }

    public double getBalance(int accountNumber) {
        for(BankAccount ba : this.accounts){
            if(ba.getAccountNumber() == accountNumber)
                return ba.getBalance();
        }
        return 0;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        for(BankAccount ba : this.accounts){
            if(ba.getAccountNumber() == fromAccountNumber)
                ba.withdraw(amount);
        }
        for(BankAccount ba: this.accounts){
            if(ba.getAccountNumber() == toAccountNumber)
                ba.deposit(amount);
        }
    }
}