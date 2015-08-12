package ACO7.week2.homework.Task5;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by acer on 20.07.2015.
 */
public class Employee {

    private String Name;
    private int Salary;
    private String Sex;
    private int YearsOld;

    public Employee (String Name, int Salary, String Sex, int YearsOld){
        this.Name = Name;
        this.Salary = Salary;
        this.Sex = Sex;
        this.YearsOld = YearsOld;
    }

    public void ShowInfo(){
        System.out.println("My name is " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("I'm " + Sex);
        System.out.println("I'm " + YearsOld + " years old");
    }
}
