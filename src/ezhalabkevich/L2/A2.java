package ezhalabkevich.L2;
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        //Task A2
        Scanner sc = new Scanner (System.in);
        double a, b, c;
        double d;
        double x1, x2;
        System.out.println("Insert a =");
        a=sc.nextDouble();
        System.out.println("Insert b =");
        b=sc.nextDouble();
        System.out.println("Insert c =");
        c=sc.nextDouble();

        d = b * b - 4 * a * c;


        if (d > 0) {
            System.out.println("There are 2 roots: ");
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (d == 0) {
            System.out.println("There is 1 root: ");
            x1 = (-b) / (2 * a);
            System.out.println("x1 = " + x1);
        } else System.out.println("No roots, try again...");
    }
}
