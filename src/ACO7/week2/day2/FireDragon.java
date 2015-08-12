package ACO7.week2.day2;

/**
 * Created by acer on 20.07.2015.
 */
public class FireDragon extends Dragon {
    private int fireDamage;

    public FireDragon(int damage, int fireDamage, String color) {
        super(damage, color);
        this.fireDamage = fireDamage;
    }

    public FireDragon(int fireDamage){
        super(50, "Black");
        this.fireDamage = fireDamage;
    }

    public void spitFire() {
        System.out.println("Spit fire with damage " + fireDamage);
    }
}
