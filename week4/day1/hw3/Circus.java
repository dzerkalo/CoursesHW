package ACO7.week4.day1.hw3;


import ACO7.week3.hw3.Clown;


/**
 * Created by acer on 11.08.2015.
 */
public class Circus {
    private Artist[] artists;
    private int index;

    public Circus() {
        this(10);
    }

    public Circus(int numberOfArtists) {
        artists = new Artist[numberOfArtists];
    }

    public void add(Artist artist) {
        artists[index++] = artist;
    }

    public void showArtists() {
//    for (Artist artist : artists) {
//      System.out.println(artist);
//    }
        for (int i = 0; i < index; i++) {
            System.out.println(artists[i]);
        }
    }

    //don't do that! It's for learning purposes
    public void showAcrobats(){
        for (int i = 0; i < index; i++) {
            if (artists[i] instanceof Acrobat) {
                System.out.println(artists[i]);
            }
        }
    }

}
