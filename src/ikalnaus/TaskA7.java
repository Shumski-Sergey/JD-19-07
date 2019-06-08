package ikalnaus;

import java.util.Scanner;

public class TaskA7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число n:");
        int n = in.nextInt();
        int a=1;
        for(int i=1; i<=n; i++)
            a *= i;
        System.out.println("Факториал числа " + n +" равен " + a);
        in.close();
    }
}
