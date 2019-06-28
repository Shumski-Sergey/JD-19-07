package sgolovenchik.Lesson2;

public class TaskA1 {
    public static void main(String[] args) {
        double m = 8.5, n = 11.45;
        {
            if (Math.abs(10 - m) > Math.abs(10 - n)) System.out.println("Из заданных чисел ближайшее к 10: " + n);
            else System.out.println("Из заданных чисел ближайшее к 10: " + m);
        }
    }
}
