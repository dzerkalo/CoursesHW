package Reload.Task1level;

import java.util.Scanner;

/**
 * Created by acer on 15.08.2015.
 */
public class Task13_Wind {

  /*  12) Написать программу, которая в зависимости от характера ветра выдает
    сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
    умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).*/

    public static void main(String[] args) {

        int WindPower;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter power of wind");

        WindPower = sc.nextInt();

        if(WindPower >= 1 && WindPower <= 4){
            System.out.println("Low power of wind");
        } else if (WindPower >= 5 && WindPower <= 10) {
            System.out.println("Midle power of wind");
        } else if (WindPower >= 9 && WindPower <= 18) {
            System.out.println("Strong power of wind");
        } else if (WindPower >= 19) {
            System.out.println("Storm. Don't escape from sweet home");
        } else if (WindPower == 0) {
            System.out.println("There is no wind");
        } else {
            System.out.println("Wrong number");
        }
    }
}
