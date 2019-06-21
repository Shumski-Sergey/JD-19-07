package romanovskaya.lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // вывести строки по возрастанию их длины

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

        //Сортируем значения пузырьком по возрастанию

        for ( int i = str.length-1; i>0; i--){
            for ( int j = 1; j<i; j++){
                // Сравниваем элементы попарно
                if (str[i].length() > str[j+1].length()) {
                    String tmp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = tmp;
                }
            }
        }
        //Выводим результат
        for ( int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }

    }
}