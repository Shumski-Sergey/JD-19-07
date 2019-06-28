package vgorelko.Lesson2;

public class TaskA1 {

    public static void main(String[] args) {

        int m, n;

        m = 8;
        n = 5;

        if (Math.abs(m - 10) > Math.abs(n - 10)) {

            System.out.println("Ближайешее к десяти " + n);

        } else {

            System.out.println("Ближайешее к десяти " + m);

        }
    }
}
