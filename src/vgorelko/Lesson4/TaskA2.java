package vgorelko.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите текст");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String textEnter = reader.readLine();

        String[] words = textEnter.split("\\s*[ ,.!?1234567890]\\s*"); //Решил исключить числа

        System.out.println("Количество слов в тексте: " + words.length);



    }

}
