package Reload.Figures;

/**
 * Created by acer on 17.08.2015.
 */
public class Menu {

    public static void callMenu(){
        System.out.println("Choose figure");
        int index = 1;
        System.out.println(index++ + ". Circle");
        System.out.println(index++ + ". Quadrate");
        System.out.println(index++ + ". Triangle");

    }

    public static Figure createFigure(int choose) {
        Figure figure = null;
        switch (choose) {
            case 1:
                figure = new Circle(5);
                break;
            case 2:
                figure = new Quadrate(3);
                break;
            case 3:
                figure = new Triangle(4, 8);
                break;
        }
        return figure;

    }
}
