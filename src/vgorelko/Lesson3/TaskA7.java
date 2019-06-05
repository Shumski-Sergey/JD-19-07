package vgorelko.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA7 {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();

        int num = Integer.parseInt(num1);
        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }

        System.out.println("Факториал числа " + num + " равен " + fact);

    }

}
