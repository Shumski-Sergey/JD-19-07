package vgorelko.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskB3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        int number =0;

        try {                              //Тут решил использовать исключение, т.к. предпологается, что случайно могут внести отрицательное значение или текст.
            number = Integer.parseInt(a1);
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число (возможно текст или дробное значение). Пожалуйста перепроверьте!!!");
            return;
                    }

        if (number < 0 ) {
            System.out.println("Вы ввели отрицательное число!");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum+=i;
        }

        System.out.println(sum);

    }
}
