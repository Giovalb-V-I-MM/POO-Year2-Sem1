import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testDrive(){
        Car punto = new Car((8.333/100));
        punto.addGas(50);
        Assert.assertEquals(50, punto.getGas(), 0);
        punto.drive(12);
        Assert.assertEquals(49, punto.getGas(), 1);
    }
}