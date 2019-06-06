package sgolovenchik.Lesson3;

import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        System.out.print("Введите натуральное число N:");
        int N = in.nextInt();
        System.out.print("Положительные делители числа " + N + " :");
        for (int i = 1; i <= N; i++) {
            if ((N % i) == 0) {
                System.out.print("  " +i);
            }
        }
    }
}
