package ACO7.week3.day1.Geometry;

/**
 * Created by acer on 03.08.2015.
 */
public class Color {

    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
