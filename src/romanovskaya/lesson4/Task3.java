package romanovskaya.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException{

        //Вывести последние буквы всех слов

        String text;

        System.out.println("Введите ваше предложение :");

        //Ввод текста с консоли

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        text = reader.readLine();

        // создаем массив для букв
        String[] words = text.split("(?=[ ,.!?1234567890-:;])");

        //выводим последние буквы

        System.out.println("Последние буквы введенного предложения:");

        for (int i = 0; i <words.length; i++ ){
            char[] ch = words[i].toCharArray();

            System.out.println( ch[ch.length-1] + " ");
        }


    }

}
