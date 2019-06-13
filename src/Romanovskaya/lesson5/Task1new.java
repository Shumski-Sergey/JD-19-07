package Romanovskaya.lesson5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1new {
    public static void main(String[] args) {

// вывести самую короткую и динную строки
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
        //Находим самую длинную строку
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > n) {
                n = str[i].length();
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == n) {
                System.out.println();
                System.out.println("Самая длинная строка:");
                System.out.println(str[i]);
                System.out.println("Длина самой длинной строки");
                System.out.println(str[i].length());
            }
        }
        //находим самую короткую строку
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < n) {
                n = str[i].length();
            }
        }

        for (int i = 0;i <str.length; i ++){
            if ( str[i].length() == n){
                System.out.println();
                System.out.println("Самая короткая строка:");
                System.out.println(str[i]);
                System.out.println("Длина самой короткой строки");
                System.out.println(str[i].length());
            }
        }

    }
}