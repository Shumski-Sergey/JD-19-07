package vgorelko.Lesson5;

import sun.plugin.javascript.navig.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2 {

    //Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

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


//Применим пузырьковую сортировку, от меньшего к большему
        for (int i = arrText.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrText[j].length() < arrText[j + 1].length()) {  //Меняем знак и будет от большего к меньшему
                    String a = arrText[j];
                    arrText[j] = arrText[j + 1];
                    arrText[j + 1] = a;
                }
            }
        }

        System.out.println(Arrays.toString(arrText));

    }

}
