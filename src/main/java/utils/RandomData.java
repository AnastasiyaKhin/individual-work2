package utils;

import java.util.Arrays;
import java.util.Random;

public class RandomData {
    public static int[] generateArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(array.length);
        }
        return array;
    }
}
