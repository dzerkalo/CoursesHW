package ACO7.week3.hw3;

/**
 * Created by acer on 13.08.2015.
 */
public class AcrobatJugger extends Acrobat {


    public AcrobatJugger(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("I'm Acrobat and Juggler");
        int temp = getCounterPerform();
        temp++;
        setCounterPerform(temp);
    }

    @Override
    public  void drink(){
        System.out.println("Drink juggler");
        int temp = getCounterDrink();
        temp ++;
        setCounterDrink(temp);
    }
}
