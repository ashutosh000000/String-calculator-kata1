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
    @Test
    public void numberWithComma(){
        String no = "12,";
        int sum = addition.add(no);
        Assert.assertEquals(12,sum);
    }
    @Test
    public void addingTwoNumber(){
        String no = "12,3";
        int sum = addition.add(no);
        Assert.assertEquals(15, sum);
    }
    @Test
    public void 
}
