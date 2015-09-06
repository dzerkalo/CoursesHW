package ACO7.week2.day2;

/**
 * Created by acer on 19.07.2015.
 */
public class Dragon {
    private int damage;
    private String color;

    public Dragon(int damage, String color) {
        this.damage = damage;
        this.color = color;
    }

    public int getDamage() {
        return damage;
    }

    public String getColor() {
        return color;
    }

    public void fly() {
        System.out.println("I am flying. Vzhhhh");
    }

    public void attack() {
        System.out.println("Dragon attck with damage " + damage);
    }

}
