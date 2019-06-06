package sgolovenchik.Lesson3;

public class A6 {
    public static void main(String[] args) {
        int a = -166;
        while (a < 100) {
            a = a * 2 + 200;
            if (-100 < a && a < 100) {
                System.out.println(a);
            }
        }
    }
}

