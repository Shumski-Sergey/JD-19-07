package Romanovskaya.lesson2;

public class TaskA1 {
    public static void main(String[] args) {
        double k = 10;
        double n = 8.5;
        double m = 11.45;
        if (Math.abs(k - n) > Math.abs(k - m)) {
            System.out.println("Ближайшее число к 10:" + " " + n);
        } else {
            System.out.println("Ближайшее число к 10:" + " " + m);
        }
    }
}