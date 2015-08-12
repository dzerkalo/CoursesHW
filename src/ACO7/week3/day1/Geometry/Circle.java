package ACO7.week3.day1.Geometry;

/**
 * Created by acer on 25.07.2015.
 */

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle {radius=" + radius + "}";
    }
}

