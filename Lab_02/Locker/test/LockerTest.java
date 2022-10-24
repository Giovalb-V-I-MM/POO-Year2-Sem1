import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;

public class LockerTest {
    @Test
    public void newLocker(){
        Locker locker = new Locker();
        Scanner in = new Scanner(System.in);

        System.out.print("New code: ");
        String code = in.nextLine();
        locker.newComb(code);

        locker.lock();
        Assert.assertFalse(locker.isOpen());

        locker.unlock(code);
        Assert.assertTrue(locker.isOpen());

    }
}