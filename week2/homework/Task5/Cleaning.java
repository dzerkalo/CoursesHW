package ACO7.week2.homework.Task5;

/**
 * Created by acer on 20.07.2015.
 */
public class Cleaning extends Employee {

    int Clean;

    public Cleaning(String Name, int Salary, String Sex, int YearsOld, int Clean){
        super(Name, Salary, Sex, YearsOld);
        this.Clean = Clean;
    }

    public void CleaningCan(){
        System.out.println("I can clean " + Clean + " rooms per day");
    }
}
