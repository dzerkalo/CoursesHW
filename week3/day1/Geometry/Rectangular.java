package ACO7.week3.day1.Geometry;

/**
 * Created by acer on 25.07.2015.
 */
public class Rectangular extends Figure{
    private int width;
    private int height;

    public Rectangular(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double square(){
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
