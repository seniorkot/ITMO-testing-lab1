package ru.seniorkot.testing.lab1.task1;

public class Function {
    private static double doubleFact(double n){
        if (n <= 0) {
            return 1;
        }
        return (n-1) / n * doubleFact(n-2);
    }

    public static double arcsin(double x, double eps){
        if (Math.abs(x) > 1.0){
            return Double.NaN;
        }
        int n = 1;
        double result = x;
        double prevResult;
        do {
            prevResult = result;
            double fac = doubleFact(2 * n);
            result += fac * Math.pow(x, 2 * n + 1) / (2 * n + 1);
            n++;
        } while (Math.abs(result - prevResult) > eps);
        return result;
    }
}
