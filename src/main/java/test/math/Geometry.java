package test.math;

public class Geometry {
    public static int getHyp(int k1, int k2) {
        double c = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));
        int hypResult = (int) Math.round(c);
        return hypResult;
    }


}
