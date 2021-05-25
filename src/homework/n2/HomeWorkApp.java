package homework.n2;

public class HomeWorkApp {
    public static void main(String[] args) {
        isSumInInterval(11, 5);
        printIsNumPositiveOrNegative(-100);
        isNumNegative(100);
        printStringInCertainTime("Привет!", 5);
        isYearBissextile(2400);
    }

    private static boolean isSumInInterval(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    private static void printIsNumPositiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    private static boolean isNumNegative(int num) {
        return num < 0;
    }

    private static void printStringInCertainTime(String str, int times) {
        for (int i = 0; i <= times - 1; i++) {
            System.out.println(str);
        }
    }

    private static boolean isYearBissextile(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && !(year % 400 == 0)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
