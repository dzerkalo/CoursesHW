package Reload.Figures;

import java.util.Scanner;

/**
 * Created by acer on 17.08.2015.
 */
public class AppGeometry {

    /* ���� ��������� ������:
    * 1. ����
    * 2. �������
    * 3. �����������
    *
    * ����� ������� �����, � ������������ ��������� ����� ������.
    * ������� ����� ���������� ����*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu.callMenu();
        int figureType;
        figureType = sc.nextInt();

        Figure figure = Menu.createFigure(figureType);
        FigureHelper.printSquare(figure);
    }
}





