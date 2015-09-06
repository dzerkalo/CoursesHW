package ACO7.week2.homework.Task2;

/**
 * Created by acer on 22.07.2015.
 */
public class TestMass {

    public static void main(String[] args) {

        Array mass = new Array(6);

        System.out.println("Our array: ");
        mass.fillArr();
        System.out.println();
        System.out.println("Min: " + mass.FindMin());
        System.out.println("Max: " + mass.FindMax());
    }
}
