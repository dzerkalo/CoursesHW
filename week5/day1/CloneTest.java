package ACO7.week5.day1;

/**
 * Created by acer on 21.08.2015.
 */
public class CloneTest {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murchick");
        cat1.setAge(3);
        System.out.println(cat1);
/*
    Cat cat2 = new Cat("Murchick");
    cat2.setAge(3);
*/
        Cat cloned = cat1.clone();
        System.out.println(cloned);
    }

}