package vgorelko.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskB2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите текст");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String textEnter = reader.readLine();
        textEnter = textEnter.replaceAll("\\s+","");


        char[] arr = textEnter.toCharArray();

        int i, b;
        b = 1;

        for (i = 1; i < arr.length; i ++) {
            if (arr[i-1] < arr[i]) {
                if (b == 1) {
                    System.out.print(" " + arr[i-1]);
                    b = 0;
                }

                System.out.print(arr[i]);
            }

            if (arr[i-1] > arr[i]) {
                b = 1;
            }

        }

    }

}
