package ACO7.week2.homework.Task3;

import java.util.Scanner;

/**
 * Created by acer on 21.07.2015.
 */
public class AppCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        CalcLogic action = new CalcLogic();
        CalcMenu Menu = new CalcMenu();

        System.out.println("Enter first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        do {
            System.out.println("What would we do with nums?");
            CalcMenu.Menu();
            int choose = sc.nextInt();

            if(choose == 1){
                System.out.println("Result of the summ: ");
                action.Summ(num1, num2);
                exit = Menu.isExit(sc,exit);
            }
            if(choose == 2){
                System.out.println("Result of the difference: ");
                action.Difference(num1, num2);
                exit = Menu.isExit(sc,exit);
            }
            if(choose == 3){
                System.out.println("Result of the multiplying: ");
                action.Multiply(num1, num2);
                exit = Menu.isExit(sc,exit);
            }
            if(choose == 4){
                System.out.println("Result of the dividing: ");
                action.Divide(num1, num2);
                exit = Menu.isExit(sc,exit);
            }

        }while (exit);
    }
}


