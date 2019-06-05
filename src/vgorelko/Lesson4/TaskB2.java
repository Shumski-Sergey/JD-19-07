package vgorelko.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskB2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите текст");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String textEnter = reader.readLine();


        char[] arr = textEnter.toCharArray();

        int a;

        for (int i = 0; i < arr.length; i ++) {

            System.out.println(arr[i] + " " +  ( a = arr[i] - '0')); // Проба пера, хотел проверить существует ли последовательность

        }


    }

}
