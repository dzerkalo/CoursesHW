package ACO7.week2.homework.Task3;

import java.util.Scanner;

/**
 * Created by acer on 21.07.2015.
 */
public class CalcMenu {

    public static void Menu () {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Summ");
        System.out.println("2.Difference");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
    }

    public static boolean isExit(Scanner sc, boolean exit) {
        System.out.println("Would you want to continue?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        double questionAboutExit = sc.nextDouble();
            if (questionAboutExit == 1){
                exit = true;
            }else {
                exit = false;
            }
        return exit;
    }
}
