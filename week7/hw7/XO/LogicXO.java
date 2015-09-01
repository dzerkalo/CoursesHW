package ACO7.week7.hw7.XO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by acer on 31.08.2015.
 */
public class LogicXO extends JFrame {

    public LogicXO(Listener game) {
        JFrame frame = new JFrame("XO Game");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);


        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 3));
        panel.add(c);
        c.setSize(800, 800);

        JButton b1 = new JButton("But");
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();

        b1.addMouseListener(game);
        b2.addMouseListener(game);
        b3.addMouseListener(game);
        b4.addMouseListener(game);
        b5.addMouseListener(game);
        b6.addMouseListener(game);
        b7.addMouseListener(game);
        b8.addMouseListener(game);
        b9.addMouseListener(game);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);


        frame.pack();

    }

    static class Player {

        String name;
        String sign;

        public Player(String name, String sign) {
            this.name = name;
            this.sign = sign;
        }
    }

    static class Listener extends MouseAdapter {
        private int actions = 0;
        private boolean isFirstPlayer = true;
        Player firstPlayer;
        Player secondPlayer;

        public Listener(Player firstPlayer, Player secondPlayer) {
            this.firstPlayer = firstPlayer;
            this.secondPlayer = secondPlayer;
        }

        public void clickByMouse(MouseEvent event) {

            JButton pressedButton = (JButton) event.getSource();

            if (actions > 8) {
                return;
            }
            if (!pressedButton.isEnabled()) {
                System.out.println("Invalid turn");
                return;
            }
            if (isFirstPlayer) {
                System.out.println("Move by " + firstPlayer.name);
                pressedButton.setText(firstPlayer.sign);
            } else {
                System.out.println(secondPlayer.name + " make move");
                pressedButton.setText(secondPlayer.sign);
            }
            pressedButton.setEnabled(false);
            if (++actions > 8)
                System.out.println("Game Over");
            isFirstPlayer = !isFirstPlayer;
        }
    }
}
