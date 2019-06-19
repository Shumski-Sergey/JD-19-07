package vgorelko.Lesson9;

import java.util.*;

import java.util.ArrayList;

public class TaskA1 {

    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            points.add((int) (Math.random() * 10));

        }

        System.out.print("Выводим все случайные оценки учеников (случайно сгенерированные): ");
        System.out.println(points);

        System.out.print("Удаляем оценки <=5: ");
        points.removeIf(i -> (i <= 5));
        System.out.println(points);
    }

 }