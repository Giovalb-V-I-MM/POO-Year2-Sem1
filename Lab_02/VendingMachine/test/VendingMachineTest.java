import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
  @Test
  public void addCansTest(){
    VendingMachine machine = new VendingMachine();
    machine.addCans(10);
    Assert.assertEquals(10, machine.getNumberOfCans(), 0);
  }

  @Test
  public void takeCanTest(){
    VendingMachine machine = new VendingMachine();
    machine.addCans(10);
    machine.takeCan();
    Assert.assertEquals(9, machine.getNumberOfCans(), 0);
    Assert.assertEquals(1, machine.getNumberOfTokens(), 0);
  }

  @Test
  public void takeTokensTest(){
    VendingMachine machine = new VendingMachine();
    machine.addCans(10);
    machine.takeTokens();
    Assert.assertEquals(0, machine.getNumberOfTokens(), 0);
  }
}