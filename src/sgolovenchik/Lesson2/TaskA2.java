package sgolovenchik.Lesson2;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {

        System.out.println("Введите коэффициенты A,B,C квадратного уравнения вида: Ax² + Bx + C = 0 ");
        Scanner in = new
                Scanner(System.in);
        System.out.print("А= ");
        double A = in.nextDouble();
        System.out.print("B= ");
        double B = in.nextDouble();
        System.out.print("C= ");
        double C = in.nextDouble();

        if (A == 0) {
            double x1 = ((0 - C) / B);
            System.out.print("При А=0 уравнение НЕ является квадратным и имеет одно решение: x = " + x1);
        } else {
            double D = (Math.pow(B, 2) - 4 * A * C);
            if (D < 0) {
                System.out.println("Уравнение не имеет решений.");
            } else if (D == 0) {
                double x1 = (-B / 2 * A); //вычисление без корня из D, т.к. D=0
                System.out.println("Уравнение имеет один вещественный корень: х = " + x1);
            } else {
                double x1 = (-B - Math.sqrt(D)) / 2 * A;
                double x2 = (-B + Math.sqrt(D)) / 2 * A;
                System.out.println("Уравнение имеет два вещественных корня: х1 = " + x1 + ", х2 = " + x2);
            }

        }
    }
}


