package homework.n3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(reverseArrayValues(array)));

        int[] array2 = new int[100];
        System.out.println(Arrays.toString(fillArrayWithValues(array2)));

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyByTwoNumsLessThanSix(array3)));

        int[][] array4 = new int[5][5];
        System.out.println(Arrays.toString(fillDiagonalWithUnit(array4)));

        System.out.println(Arrays.toString(getArrayWithLenAndInitialValue(9, 12)));

        int[] array5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
        System.out.println((getMinValue(array5)));
        System.out.println((getMaxValue(array5)));
    }

    private static int[] reverseArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
        return array;
    }

    private static int[] fillArrayWithValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static int[] multiplyByTwoNumsLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    private static int[][] fillDiagonalWithUnit(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i == array.length - 1 - j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        return array;
    }

    private static int[] getArrayWithLenAndInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static int getMinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int getMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
