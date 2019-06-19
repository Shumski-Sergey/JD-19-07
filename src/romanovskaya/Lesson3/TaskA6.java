package romanovskaya.Lesson3;

import java.util.Scanner;

public class TaskA6 {
    public static void main(String[] args) {
        int a;
        int b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число :");
        a = scan.nextInt();
        for (int i = a; i > 0; i--) {
            b *= i;
        }
            System.out.println("Факториал числа" + " " + a + "равен" +" " +b);
    }
}
