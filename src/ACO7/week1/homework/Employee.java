package ACO7.week1.homework;

import java.util.Date;
/**
 * Created by acer on 16.07.2015.
 */
public class Employee {

// Employee: name, salary, address, sex, age, working experience (in months)

    String name;
    int salary;
    String adress;
    String sex;
    int age;
    int workExp;
    Date hireDate;

    public String showEmployee(){

//        String employee = ;
        return "Name: " + name + "Salary: " + salary + "Adress: " + adress +
                "Sex: " + sex + "Age: " + age + "Working Expirience: " + workExp +
                "Hire Date: " + hireDate;
    }

}
