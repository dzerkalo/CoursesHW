package Reload.Task1level;

import java.util.Scanner;

/**
 * Created by acer on 15.08.2015.
 */
public class Task12_nums {

    /*���� ��� ����� A,B,C. ��������� ����� � ���
    ����, ���� A+B+C>0, � ��������� ������ ��������
    �� ����.*/

    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        a = sc.nextInt();

        System.out.println("Enter second number");
        b = sc.nextInt();

        System.out.println("Enter third number");
        c = sc.nextInt();

        if(a+b+c>0){
            a = a*2;
            b = b*2;
            c = c*2;
            System.out.println("Now a = " + a);
            System.out.println("Now b = " + b);
            System.out.println("Now c = " + c);
        } else {
            a = 0;
            b = 0;
            c = 0;
            System.out.println("Now a = " + a);
            System.out.println("Now b = " + b);
            System.out.println("Now c = " + c);
        }
    }
}
