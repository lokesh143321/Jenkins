import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {
    public static  Calculator calcint;
    @Test
    public void addtestPassInt()
    {
        Assert.assertEquals(7, calcint.add((int) calcint.add(1, 2), (int) calcint.add(4, 0)));

    }

    @Test
    public void subtestPassInt()
    {
        Assert.assertEquals(3, calcint.sub((int) calcint.sub(9, 3), (int) calcint.sub(3, 0)));

    }
    @Test
    public void multestPassInt()
    {
        Assert.assertEquals(27, calcint.mul((int) calcint.mul(1, 3), (int) calcint.mul(3, 3)));

    }
    @Test
    public void divtestPassInt()
    {
        Assert.assertEquals(1, calcint.div((int) calcint.div(8, 8), (int) calcint.div(8, 8)));

    }


}