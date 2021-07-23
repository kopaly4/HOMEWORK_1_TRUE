package hw8;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {
    private GameWindow gameWindow;


    private final int MIN_FIELD_SIZE = 3;
    private final int MAX_FIELD_SIZE = 10;

    private JSlider sliderfieldsize;
    private JSlider sliderDotsToWin;


    public Settings(GameWindow gameWindow)  {
        this.gameWindow = gameWindow;
        setBounds(550, 550, 450, 450);
        setTitle("TicTacToe settings");
        setLayout(new GridLayout(5, 1));
        sliderfieldsize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
        sliderfieldsize.setMajorTickSpacing(1);
        sliderfieldsize.setPaintTicks(true);
        sliderfieldsize.setPaintLabels(true);
        sliderDotsToWin = new JSlider(MIN_FIELD_SIZE,MIN_FIELD_SIZE,MIN_FIELD_SIZE);
        sliderDotsToWin.setMajorTickSpacing(1);
        sliderDotsToWin.setPaintTicks(true);
        sliderDotsToWin.setPaintLabels(true);
        sliderfieldsize.addChangeListener(e-> sliderDotsToWin.setMaximum(sliderfieldsize.getValue()));

        add(new Label("Choose Field Size"));
        add(sliderfieldsize);
        add(new Label("Choose Winning Line:"));
        add(sliderDotsToWin);

        JButton button = new JButton("Start The Game");
        add(button);
        button.addActionListener(e -> {
            int fieldsize = sliderfieldsize.getValue();
            int winlength = sliderDotsToWin.getValue();
            Logic.SIZE = fieldsize;
            Logic.DOTS_TO_WIN = winlength;
            Logic.initMap();
            Logic.printMap();
            Logic.isGameOver = false;

            gameWindow.startNewGame(fieldsize, winlength);

            setVisible(false);
                });

        setVisible(false);
    }
}
