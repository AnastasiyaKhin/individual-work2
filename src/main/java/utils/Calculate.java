package utils;

import java.util.Arrays;
import java.util.Random;

public class Calculate {

    public static int getMax(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }

    public static int getSumOfArrayElements(int[] nums){
      int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static double getEverage (int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
