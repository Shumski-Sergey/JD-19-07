package Romanovskaya.lesson5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task3 {
    public static void main(String[] args) {

        // вывести строки по длине ниже средней длины всех строк

        int n = 0;

        //  Ввод количества строк с клавиатуры
        while (true) {
            System.out.println("Введите количество строк");
            Scanner sc1 = new Scanner(System.in);
            try {
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            }

        }
        // Ввод массива строк
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);

        //Инициализация массива str строками
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = sc2.nextLine();
        }

        float average = 0f;
        //Считаем общую сумму длинн строк
        for (String item : str) {
            average += (float) item.length();
        }

        // Считаем среднее арифметическое этих строк
        average /= str.length;

        System.out.println("Средняя длина строки = + (" + average + ")");
        // Выводит результат ( выводит все строки, имеющие длину ниже средней)
        for (int i = 0; i < n; i++) {
            if (str[i].length() < average) {
                System.out.println("Строка меньшая , чем средняя длина:");
                System.out.println(str[i] + " ее длина " + str[i].length());
            }
        }
    }
}
