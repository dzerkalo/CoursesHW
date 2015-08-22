package Reload.Calculator;

/**
 * Created by acer on 20.08.2015.
 */
public class Calc implements ICalc {

    @Override
    public int summ(int a, int b){
        return a+b;
    }

    @Override
    public int min (int a, int b){
      return a-b;
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
