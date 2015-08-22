package Reload.Figures;

/**
 * Created by acer on 17.08.2015.
 */
public class Triangle extends Figure {

    private double height;
    private double base;

    public Triangle (double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double square() {
        return 0.5 * height * base;
    }
}
