package ACO7.week3.hw3;

/**
 * Created by acer on 14.08.2015.
 */
public class Jugger extends Employee {

    public Jugger(String name){
        super(name);
    }

    @Override
    public void perform() {
        int temp = getCounterPerform();
        temp++;
        setCounterPerform(temp);
    }

    @Override
    public void drink(){
        int temp = getCounterDrink();
        temp++;
        setCounterDrink(temp);
    }
}
