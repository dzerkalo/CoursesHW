package ACO7.week4.day1.music;

/**
 * Created by acer on 11.08.2015.
 */
public class TestMusicants {
    public static void main(String[] args) {


        Bard bard = new Bard();

        //~~~~~~~~~~~~~~~~~~~~
        SongWriter songWriter = bard;
        Song superHit = songWriter.writeSong();

        Singer singer = bard;
        singer.sing(superHit);

    }
}
