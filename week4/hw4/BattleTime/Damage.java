package ACO7.week4.hw4.BattleTime;

/**
 * Created by acer on 21.08.2015.
 */
public class Damage {

    public int Damage(int health, int power, int speed, int spells, int defence ){

        return health - power - spells + defence;
    }
}
