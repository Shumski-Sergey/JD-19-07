package rbondarovich.l2.l2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        double A = Double.parseDouble(r.readLine());
//        double B = Double.parseDouble(r.readLine());
//        double C = Double.parseDouble(r.readLine());
//        decideSqrEquation(A,B,C);
//
//    }
    double a,b,c;

    public task2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void decideSqrEquation() {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double result1 = (-b - Math.sqrt(D)) / 2 * a;
            double result2 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("Уравнение имеет два корня: х1 = " + result1 + " x2 =" + result2);
        }
        else if (D == 0) { double result = -b/2*a;
            System.out.println("Корень уравнения x = " + result);}
        else System.out.println("корней нет");

    }
}
