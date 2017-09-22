public class ProtoCalculator implements CalculatorIF {
    @Override
    public int divide(int m, int n) {
        int division = 0;

        while (m > n) {
            m = m - n;
            division = division + 1;
        }

        if (m != 0) {
            division -= 1;
        }

        return division;
    }

    @Override
    public int multiplication(int m, int n) {
        for (int i = 0; i < n; i++) {
            m = m + n;
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