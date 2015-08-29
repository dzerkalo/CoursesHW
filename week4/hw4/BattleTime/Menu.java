package ACO7.week4.hw4.BattleTime;

import ACO7.week4.hw4.BattleTime.Character.*;
import ACO7.week4.hw4.BattleTime.Weapon.Bow;
import ACO7.week4.hw4.BattleTime.Weapon.Hanjar;
import ACO7.week4.hw4.BattleTime.Weapon.Stick;
import ACO7.week4.hw4.BattleTime.Weapon.Sword;


import java.util.Scanner;

/**
 * Created by acer on 27.08.2015.
 */
public class Menu {

    Archer archer = new Archer();
    FightingMagician fightingMagician = new FightingMagician();
    Knight knight = new Knight();
    Magician magician = new Magician();
    Bow bow = new Bow();
    Hanjar hanjar = new Hanjar();
    Stick stick = new Stick();
    Sword sword = new Sword();

    Scanner sc = new Scanner(System.in);


    Object firstPlayer;
    Object secondPlayer;


    Object weaponForFirst;
    Object weaponForSecond;



    public void chooseFirstPlayer() {
        System.out.println("Welcome to Battle Time Game");

        System.out.println("____________________________");
        System.out.println("Enter first player character");
        System.out.println("1. Archer");
        System.out.println("2. Fighting Magician");
        System.out.println("3. Knight");
        System.out.println("4. Magician");

        int chooseFirst = sc.nextInt();

        switch (chooseFirst) {
            case 1:
                System.out.println("1St Player is Archer");
                firstPlayer = archer;

                break;
            case 2:
                System.out.println("1St Player is Fighting Magician");
                firstPlayer = fightingMagician;
                break;
            case 3:
                System.out.println("1St Player is Knight");
                firstPlayer = knight;
                break;
            case 4:
                System.out.println("1St Player is  Magician");
                firstPlayer = magician;
                break;
        }
    }

    public void chooseSecondPlayer(){
        System.out.println();
        System.out.println("Enter second player character");
        System.out.println("1. Archer");
        System.out.println("2. Fighting Magician");
        System.out.println("3. Knight");
        System.out.println("4. Magician");

        int chooseSecond = sc.nextInt();

        switch (chooseSecond){
            case 1:
                System.out.println("2nd Player is Archer");
                secondPlayer = archer;
                break;
            case 2:
                System.out.println("2nd Player is Fighting Magician");
                secondPlayer = fightingMagician;
                break;
            case 3:
                System.out.println("2nd Player is Knight");
                secondPlayer = knight;
                break;
            case 4:
                System.out.println("2nd Player is  Magician");
                secondPlayer = magician;
                break;
        }
    }

    public void chooseWeaponForFirst() {

        System.out.println("Enter weapon for first");
        System.out.println("1. Bow");
        System.out.println("2. Hanjar");
        System.out.println("3. Stick");
        System.out.println("4. Sword");

        int chooseFirst = sc.nextInt();

        switch (chooseFirst) {
            case 1:
                System.out.println("Weapon for first is Bow");
                weaponForFirst = bow;
                break;
            case 2:
                System.out.println("Weapon for first is Hanjar");
                weaponForFirst = hanjar;
                break;
            case 3:
                System.out.println("Weapon for first is Stick");
                weaponForFirst = stick;
                break;
            case 4:
                System.out.println("Weapon for first is Sword");
                weaponForFirst = sword;
                break;
        }
    }

    public void chooseWeaponForSecond(){
        System.out.println();
        System.out.println("Enter weapon for second");
        System.out.println("1. Bow");
        System.out.println("2. Hanjar");
        System.out.println("3. Stick");
        System.out.println("4. Sword");

        int chooseSecond = sc.nextInt();

        switch (chooseSecond){
            case 1:
                System.out.println("Weapon for second is Bow");
                weaponForSecond = bow;
                break;
            case 2:
                System.out.println("Weapon for second is Hanjar");
                weaponForSecond = hanjar;
                break;
            case 3:
                System.out.println("Weapon for second is Stick");
                weaponForSecond = stick;
                break;
            case 4:
                System.out.println("Weapon for second is Sword");
                weaponForSecond = sword;
                break;

        }
        System.out.println();
        System.out.println("Let's fight. Player 1 attack first");
        System.out.println();
    }

    public void Fight(){

        System.out.println();
        System.out.println("In which part of body you whant to attack?");

        int chooseAttack = sc.nextInt();

        switch (chooseAttack){
            case 1:
                //firstPlayer = firstPlayer.health() - firstPlayer.headAttack();
                System.out.println("Health rest: " + firstPlayer);
                System.out.println("Damage: " + magician.headAttack());

        }
    }
}
