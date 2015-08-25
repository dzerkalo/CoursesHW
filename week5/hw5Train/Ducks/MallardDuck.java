package ACO7.week5.hw5Train.Ducks;

/**
 * Created by acer on 19.08.2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super(new FlyWithWings());

    }

    public void display(){

        System.out.println("Quack, quack");
    }
}
