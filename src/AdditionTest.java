import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
    private Addition addition;

    @Before
    public void setUp(){
        addition = new Addition();
    }
    @Test
    public void emptyString(){
        String no ="";
        int sum = addition.add(no);
        Assert.assertEquals(0, sum);
    }
    @Test
    public void singleNumber(){
        String no = "12";
        int sum = addition.add(no);
        Assert.assertEquals(12,sum);
    }
}
