package vgorelko.Lesson2;
import java.util.*;

public class TaskB1 {

    public static void main(String[] args) {

        int max = 155;
        int min = 5;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1)); // т.к. 0.0 <= Math.random() < 1.0

        System.out.println("Сгенерированное рандомное число: " + randomNum);

        if (25 <= randomNum && 100 >= randomNum) {

            System.out.println("Сгенерированное число попало в диапазон [25;100]");

        } else {

            System.out.println("Сгенерированное число вне диапазона");

        }


    }

    }