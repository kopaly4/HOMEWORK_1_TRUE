package hw8;

import javax.swing.*;
import java.awt.*;

public class Winner extends JFrame {
    public Winner (){
        setVisible(false);
        setBounds(500, 500, 300, 100);
        setTitle("winner");
        String winnername=" ";
        setLayout(new GridLayout(1,1));
        if (Logic.checkWin(Logic.DOT_X)){
            winnername = "You won!";
            setVisible(true);
        }
        if (Logic.checkWin(Logic.DOT_O)){
            winnername = " Computer won!";
            setVisible(true);
        }
        if (Logic.isFull()){
            winnername = "The Field is full, nobody won!";
            setVisible(true);
        }
        add(new Label(winnername), BorderLayout.CENTER);

    }

}
