package ACO7.week4.day1.hw3;

/**
 * Created by acer on 11.08.2015.
 */
public abstract class Artist {

    private String name;
    private String position;

    public Artist(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public abstract void perform();


    @Override
    public String toString() {
        return String.format("position=%s, name=%s", position, name);
    }
}
