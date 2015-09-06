package ACO7.week4.day1.hw3;

/**
 * Created by acer on 11.08.2015.
 */
public class TestCircus {
    public static void main(String[] args) {
        Circus circus = new Circus(8);
        Artist artist1 = new Acrobat("Vova", "Acrobat");
        Artist artist2 = new Acrobat("Petia", "Acrobat");
        Artist artist3 = new Acrobat("Igor", "Acrobat");
        Artist artist4 = new Juggler("Slava", "Juggler");
        Artist artist5 = new Juggler("Han Solo", "Juggler");

        circus.add(artist1);
        circus.add(artist2);
        circus.add(artist3);
        circus.add(artist4);
        circus.add(artist5);
        circus.add(new AcrobatJuggler("Oleg", "AcrobatJuggler"));

        circus.showArtists();

        System.out.println("~~~~~");
        circus.showAcrobats();
    }
}
