package utils;

public class Printer {
    public static void printStars() {
        String[][] stars = new String[5][5];
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void checkNumbers(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("excellent");
        } else if (x > 0 && y > 0 || y > 0 && z > 0 || x > 0 && z > 0 ) {
            System.out.println("good");
        } else if (x > 0 || y >0 || z > 0) {
            System.out.println("fine");
        } else if (x < 0 && y < 0 && z < 0) {
            System.out.println("bad");
        }
    }
}
