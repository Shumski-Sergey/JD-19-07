package dmbelov.Lesson3;


import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                System.out.println("Divider is " + i + " ");
            }
        }

    }
}
