package dmbelov;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter positive integer: ");
        int number = scanner.nextInt();
        int sum=0;
        if (number<0) {
            System.out.print("You entered negative number ");

        }

        else {
            for(int i = 0; i <=number; i++) {
                sum+=i;
            }
        }

        System.out.print("The sum of all numbers from 1 to " + number + " = " + sum
        );

    }
}
