package ACO7.week3.day1.hw2Company;

/**
 * Created by acer on 03.08.2015.
 */
public class TestCompany {
    public static void main(String[] args) {
        QAEngineer qa = new QAEngineer();
        Employee dev = new Dev();
        CleanManager cleanManager = new CleanManager();

        goWork(qa);
        goWork(dev);
        goWork(cleanManager);
    }

    public static void goWork(Employee employee){
        employee.work();
    }
}
