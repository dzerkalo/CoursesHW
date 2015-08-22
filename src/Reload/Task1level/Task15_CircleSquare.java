package Reload.Task1level;

import java.util.Scanner;

/**
 * Created by acer on 16.08.2015.
 */
public class Task15_CircleSquare {

    //Известны площади круга и квадрата. Определить: а) уместится ли круг в
    //квадрат; б) уместится ли квадрат в круге.

    public static void main(String[] args) {

        double QuadrateSquare;
        double CircleSquare;
        double CircleDiametre;
        double QuadrateSide;
        double Hypotenuse;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quadrate square");
        QuadrateSquare = sc.nextInt();

        System.out.println("Enter circle square");
        CircleSquare = sc.nextInt();

        QuadrateSide = Math.sqrt(QuadrateSquare);
        Hypotenuse= (QuadrateSide*2) + (QuadrateSide*2);
        CircleDiametre = Math.sqrt(CircleSquare)/Math.PI;

        if(CircleDiametre/2 <= QuadrateSide/2){
            System.out.println("Cirlce can be in quadrate");
        } else {
            System.out.println("Cirlce can't be in quadrate");
        }

        if (CircleDiametre >= Hypotenuse ){
            System.out.println("Quadrate can be in a circle");
        } else {
            System.out.println("Quadrate can't be in a circle");
        }
    }
}
