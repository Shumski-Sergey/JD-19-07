package vgorelko.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество строк!");

        String countText = reader.readLine();

        int count = Integer.parseInt(countText);

        String [] arrText = new String[count];

        System.out.println("Введите текст");

        for (int i = 0; i < arrText.length; i++){

            arrText[i] = reader.readLine();

        }

        String arr [] = arrText[0].split("");

        for (int i = 0; i < arrText.length; i++) {

   //         String arr [] = arrText[0].split("");

        }


        int countRepeat = 0;

        for (int i = 0; i < arrText.length-1; i++) {


            for (int b = i+1; b < arrText.length; b++) {

                if (arrText[i] == arrText[b]) {

                    countRepeat++;

                }

            }

        }

        System.out.println(countRepeat);




    }

}
