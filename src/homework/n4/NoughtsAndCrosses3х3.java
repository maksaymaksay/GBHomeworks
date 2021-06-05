package homework.n4;

import java.util.Random;
import java.util.Scanner;

public class NoughtsAndCrosses3х3 {

    private static char[][] field;
    private static final int size = 3;

    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static void main(String[] args) {
        initField();
        System.out.println("Добро пожаловать в игру!");
        printField();

        while (true) {

            humanTurn();

            printField();

            if (isWinnerUpdated(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }

            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();

            printField();

            if (isWinnerUpdated(DOT_O)) {
                System.out.println("Искусственный интеллект победил!");
                break;
            }

            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

        System.out.println("Игра окончена!");
    }


    private static void initField() {
        field = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X и Y!");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        System.out.println("Пользователь сделал ход в точке " + (x + 1) + " " + (y + 1));
        field[x][y] = DOT_X;
    }

    private static void aiTurn() {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isCellValid(x, y));

        System.out.println("Искуственный интеллект сделал ход в точке " + (x + 1) + " " + (y + 1));
        field[x][y] = DOT_O;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            return false;
        }

        if (field[x][y] == DOT_EMPTY) {
            return true;
        }

        return false;
    }

    private static boolean isWinner(char symbol) {

        if (field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol) {
            return true;
        }
        if (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol) {
            return true;
        }
        if (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol) {
            return true;
        }

        if (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol) {
            return true;
        }
        if (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol) {
            return true;
        }
        if (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol) {
            return true;
        }

        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) {
            return true;
        }
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
            return true;
        }
        return false;
    }

    private static boolean isWinnerUpdated(char symbol) {
        if (checkLines(symbol, true) || checkLines(symbol, false)) {
            return true;
        }
        return isDiagonalFilled(symbol);
    }

    private static boolean checkLines(char symbol, boolean isRow) {
        int winCounter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char fieldSymbol = isRow ? field[i][j] : field[j][i];
                if (fieldSymbol == symbol) {
                    winCounter += 1;
                } else {
                    winCounter = 0;
                }

                if (j == size - 1) {
                    if (winCounter == size) {
                        return true;
                    }
                }
            }
            winCounter = 0;
        }
        return false;
    }


    private static boolean isDiagonalFilled(char symbol) {
        int leftDiagonalCounter = 0;
        int rightDiagonalCounter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (i == j && field[i][j] == symbol) {
                    leftDiagonalCounter += 1;
                }
                if (i == field.length - 1 - j && field[i][j] == symbol) {
                    rightDiagonalCounter += 1;
                }
            }
        }
        if (leftDiagonalCounter == field.length || rightDiagonalCounter == field.length) {
            return true;
        }
        return false;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (field[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
