package calculator;

public class CalculatorPrototype implements CalculatorIF {
    @Override
    public int divide(int m, int n) {
        int division = 0;

        if (n == 0) {
            throw new ArithmeticException();
        }

        while (m >= n) {
            m = m - n;
            division += 1;
        }

        return division;
    }

    @Override
    public int multiply(int m, int n) {
        if (m == 0 || n == 0) return 0;

        int baseM = m;

        for (; n > 1; n--) {
            m = m + baseM;
        }

        return m;
    }

    @Override
    public int subtract(int m, int n) {
        for (; n > 0; n--) {
            m = m - 1;
        }

        return m;
    }

    @Override
    public int sum(int m, int n) {
        for (; n > 0; n--) {
            m = m + 1;
        }

        return m;
    }
}
