package sshumsky.L2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        dis(in.nextDouble(), in.nextDouble(), in.nextDouble());
    }

    /**
     * Disc for numbers
     * @param a first number
     * @param b second number
     * @param c next number
     */
    private static void dis(double a, double b, double c) {
        double D;
        D = b * b - 4 * a * c;
        ifOperand(a, b, D);
    }

    private static void ifOperand(double a, double b, double d) {
        if (d > 0) {
            tooD(a, b, d);
        } else if (d == 0) {
            oneD(a, b);
        } else {
            System.out.println("Отрицацельный дискриминант");
        }
    }

    private static void oneD(double a, double b) {
        double x;
        x = -b / (2 * a);
        System.out.println(x);
    }

    private static void tooD(double a, double b, double d) {
        double x1, x2;
        x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
        x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
        System.out.println(x1 + " " + x2);
    }

}
