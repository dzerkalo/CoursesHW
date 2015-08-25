package ACO7.week3.hw3;

/**
 * Created by acer on 14.08.2015.
 */
public class Cyclist extends Employee{


    public Cyclist(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Cycling is funny");
        int temp = getCounterPerform();
        temp++;
        setCounterPerform(temp);
    }

    @Override
    public void drink() {
        int temp = getCounterDrink();
        temp++;
        setCounterDrink(temp);

    }
}
