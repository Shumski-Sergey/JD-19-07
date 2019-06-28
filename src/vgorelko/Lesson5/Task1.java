package vgorelko.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {

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

        int minCount = arrText[0].length();
        int indexMinCount = 0;

        int maxCount = arrText[0].length();
        int indexMaxCount = 0;

        for (int i = 1; i < arrText.length; i++) {

            if (minCount > arrText[i].length()) {

                minCount = arrText[i].length();

                indexMinCount = i;
            }
            if (maxCount < arrText[i].length()) {

                maxCount = arrText[i].length();

                indexMaxCount = i;


            }
        }

        System.out.println("Самая длинная строка имеет длину " + arrText[indexMaxCount].length() + ". Содержание строки: " + arrText[indexMaxCount]);

        System.out.println("Самая короткая строка имеет длину " + arrText[indexMinCount].length() + ". Содержание строки: " + arrText[indexMinCount]);
    }

}