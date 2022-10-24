import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
    public void infectedTest(){
        String covid = "SARS-COV-2";
        Infected disease = new Infected(covid);
        Assert.assertEquals("SARS-COV-2", disease.getDisease());
    }

    @Test
    public void infectedTestRt(){
        String covid = "SARS-COV-2";
        Infected disease = new Infected(covid, 10);
        disease.addInfected(6);
        disease.updateInfectedByRt(2);
        int infectedNumber = disease.getNumberOfInfected();
        Assert.assertEquals(32, infectedNumber, 0);
    }
}