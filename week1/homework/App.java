package ACO7.week1.homework;



import java.util.Scanner;
import java.util.Date;

/**
 * Created by acer on 16.07.2015.
 */
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        //Employee: name, salary, address, sex, age, working experience (in months)
        //Company: name, address, number of employees, list of employees
        //Address: Country, city, street, building

        Adress adressCompany = new Adress();
        adressCompany.country = "Ukraine";
        adressCompany.city = "Kiev";
        adressCompany.street = "Frunze";
        adressCompany.building = 32;


        Employee Lisa = new Employee();
        Lisa.name = "Lisa";
        Lisa.salary = 900;
        Lisa.adress = "Kiev";
        Lisa.sex = "female";
        Lisa.age = 23;
        Lisa.workExp = 16;


        Employee Andrew = new Employee();
        Andrew.name = "Andrew";
        Andrew.salary = 1100;
        Andrew.adress = "Lvov";
        Andrew.sex = "male";
        Andrew.age = 30;
        Andrew.workExp = 13;

        Employee Helga = new Employee();
        Helga.name = "Helga";
        Helga.salary = 700;
        Helga.adress = "Kiev";
        Helga.sex = "female";
        Helga.age = 25;
        Helga.workExp = 9;

        Employee Bob = new Employee();
        Bob.name = "Bob";
        Bob.salary = 600;
        Bob.adress = "Kiev";
        Bob.sex = "male";
        Bob.age = 29;
        Bob.workExp = 10;

        Employee Laura = new Employee();
        Laura.name = "Laura";
        Laura.salary = 1100;
        Laura.adress = "Kiev";
        Laura.sex = "female";
        Laura.age = 20;
        Laura.workExp = 9;

        Company Orbit = new Company();
        Orbit.companyName = "Orbit";
        Orbit.companyAdress = "Kiev";
        Orbit.listOfEmployee[0] = Lisa;
        Orbit.listOfEmployee[1] = Andrew;
        Orbit.listOfEmployee[2] = Helga;
        Orbit.listOfEmployee[3] = Bob;
        Orbit.listOfEmployee[4] = Laura;

        do {
            App.consoleMenu();
            System.out.println("Enter number of question");
            int choose = sc.nextInt();

            if(choose == 1){
                Orbit.readAboutCompany();
                exit = isExit(sc, exit);
            }else if(choose == 2){
                Orbit.listOfEmployee();
                exit = isExit(sc, exit);
            }else if(choose == 3){
                Orbit.moreYear();
                exit = isExit(sc, exit);
            }else if(choose == 4){
                Orbit.girlsKiev();
                exit = isExit(sc,exit);
            }else if(choose == 5){
                Orbit.addEmployee();
                exit = isExit(sc, exit);
            }else  if(choose == 6){
                Orbit.fireEmployee();
                exit = isExit(sc, exit);
            }else if(choose == 7){
                Orbit.fireLessYearLess1000();
                exit = isExit(sc, exit);
            }else if(choose == 9){
                Orbit.listWomMan();
                exit = isExit(sc, exit);
            }

        }while (exit);


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

    public static void consoleMenu() {

        System.out.println("1. Read about company");
        System.out.println("2. View list of employees");
        System.out.println("3. View employees, which work more than year.");
        System.out.println("4. View employees, which are girls and live in Kiev");
        System.out.println("5. Add an employee");
        System.out.println("6. Fire an employee");
        System.out.println("7*. Fire an employee, with salary less then 1000 and which works less then year");
        System.out.println("8*. Change an employee information");
        System.out.println("9*. View list of employees: first women and then men");
        System.out.println("10*. Employee has a hire date(implement class java.util.Date)");
        System.out.println("11*. View employees, which works between 100 and 200 hours (use Date)");

    }
}


