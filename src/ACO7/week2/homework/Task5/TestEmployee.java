package ACO7.week2.homework.Task5;

/**
 * Created by acer on 20.07.2015.
 */
public class TestEmployee {

    public static void main(String[] args) {

        Employee testEmployee = new Employee("Vasya",300, "man", 37);
        testEmployee.ShowInfo();

        System.out.println();

        Developer Andrew = new Developer("Andrew", 2000, "Man", 25, 5);
        Andrew.ShowInfo();
        Andrew.DeveloperCan();

        System.out.println();

        Cleaning Vera = new Cleaning("Vera", 500, "Female", 45, 3);
        Vera.ShowInfo();
        Vera.CleaningCan();

        System.out.println();

        QA Vladimir = new QA("Vladimir", 1100, "Male", 28, 12);
        Vladimir.ShowInfo();
        Vladimir.QAcan();
    }
}
