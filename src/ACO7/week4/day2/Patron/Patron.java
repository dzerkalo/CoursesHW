package ACO7.week4.day2.Patron;

/**
 * Created by acer on 11.08.2015.
 */
public class Patron {
    private final double caliber;

    public Patron(double caliber) {
        this.caliber = caliber;
    }

    public double getCaliber() {
        return caliber;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "caliber=" + caliber +
                '}';
    }
}
