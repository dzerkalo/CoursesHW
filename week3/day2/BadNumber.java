package ACO7.week3.day2;

/**
 * Created by acer on 03.08.2015.
 */
public class BadNumber extends MyNumber{

    public BadNumber(int value) {
        super(value);
    }

    @Override
    public final int getValue() {
        return super.getValue() * 2;
    }
}
