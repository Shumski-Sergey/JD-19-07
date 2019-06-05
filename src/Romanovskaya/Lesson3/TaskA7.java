package Romanovskaya.Lesson3;

import java.util.Scanner;

public class TaskA7 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        a = scan.nextInt();
        System.out.println("Деалителями числа " + a + "являются:");
        for (int x = a; x>0; x--){
            int b = a%x;
            if ( b==0)
                System.out.print(x + " ");
        }

    }
}
