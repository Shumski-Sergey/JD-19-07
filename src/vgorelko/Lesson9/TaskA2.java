package vgorelko.Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskA2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            numbers.add((int) (Math.random() * 6));

        }

        System.out.print("Выводим все случайные цифры (случайно сгенерированные): ");
        System.out.println(numbers);

        //Способ первый удаления дублей
       // numbers = numbers.stream().distinct().collect(Collectors.toList());

        //Способ второй удаления дублей
        Object[] st = numbers.toArray();
        for (Object s : st) {
            if (numbers.indexOf(s) != numbers.lastIndexOf(s)) {
                numbers.remove(numbers.lastIndexOf(s));
            }
        }
        System.out.println(numbers);

    }

}
