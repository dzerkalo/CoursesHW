package Reload.Figures;

import java.util.Scanner;

/**
 * Created by acer on 17.08.2015.
 */
public class AppGeometry {

    /* Дано следующие фигуры:
    * 1. Круг
    * 2. Квадрат
    * 3. Триугольник
    *
    * Найти площадь фигур, с возможностью добавлять новые фигуры.
    * Сделать через консольное меню*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu.callMenu();
        int figureType;
        figureType = sc.nextInt();

        Figure figure = Menu.createFigure(figureType);
        FigureHelper.printSquare(figure);
    }
}





