package ACO7.week3.hw3;

import java.util.Scanner;
import java.text.ParseException;

/**
 * Created by acer on 14.08.2015.
 */
public class TestCircus {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        CircusManagment circus = hireStuff();

        do {
            TestCircus.callMenu();
            int choose = sc.nextInt();

            if (choose > 0 && choose < 8) {

                switch (choose) {
                    case 1:
                        circus.showListOfActor();
                        exit = isExit(sc, exit);
                        break;
                    case 2:
                        circus.hireNewEmployee();
                        exit = isExit(sc, exit);
                        break;
                    case 3:
                        circus.fireDrinkestAcrobat();
                        exit = isExit(sc, exit);
                        break;
                    case 4:
                        circus.performSomeone();
                        exit = isExit(sc, exit);
                        break;
                    case 5:
                        circus.howManyPerformanceHeHas();
                        exit = isExit(sc, exit);
                        break;
                    case 6:
                        circus.giveSalary();
                        exit = isExit(sc, exit);
                        break;
                    case 7:
                        circus.moveToAnotherCity();
                        exit = isExit(sc, exit);
                        break;

                }
            } else {
                System.out.println();
                System.out.println("Please enter correct number of action");
                System.out.println();
            }
        } while (exit);
    }


    private static CircusManagment hireStuff() {
        CircusManagment circus = new CircusManagment();
        Clown clown = new Clown("Vasya");
        Acrobat acrobat = new Acrobat("Jora");
        acrobat.drink();
        acrobat.drink();
        Acrobat acrobat2 = new Acrobat("Andrey");
        acrobat2.drink();
        acrobat2.drink();
        acrobat2.drink();
        FlyAcrobat flyAcrobat = new FlyAcrobat("Druzhok");
        Jugger jugger = new Jugger("Man");
        Cyclist cyclist = new Cyclist("Koleso");
        AcrobatJugger acrobatJugger = new AcrobatJugger("Space");
        acrobatJugger.drink();
        RopeWalker ropeWalker = new RopeWalker("FatMan");
        Employee[] listOfEmpoyees = new Employee[8];
        circus.addEmployeeToListOfEmployees(clown);
        circus.addEmployeeToListOfEmployees(acrobat);
        circus.addEmployeeToListOfEmployees(acrobat2);
        circus.addEmployeeToListOfEmployees(flyAcrobat);
        circus.addEmployeeToListOfEmployees(jugger);
        circus.addEmployeeToListOfEmployees(cyclist);
        circus.addEmployeeToListOfEmployees(acrobatJugger);
        circus.addEmployeeToListOfEmployees(ropeWalker);

        return circus;
    }

    private static boolean isExit(Scanner sc, boolean exit) {
        System.out.println("Do you want to continue? Choose number");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int questionAboutExit = sc.nextInt();
        if (questionAboutExit == 1) {
            exit = true;
        } else {
            exit = false;
        }
        return exit;
    }

    private static void callMenu() {
        System.out.println("1. Show list of actor.");
        System.out.println("2. Hire new employee.");
        System.out.println("3. Fire the drinkest acrobat.");
        System.out.println("4. Perform someone.");
        System.out.println("5. How many performance he has?");
        System.out.println("6. Give salary (ropewalkers take additional 10%).");
        System.out.println("7. Move to another city.");
    }
}