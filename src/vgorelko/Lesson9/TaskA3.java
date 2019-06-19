package vgorelko.Lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskA3 {

    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            points.add((int) (Math.random() * 10));
        }

        System.out.print("Выводим все случайные оценки учеников (случайно сгенерированные): ");
        System.out.println(points);

        //Используем итератор для нахождения максимального числа
        Iterator itr = points.iterator();
        int max = 0;
        while(itr.hasNext()) {

            int i = (int) itr.next(); //Таким образом берем значение в ячейке
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);



    }

}
