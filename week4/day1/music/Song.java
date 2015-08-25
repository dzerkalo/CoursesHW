package ACO7.week4.day1.music;

/**
 * Created by acer on 11.08.2015.
 */
public class Song {
    private String text;

    public Song(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
