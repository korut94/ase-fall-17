package calculator;

public interface CalculatorIF {
    /**
     * @return Given two integers, m and n, returns the result of m/n
     */
    int divide(int m, int n);
    /**
     * @return Given two integers, m and n, returns the result of m*n
     */
    int multiply(int m, int n);
    /**
     * @return Given two integers, m and n, returns the result of m-n
     */
    int subtract(int m, int n);
    /**
     * @return Given two integers, m and n, returns the result of m+n
     */
    int sum(int m, int n);
}
