package utils;

public class Check {

    public static boolean isOdd(int a) {
        boolean isEven = false;
        if (a % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }

    public static boolean isDevidedByThree(int a) {
        boolean isMultipleThree = false;
        if (a % 3 == 0) {
            isMultipleThree = true;
        }
            return isMultipleThree;
    }

    public static boolean isDevidedByFiveAndSeven(int a) {
        boolean isMultiple = (a % 5 == 0 && a % 7 == 0);
        if (a % 5 == 0 && a % 7 == 0) {
            isMultiple = true;
        }
            return isMultiple;
    }
}
