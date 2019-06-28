package rbondarovich.l2.l2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите первое число:");
        double M = Double.parseDouble(r.readLine());
        System.out.println("введите второе число:");
        double N = Double.parseDouble(r.readLine());
        System.out.println("введите третье число:");
        double L = Double.parseDouble(r.readLine());


        //  Задача А1
        System.out.println("Ближайшее число к 10:");
        if(Math.abs(10-M) < Math.abs(10-N)) System.out.println(M);
        else if (Math.abs(10-M) == Math.abs(10-N)) System.out.println("числа равноудалены от 10");
        else System.out.println(N);
        System.out.println("---------------------------------------------------------------------------");


        //  Задача А2
        System.out.println("Корень квадратного уравнения");
        task2 solution = new task2(M, N, L);
        solution.decideSqrEquation();
        System.out.println("---------------------------------------------------------------------------");


        //  Задача А3
        System.out.println("Sorting:");
        task3.sort(M,N,L);
        System.out.println(123);


    }
}
