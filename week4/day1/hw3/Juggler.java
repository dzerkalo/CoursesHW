package ACO7.week4.day1.hw3;

/**
 * Created by acer on 11.08.2015.
 */
public class Juggler extends Artist {

    public Juggler(String name, String position) {
        super(name, position);
    }

    @Override
    public void perform() {
        System.out.println("Joggling with 5 balls");
    }
}
