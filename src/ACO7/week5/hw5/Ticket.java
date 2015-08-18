package ACO7.week5.hw5;


import java.text.SimpleDateFormat;

/**
 * Created by acer on 18.08.2015.
 */
public class Ticket {

    private int id;
    private String destination;
    private String startingPoint;
    //private Date departureDate;
    private static int counter;

    public Ticket(String destinationPoint, String destination){
        this.startingPoint = destinationPoint;
        this.destination = destination;
        //departureDate = new Date();
        this.id = ++counter;
    }

    public  static int getCounter(){
        return counter;
    }

    public String toString() {
        String pattern = "dd MMM yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return "Ticket Information: " + "id = " + id + ", Destination = " + destination +
                 ", Starting from = " + startingPoint;
    }
}
