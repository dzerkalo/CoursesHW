package ACO7.week2.day2;

/**
 * Created by acer on 20.07.2015.
 */
public class Ex2 {
    public static void main(String[] args) {
        IntNumber n1 = new IntNumber(5);
        IntNumber n2 = new IntNumber(5);
        System.out.println(n1.toString());
//    System.out.println(n1);

        toStringTranslator(n1);
        toStringTranslator(new Dragon(100, "Black"));

        System.out.println(n1.equals(n2));
    }

    public static void toStringTranslator(Object obj) {
        System.out.println(obj.toString());
    }
}
