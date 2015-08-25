package ACO7.week3.day2;


import ACO7.week2.day2.IntNumber;

public class Ex3 {
    public static void main(String[] args) {
        IntNumber num1 = new IntNumber(4);
//    final IntNumber n1 = new IntNumber(4);
        num1 = num1.add(new IntNumber(3));
        System.out.println(num1);


        String s = "test";
        s = s + "!";
        System.out.println(s);


//    String res = "";
//    for (int i = 0; i < 1000000; i++) {
//      res += i;
//    }
//    System.out.println(res);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            builder.append(i);
        }
        System.out.println(builder);


    }
}