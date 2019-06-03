package dmbelov.Lesson3;


import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {

        System.out.print("Введите число, факториал которого хотите вычислить: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factor=1;

        for (int i=1; i<=number; i++) {
            factor *= i;
        }
        System.out.println(factor + " факториал " + "числа " + number);

    }
}
