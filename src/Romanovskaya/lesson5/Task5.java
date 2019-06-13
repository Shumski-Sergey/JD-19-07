package Romanovskaya.lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

        public static void main(String[] args) {

// Вывести буквы латинского алфавита

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

                //Инициаизация строк на наличие букв латинского алфавита

                String str1 = new String();
                str1 = str[i].replaceAll("[а-яА-Я\\d]" , " ");
                System.out.println(str1);
            }

            System.out.println(" ");

        }
    }

