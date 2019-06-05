package vgorelko.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String textEnter = reader.readLine();

        String znakPr [] = {"[", "-", ".", "?", "!", ")", "(", ",", ":", "]", " "};

        char[] arr = textEnter.toCharArray();

        String[] text = new String[arr.length];

        for(int i = 0; i < text.length; i++) {

            text[i] = String.valueOf(arr[i]);

        }

        int count = 0;

        for(int i = 0; i < text.length; i++) {
            for (int j = 0; j < znakPr.length; j++) {

                if (text[i].equals(znakPr[j])) {

                    count++;

                }


            }

        }

        System.out.println(count);

    }

}
