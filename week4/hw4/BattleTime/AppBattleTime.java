package ACO7.week4.hw4.BattleTime;

import ACO7.week4.hw4.BattleTime.Character.Archer;
import ACO7.week4.hw4.BattleTime.Character.FightingMagician;
import ACO7.week4.hw4.BattleTime.Character.Knight;
import ACO7.week4.hw4.BattleTime.Character.Magician;

/**
 * Created by acer on 21.08.2015.
 */
public class AppBattleTime {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.chooseFirstPlayer();
        menu.chooseSecondPlayer();
        menu.chooseWeaponForFirst();
        menu.chooseWeaponForSecond();
        menu.Fight();

    }
}
