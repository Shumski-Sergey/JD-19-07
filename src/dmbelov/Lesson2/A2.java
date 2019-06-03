package dmbelov.Lesson2;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers a: ");
        double a = scanner.nextInt();
        System.out.print("Enter numbers b: ");
        double b = scanner.nextInt();
        System.out.print("Enter numbers c: ");
        double c = scanner.nextInt();

        discriminant(a, b, c);
    }

    private static void discriminant(double a, double b, double c) {
        double d = b*b - 4*a*c;
        if (d<0) {
            System.out.println("There are no roots");
        }
        else {
            double x1 = ((-1*b) + Math.sqrt(d))/(2*a);
            double x2 = ((-1*b) - Math.sqrt(d))/(2*a);
            System.out.println(x1 + " " + x2);
        }
    }
}
