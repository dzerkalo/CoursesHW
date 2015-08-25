package ACO7.week2.day2;

/**
 * Created by acer on 19.07.2015.
 */
public class IceDragon extends Dragon {
    private int iceDamage;

    public IceDragon(int iceDamage, int damage, String color) {
        super(damage, color);
        this.iceDamage = iceDamage;
    }

    public void freeze() {
        System.out.println("Freeze with damage " + iceDamage);
    }
}
