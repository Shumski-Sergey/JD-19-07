package vgorelko.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    //Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

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

        int sum = 0;

        for (int i = 0; i < arrText.length; i++) {

            sum = sum + arrText[i].length();

        }

        double avg = sum / count;

        System.out.println("AVG: " + avg);


        for (int i = 0; i < arrText.length; i++) {

            if (arrText[i].length() < avg) {
                System.out.println("Слово с длинной меньше avg: " + arrText[i] + ". Длина слова: " + arrText[i].length());
            }

        }


    }

}
