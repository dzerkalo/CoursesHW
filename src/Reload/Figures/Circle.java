package Reload.Figures;

/**
 * Created by acer on 17.08.2015.
 */
public class Circle extends Figure {

    public double radius;

    public double getRadius(){
        return radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}
