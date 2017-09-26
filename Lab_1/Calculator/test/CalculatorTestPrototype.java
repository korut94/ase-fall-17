import static org.junit.Assert.assertEquals;

import calculator.CalculatorPrototype;
import org.junit.Test;

public class CalculatorTestPrototype {
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int division = calculator.divide(3,0);
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

    @Test
    public void testMultiplication() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int multiplication = calculator.multiply(4, 3);
        assertEquals(12, multiplication);
    }

    @Test
    public void testMultiplicationByOne() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int multiplication = calculator.multiply(7, 1);
        assertEquals(7, multiplication);
    }

    @Test
    public void testMultiplicationByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int multiplication = calculator.multiply(7, 0);
        assertEquals(0, multiplication);
    }

    @Test
    public void testMultiplicationCommutative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int x = 10, y = 6;
        int mult1 = calculator.multiply(x, y);
        int mult2 = calculator.multiply(y, x);
        assertEquals(mult1, mult2);
    }

    @Test
    public void testMultiplicationCommutativeByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult1 = calculator.multiply(1, 0);
        int mult2 = calculator.multiply(0, 9);
        assertEquals(0, mult1);
        assertEquals(0, mult2);
    }

    @Test
    public void testSubtraction() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(5, 1);
        assertEquals(4, sub);
    }

    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }
}
