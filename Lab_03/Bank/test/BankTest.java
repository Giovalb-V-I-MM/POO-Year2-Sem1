import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Giovanni");
        BankAccount newAccount = b.find(1);
        newAccount.deposit(1000);
        Assert.assertEquals(2000, newAccount.getBalance(), 0);
    }

    @Test
    public void withdrawTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Malacci");
        BankAccount newAccount = b.find(1);
        newAccount.withdraw(500);
        Assert.assertEquals(500, newAccount.getBalance(), 0);
    }

    @Test
    public void transferTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Nicolò");
        b.addAccount(1000, "Alberico");
        BankAccount a1 = b.find(1);
        BankAccount a2 = b.find(2);

        b.transfer(1, 2, 800);
        Assert.assertEquals(1800, a2.getBalance(), 0);
        Assert.assertEquals(200, a1.getBalance(), 0);
    }
}