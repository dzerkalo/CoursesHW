package Reload.Calculator;

import java.util.Scanner;

/**
 * Created by acer on 20.08.2015.
 */
public class CalcApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        System.out.println("What you want to do whith numbers");
        String oper = sc.next();

        ICalc culc = new Calc();

        int res = 0;
        switch (oper.charAt(0)) {
            case '+':
                res = culc.summ(first, second);
                break;

            case '-':
                res = culc.min(first, second);
                break;

            case '*':
                res = culc.mult(first, second);
                break;

            case '/':
                res = culc.div(first, second);
                break;

            default:
                System.out.println("Incorrect input");
        }

        System.out.println("Result = " + res);

    }
}
