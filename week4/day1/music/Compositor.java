package ACO7.week4.day1.music;

/**
 * Created by acer on 11.08.2015.
 */
public class Compositor implements SongWriter {

    @Override
    public Song writeSong() {
        return new Song("La la");
    }
}
