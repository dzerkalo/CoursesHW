package ACO7.week2.homework.Task5;

/**
 * Created by acer on 20.07.2015.
 */
public class Developer extends Employee {

    private int Coding;

    public Developer(String Name, int Salary, String Sex, int YearsOld, int Coding){
        super(Name, Salary, Sex, YearsOld);
        this.Coding = Coding;
    }

    public  void DeveloperCan(){
        System.out.println("I can find " + Coding + " solutions per hour");
    }
}
