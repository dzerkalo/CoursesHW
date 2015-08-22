package ACO7.week5.hw5Train.Ducks;

/**
 * Created by acer on 19.08.2015.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck duckNoLegs = new DuckWithoutLegs();

        mallard.fly();
        mallard.swim();


        duckNoLegs.swim();
        duckNoLegs.fly();
    }
}
