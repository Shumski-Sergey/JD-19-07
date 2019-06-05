package ezhalabkevich.L2;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        //Task 3

        System.out.println("Insert a number to solve a sum! ");
        Scanner sc = new Scanner(System.in); //у  сканнер скобки не пустые!!!
         int num1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num1; i++) {
            sum += i;
        }
        System.out.println("Sum = "+sum);

    }
}
