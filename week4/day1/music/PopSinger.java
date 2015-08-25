package ACO7.week4.day1.music;

/**
 * Created by acer on 11.08.2015.
 */
public class PopSinger implements Singer {
    @Override
    public void sing(Song song) {
        System.out.println(String.format("Sound like Gaga: %s", song));
    }
}
