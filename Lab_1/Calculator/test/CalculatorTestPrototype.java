import static org.junit.Assert.assertEquals;

import calculator.CalculatorPrototype;
import org.junit.Test;

public class CalculatorTestPrototype {
    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }

    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int division = calculator.divide(6,3);
        assertEquals(2, division);
    }

    @Test
    public void testDivisionOdd() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int division = calculator.divide(7,3);
        assertEquals(2, division);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int division = calculator.divide(3,0);
    }
}
