package hw8;

import java.util.Random;
import java.util.Scanner;

public class Logic {
    public static char map[][];
    public static int SIZE;
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '.';
    public static int DOTS_TO_WIN;
    static Random random = new Random();
    static boolean isGameOver;


    public static void go() {
        isGameOver = true;
        printMap();
        if (checkWin(DOT_X)) {
            System.out.println("Вы победили!");
            new Winner();
            return;
        }
        if (isFull()) {
            System.out.println("Ничья");
            new Winner();
            return;
        }
        aiTurn();
        printMap();
        if (checkWin(DOT_O)) {
            System.out.println("Компьютер победил!");
            new Winner();
            return;
        }
        if (isFull()) {
            System.out.println("Ничья");
            new Winner();
            return;
        }
        isGameOver = false;
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }

        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();

        }

    }

    public static void humanTurn(int y, int x) {
        if (isCellValid(y, x)) {
            map[y][x] = DOT_X;
            go();
        }


    }

    public static void aiTurn() {
        int x, y;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;


    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }

            }
        }
        return true;

    }

    public static boolean checkWin(char c) {
        boolean check = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (CheckWinParallelLine(i, j, c) || CheckWinPerpendicularLine(i, j, c) || CheckWinDiagonalLine(i, j, c) || CheckWinDiagonalLine_2(i, j, c)) {
                    check = true;
                } else continue;

            }
        }
        return check;
    }

    public static boolean CheckWinParallelLine(int y_, int x_, char dot) {
        int counter = 0;
        if (x_ + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[y_][x_ + i] == dot) {
                counter++;
            }
        }
        return (counter == DOTS_TO_WIN);
    }

    public static boolean CheckWinPerpendicularLine(int y_, int x_, char dot) {
        int counter = 0;
        if (y_ + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {

            if (map[y_ + i][x_] == dot) {
                counter++;
            }
        }
        return (counter == DOTS_TO_WIN);
    }

    public static boolean CheckWinDiagonalLine(int y_, int x_, char dot) {
        int counter = 0;
        if (y_ + DOTS_TO_WIN > SIZE || x_ + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {

            if (map[y_ + i][x_ + i] == dot) {
                counter++;
            }
        }
        return (counter == DOTS_TO_WIN);
    }

    public static boolean CheckWinDiagonalLine_2(int y_, int x_, char dot) {
        int counter = 0;
        if (y_ - DOTS_TO_WIN + 1 < 0 || x_ + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {

            if (map[y_ - i][x_ + i] == dot) {
                counter++;
            }
        }
        return (counter == DOTS_TO_WIN);
    }
}
//    public static boolean checkWin(char c) {
//        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
//            return true;
//        } ;
//        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
//            return true;
//        } ;
//        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
//            return true;
//        }
//        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
//            return true;
//        }
//        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
//            return true;
//        }
//        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
//            return true;
//        }
//        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
//            return true;
//        }
//        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {
//            return true;
//        }
//        return false;
//    }

