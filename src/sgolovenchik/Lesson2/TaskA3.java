package sgolovenchik.Lesson2;

import java.util.Scanner;

public class TaskA3 {

    public static void main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        System.out.print("А= ");
        double A = in.nextDouble();
        System.out.print("B= ");
        double B = in.nextDouble();
        System.out.print("C= ");
        double C = in.nextDouble();
        double small = A, medium = B, big = C; //По умолчанию первый из 6-ти вариантов
        if ( A < C && C < B ) {
            medium = C; big = B; }
        if ( B < C && C < A ) {
            small = B; medium = C; big = A; }
        if ( B < A && A < C ) {
            small = B; medium = A; big = C; }
        if ( C < A && A < B ) {
            small = C; medium = A; big = B; }
        if ( C < B && B < A ) {
            small = C; medium = B; big = A; }
        System.out.print("Числа по возрастанию: " + small + ", " + medium + ", " + big );
    }
}
