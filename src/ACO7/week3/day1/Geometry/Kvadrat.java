package ACO7.week3.day1.Geometry;

/**
 * Created by acer on 25.07.2015.
 */
public class Kvadrat extends Figure{

    private double side;

    public Kvadrat(double side) {
        this.side = side;
    }

    @Override
    public double square(){
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
