package dmbelov;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double m, n;
        System.out.print("Enter first number: ");
        m = scanner.nextDouble();
        System.out.print("Enter second number: ");
        n = scanner.nextDouble();

        if (m==n) {
            System.out.println(m + " equals " + n);
        }

        m = Math.round(m);
        n = Math.round(n);

        int subM = 10 - (int) m;
        int subN = 10 - (int) n;
        subM = Math.abs(subM);
        subN = Math.abs(subN);

        if (subM<subN) {
            System.out.println(m+" is closer to 10");
        }
        else {
            System.out.println(n+" is closer to 10");
        }

    }
}
