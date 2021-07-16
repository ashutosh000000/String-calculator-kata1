import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    private Addition addition;

    @before
    public void setUp(){
        addition = new Addition();
    }
    @Test
    public void emptyString(){
        String no ="";
        int sum = addition.add(no);
        Assert.assertEquals(0, sum);
    }

}
