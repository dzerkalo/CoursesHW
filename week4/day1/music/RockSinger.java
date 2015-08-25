package ACO7.week4.day1.music;

/**
 * Created by acer on 11.08.2015.
 */
public class RockSinger implements Singer {
    @Override
    public void sing(Song song) {
        System.out.println(String.format("Super rock-star voice : %s", song));
    }
}
