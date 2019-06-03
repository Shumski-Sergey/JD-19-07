package dkuleshov;

public class Lesson32 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if ((i % 2) != 0) continue;
            if (i > 111) break;
            System.out.println(i);
        }
    }
}