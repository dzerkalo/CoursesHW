package ACO7.week7.hw7.XO;

/**
 * Created by acer on 31.08.2015.
 */
public class Main {

    public static void main(String[] args) {

        LogicXO.Player firstPlayer = new LogicXO.Player("Virginia", "O");
        LogicXO.Player secondPlayer = new LogicXO.Player("Ben", "X");
        LogicXO.Listener game = new LogicXO.Listener(firstPlayer, secondPlayer);

        LogicXO logicXO = new LogicXO(game);
    }
}
