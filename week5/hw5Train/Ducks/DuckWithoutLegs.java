package ACO7.week5.hw5Train.Ducks;

/**
 * Created by acer on 20.08.2015.
 */
public class DuckWithoutLegs extends Duck {

    public DuckWithoutLegs(){
        super(new FlyNoWay());
    }
}
