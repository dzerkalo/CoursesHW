package ACO7.week2.homework.Task5;

/**
 * Created by acer on 20.07.2015.
 */
public class QA extends Employee {

    int Test;

    public QA(String Name, int Salary, String Sex, int YearsOld, int Test){
        super(Name, Salary, Sex, YearsOld);
        this.Test = Test;
    }

    public void QAcan(){
        System.out.println("I can check " + Test + " tasks in one day");
    }
}
