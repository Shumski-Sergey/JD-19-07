package vgorelko.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        System.out.println(TaskA1.Recursion(text));


    }

    public static String Recursion(String text) {

        char arr [] = text.toCharArray();

        String newText = "";

        for (int i = arr.length-1; i >= 0; i--) {

            newText = newText + arr[i];

        }

        return newText;
    }


}
