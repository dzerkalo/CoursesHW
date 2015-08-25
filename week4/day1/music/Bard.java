package ACO7.week4.day1.music;

/**
 * Created by acer on 11.08.2015.
 */
public class Bard implements SongWriter, Singer {

    @Override
    public void sing(Song song) {
        System.out.println(String.format("With emotions and about life: %s", song));
    }

    @Override
    public Song writeSong() {
        return new Song("Gop stop...");
    }
}
