package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldsize;
    private int winlength;
    private boolean isInit;
    private int cellWidth;
    private int cellHeight;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.RED);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;
                if(isInit && ! Logic.isGameOver){
                    Logic.humanTurn(cellY, cellX);
                }
                repaint();
            }
        });
    }

    void startNewGame(int fieldsize, int winlength) {
        this.fieldsize = fieldsize;
        this.winlength = winlength;
        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        cellWidth = panelWidth / fieldsize;
        cellHeight = panelHeight / fieldsize;
        g.setColor(Color.BLACK);
        ((Graphics2D)g).setStroke(new BasicStroke(3f));

        for (int i = 1; i < fieldsize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);

        }
        for (int i = 0; i < fieldsize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
        for (int i = 0; i < fieldsize; i++) {
            for (int j = 0; j < fieldsize; j++) {
                if(Logic.map[i][j] == Logic.DOT_X){
                    drawX(g, i, j);
                }
            }

        }
        for (int i = 0; i < fieldsize; i++) {
            for (int j = 0; j <fieldsize ; j++) {
                if(Logic.map[i][j] == Logic.DOT_O){
                    drawO(g, i,j);
                }

            }

        }
//        if(Logic.map[0][1] == Logic.DOT_X){
//        drawX(g, 0,1);}

    }
    private void drawX(Graphics g, int y, int x){
        g.setColor(Color.blue);
        ((Graphics2D)g).setStroke(new BasicStroke(2f));
        g.drawLine(x*cellWidth, y*cellHeight, (x+1)*cellWidth,(y+1)*cellHeight );
        g.drawLine(x*cellWidth + cellWidth, y*cellHeight, x*cellWidth, (y+1)*cellHeight);

    }
    private void drawO(Graphics g, int y, int x){
        g.setColor(Color.CYAN);
        ((Graphics2D)g).setStroke(new BasicStroke(2f));
        g.drawOval(x*cellWidth, y*cellHeight, cellWidth,cellHeight);
    }
}
