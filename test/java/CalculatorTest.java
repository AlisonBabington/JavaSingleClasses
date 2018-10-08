//Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide,
//        each taking in two integers to perform the calculations on.

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
      public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(15, calculator.add(5,10));
    }

    @Test
    public void canSubtract() {
        assertEquals(63, calculator.subtract(65, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(20, calculator.multiply(5, 4));
    }

    @Test
    public void canDivide() {
        assertEquals(10, calculator.divide(30, 3));
    }
}
