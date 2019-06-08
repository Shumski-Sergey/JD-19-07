package sgolovenchik.Lesson3;

import java.util.Scanner;

public class A7 {

    public static void main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        long factorial = 1;
        System.out.print("Введите натуральное число N:");
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;}
        System.out.print("Факториал числa " + N + " равен : " + factorial );

        }

    }