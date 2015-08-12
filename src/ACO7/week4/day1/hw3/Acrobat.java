package ACO7.week4.day1.hw3;

/**
 * Created by acer on 11.08.2015.
 */
public class Acrobat extends Artist {

    public Acrobat(String name, String position) {
        super(name, position);
    }

    @Override
    public void perform() {
        System.out.println("Doing backflip salto");
    }
}
