package romanovskaya.lesson4;

import java.util.Scanner;

public class Task2new {

    public static void main(String[] args) {

        // Подсчитать количество слов в предложении

        int number;

        System.out.println("Введите ваше предложение:");

        //Ввод текста с консоли

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        // Подсчет количества слов

        number = sentence.split(" ").length;

        // Выводим количество слов

        System.out.println("Количество слов в заданном предложении" + " " + number);

    }
}


