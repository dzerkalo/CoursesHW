package ACO7.week4.day2.Calc;

import ACO7.week4.day2.Calc.ICalculator;

/**
 * Created by acer on 11.08.2015.
 */
public class SimpleCalculator implements ICalculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
