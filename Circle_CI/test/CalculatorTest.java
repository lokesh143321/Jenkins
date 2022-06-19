import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void Add_Testing()
    {
        assertEquals("testpass",3,Calculator.add(1,2));

    }

    @Test
    public void Sub_Testing()
    {
        assertEquals("testpass",5,Calculator.sub(10,5));
    }

    @Test
    public void mul_Testing()
    {
        assertEquals("testpass",10,Calculator.mul(2,5));
    }


    @Test
    public void Div_Testing()
    {
        assertEquals("testpass",4,Calculator.div(8,2));
    }



}