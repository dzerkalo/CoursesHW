package ACO7.week5.day2;

/**
 * Created by acer on 21.08.2015.
 */
public class Recursion {
    public static void main(String[] args) {
//    foo();
        System.out.println(fact(5));

        for (int i = 1; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fact(int n) {
        if (n <= 2) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void foo() {
        foo();
    }
}
