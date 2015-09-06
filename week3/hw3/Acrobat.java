package ACO7.week3.hw3;

/**
 * Created by acer on 13.08.2015.
 */
public class Acrobat extends Employee {

    public Acrobat(String name){
        super(name);
    }

    @Override
    public void drink(){
        System.out.println("Drink");
        int temp = getCounterDrink();
        temp++;
        setCounterDrink(temp);
    }

    @Override
    public void perform(){
        System.out.println("I'm Acrobat. Let's acrobating");
        int temp = getCounterPerform();
        temp++;
        setCounterPerform(temp);
    }
}
