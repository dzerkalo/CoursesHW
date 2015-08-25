package ACO7.week3.hw3;

/**
 * Created by acer on 12.08.2015.
 */
<<<<<<< HEAD
public abstract class Employee {

    private String name;
    private double bankInvoice;
    private int counterDrink;
    private int counterPerform;

    public void setBankInvoice(double bankInvoice){
        this.bankInvoice = this.bankInvoice + bankInvoice;
    }

    public double getBankInvoice(){
        return bankInvoice;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCounterDrink(int temp){
        this.counterDrink = counterDrink;
    }

    public int getCounterDrink() {
        return counterDrink;
    }

    public void setCounterPerform(int counterPerform) {
        this.counterPerform = counterPerform;
    }

    public int getCounterPerform() {
        return counterPerform;
    }

    public Employee(String name){
        this.name = name;
    }

    public abstract void perform();

    public abstract void drink();
=======
public class Employee {

    private String name;
    private double salary;


>>>>>>> 731108d... Initial commit
}
