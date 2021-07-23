package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameWindow extends JFrame {
    private BattleMap battlemap;
    private Settings setting;
    public GameWindow()  {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,500, 500, 500);
        setTitle("TicTacToe");

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton button = new JButton("Start new game");
        panel.add(button);

        JButton buttonExit = new JButton("Exit");
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        battlemap = new BattleMap(this);
        add(battlemap, BorderLayout.CENTER);
        setting = new Settings(this);

        button.addActionListener(e -> setting.setVisible(true));
        buttonExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
    void startNewGame(int fieldsize, int winlength){
        battlemap.startNewGame(fieldsize, winlength);
    }
}
