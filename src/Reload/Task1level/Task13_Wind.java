package Reload.Task1level;

import java.util.Scanner;

/**
 * Created by acer on 15.08.2015.
 */
public class Task13_Wind {

  /*  12) �������� ���������, ������� � ����������� �� ��������� ����� ������
    ��������� � ��� �������� �� 1�� 4 �/� - ������ (1); �� 5-10 �/c -
    ��������� (2); �� 9-18 �/c - ������� (3); ������ 19 �/c - ��������� (4).*/

    public static void main(String[] args) {

        int WindPower;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter power of wind");

        WindPower = sc.nextInt();

        if(WindPower >= 1 && WindPower <= 4){
            System.out.println("Low power of wind");
        } else if (WindPower >= 5 && WindPower <= 10) {
            System.out.println("Midle power of wind");
        } else if (WindPower >= 9 && WindPower <= 18) {
            System.out.println("Strong power of wind");
        } else if (WindPower >= 19) {
            System.out.println("Storm. Don't escape from sweet home");
        } else if (WindPower == 0) {
            System.out.println("There is no wind");
        } else {
            System.out.println("Wrong number");
        }
    }
}
