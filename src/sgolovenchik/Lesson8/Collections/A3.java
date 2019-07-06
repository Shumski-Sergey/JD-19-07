package sgolovenchik.Lesson8.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class A3 {
    public static void main(String[] args) {
        int NumStud = 5;  // число студентов
        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < NumStud; i++) {
            int m = (int) (Math.random() * 10 + 1);//рандом оценок от 1 до 10 включительно
            mark.add(i, m);
        }
        System.out.println("Массив оценок учеников :" + mark);

        Iterator<Integer>iterator = mark.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (  temp > max ) {
                max = temp;
            }
        }
        System.out.println("Максимальная оценка : " +max);
    }
}