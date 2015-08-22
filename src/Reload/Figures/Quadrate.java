package Reload.Figures;

/**
 * Created by acer on 17.08.2015.
 */
public class Quadrate extends Figure {

    double side;

    public Quadrate (double side){
        this.side = side;
    }

    @Override
    public double square() {
        return side*side;
    }
}
