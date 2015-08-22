package ACO7.week5.hw5Train;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ticket {

    private int id;
    private String destination;
    private String startingPoint;
    private Calendar departureDate;
    private static int counter;

    public Calendar getDepartureDate() {
        return departureDate;
    }

    public Ticket(String destinationPoint, String destination, Date departureDate){
        this.startingPoint = destinationPoint;
        this.destination = destination;
        departureDate = new Date();
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
