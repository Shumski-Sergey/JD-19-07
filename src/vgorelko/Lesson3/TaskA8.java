package vgorelko.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA8 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите натуральное число!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();

        int num = Integer.parseInt(num1);

        while (num < 0) {

            System.out.println("Вы ввели отрицательное число, введите положительное!");

            num1 = reader.readLine();

            num = Integer.parseInt(num1);

        }

        for (int i = 1; i <= num; i++){

            if ( (num % i) == 0 ) {

                System.out.println(i);

            }
        }

    }

}