package ACO7.week6.day1;

/**
 * Created by acer on 22.08.2015.
 */
public enum Ocean implements Cloneable{
    ATLANTIC(223), PACIFIC(54), INDIAN(123), ANTARCTIC(24);

    private double square;

    private Ocean(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }
}
