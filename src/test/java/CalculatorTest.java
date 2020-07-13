import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void subtract(){
        assertEquals(2, calculator.subtract(6,4));
    }

    @Test
    public void multiply(){
        assertEquals(10, calculator.multiply(2,5));
    }

    @Test
    public void divide(){
        assertEquals(15, calculator.divide(30,2), 0.01);
    }
}
