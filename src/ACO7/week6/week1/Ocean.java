package ACO7.week6.week1;

/**
 * Created by acer on 22.08.2015.
 */
public enum Ocean {
    ATLANTIC(250), PACIFIC(300), INDIAN(150), ANTARCTIC(100);

    public double square;

    private Ocean (double square){
        this.square = square;
    }
}
