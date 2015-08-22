package Reload.Task1level;

import java.util.Scanner;

/**
 * Created by acer on 15.08.2015.
 */
public class Task14_luckyTicket {

    /*Определить, является ли шестизначное число "счастливым" (сумма
    первых трех цифр равна сумме последних трех цифр).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6nums number");
        int num = sc.nextInt();

        if (num <100000 || num > 999999) {
            System.out.println("Wrong number");
        }

        int num1 = num/100000;
        int num2 = num/10000 % 10;
        int num3 = num/1000 % 10;
        int num4 = num/100 % 10;
        int num5 = num/10 % 10;
        int num6 = num % 10;

        if(num1 + num2 + num3 == num4 + num5 + num6){
            System.out.println("Your ticket is lucky!!!");
        }else {
            System.out.println("It is not your day");
        }
    }
}
