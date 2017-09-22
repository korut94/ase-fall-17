import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTestPrototype {

    @Test
    public void testSum() {
        ProtoCalculator calculator = new ProtoCalculator();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }
    
    @Test
    public void testDivisionEven() {
        ProtoCalculator calculator = new ProtoCalculator();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
    }

    @Test
    public void testDivisionOdd() {
        ProtoCalculator calculator = new ProtoCalculator();
        int sum = calculator.divide(7,3);
        assertEquals(2, sum);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        ProtoCalculator calculator = new ProtoCalculator();
        int sum = calculator.divide(3,0);
    }

}