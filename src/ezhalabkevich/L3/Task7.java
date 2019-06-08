package ezhalabkevich.L3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args)  {
        //Task 7
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
       int rez=1;
        System.out.println("Введите число ");
        int f=sc.nextInt();
        for (int i=1;i<=f;i++){
            rez*=i;
        }
        System.out.print("Факториал числа "+f+" равен "+rez);
        System.out.println(" ");
    }
}
