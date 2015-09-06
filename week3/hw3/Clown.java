package ACO7.week3.hw3;

/**
 * Created by acer on 13.08.2015.
 */
public class Clown extends Employee {


    public Clown(String name){
        super(name);
    }

    @Override
    public void perform(){
        System.out.println("Hahaha");
        int temp = getCounterPerform();
        temp++;
        setCounterPerform(temp);
    }

    @Override
    public void drink(){
        System.out.println("Drinking hahah");
        int temp = getCounterDrink();
        temp++;
        setCounterDrink(temp);
    }
}
