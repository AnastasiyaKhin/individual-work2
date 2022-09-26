package utils;

public class Geometry {
    public static String getRoots(int a, int b, int c) {
        double d = Math.pow(b,2) - 4 * a * c;
        if ( d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            String result1 = "Корни квадратного уравнения " + a +"*x^2 + " + b + "*x + " + c  + " = 0 равны x1 = " + x1 + ", " + "x2 = " + x2;
            return result1;
        } else {
            String result2 = " Квадратное уравнение " + a +"*x^2 + " +b + "*x + " + c  + " = 0 не имеет корней ";
            return result2 ;
        }
    }
}
