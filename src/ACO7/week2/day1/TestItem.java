package ACO7.week2.day1;

/**
 * Created by acer on 20.07.2015.
 */
public class TestItem {
    public static void main(String[] args) {
        Item sock = new Item(25);
//    sock.setPrice(25);
        sock.setDescription("100% cotton. Black");
        System.out.println(sock.asString());

        Item shirt = new Item(123);

        System.out.println(shirt.asString());


    }
}
