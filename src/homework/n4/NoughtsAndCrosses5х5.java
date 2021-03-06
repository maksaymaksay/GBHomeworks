package homework.n4;

import java.util.Random;
import java.util.Scanner;

public class NoughtsAndCrosses5х5 {

    private static char[][] field;
    private static final int size = 5;

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

    private static boolean isWinnerUpdated(char symbol) {
        if (isLinesFilled(symbol, true) || isLinesFilled(symbol, false)) {
            return true;
        }
        return isDiagonalFilled(symbol);
    }

    private static boolean isLinesFilled(char symbol, boolean isRow) {
        int winCounter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char fieldSymbol = isRow ? field[i][j] : field[j][i];
                if (fieldSymbol == symbol) {
                    winCounter += 1;
                } else {
                    winCounter = 0;
                }

                if (j == size - 2) {
                    if (winCounter == size - 1) {
                        return true;
                    }
                }
            }
            winCounter = 0;
        }
        return false;
    }

    private static boolean isDiagonalFilled(char symbol) {
        int rightMainDiagonalCounter = 0;
        int rightSmallUpperDiagonalCounter = 0;
        int rightSmallLowerDiagonalCounter = 0;
        int leftMainDiagonalCounter = 0;
        int leftSmallUpperDiagonalCounter = 0;
        int leftSmallLowerDiagonalCounter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && field[i][j] == symbol) {
                    leftMainDiagonalCounter += 1;
                }
                if (i == j - 1 && field[i][j] == symbol) {
                    leftSmallUpperDiagonalCounter += 1;
                }
                if (i == j + 1 && field[i][j] == symbol) {
                    leftSmallLowerDiagonalCounter += 1;
                }

                if (i == size - 1 - j && field[i][j] == symbol) {
                    rightMainDiagonalCounter += 1;
                }
                if (i == size - 2 - j && field[i][j] == symbol) {
                    rightSmallLowerDiagonalCounter += 1;
                }
                if (i == size - j && field[i][j] == symbol) {
                    rightSmallUpperDiagonalCounter += 1;
                }
            }
        }
        if (leftMainDiagonalCounter == size - 1 ||
                leftSmallUpperDiagonalCounter == size - 1 ||
                leftSmallLowerDiagonalCounter == size - 1 ||
                rightMainDiagonalCounter == size - 1 ||
                rightSmallLowerDiagonalCounter == size - 1 ||
                rightSmallUpperDiagonalCounter == size - 1
        ) {
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
