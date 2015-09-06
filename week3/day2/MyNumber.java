package ACO7.week3.day2;

/**
 * Created by acer on 03.08.2015.
 */
//public final class MyNumber cannot be extended
public class MyNumber {
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    //public int getValue() cannot override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
