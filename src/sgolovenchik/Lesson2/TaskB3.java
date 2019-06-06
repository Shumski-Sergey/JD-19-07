package sgolovenchik.Lesson2;

import java.util.Scanner;

public class TaskB3 {

    public static void main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        System.out.print("Введите любое целое положительное число:");
        int A = in.nextInt();
        int B = 1, sum = 0;
        System.out.print(" 0");
        while (B <= A) { sum = sum + B; System.out.print(" +" + B); B++; }
        System.out.print(" = " + sum);
    }
}
