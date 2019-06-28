package vgorelko.Lesson10.TaskA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class TaskA1 {

    public static void main(String[] args) throws IOException {
//Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”). Избавиться от повторяющихся элементов
// в строке и вывести результат на экран.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        System.out.println("Введите любое число с клавиатуры либо ничего не набирайте и нажмите ENTER для выхода!");
        do {

            String text = bufferedReader.readLine();
            if (text.equals("")) { //Для выхода из цикла
                break;
            }
            int num = Integer.parseInt(text);
            list.add(num);

        } while (true);

        System.out.println("Список с дублями!");
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.addAll(list);

        System.out.println("Список без дублей!");
        System.out.println(set);

    }

}
