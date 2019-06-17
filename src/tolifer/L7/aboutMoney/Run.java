package tolifer.L7.aboutMoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Run {
    public static void main (String [] args) throws IOException {

        double number = 0;

        System.out.println("Введите целое число рублей: ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String  aString = Long.toString(a);

        System.out.println("Введите целое число десятков копеек: ");
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        char b = (char) reader.read();

        System.out.println("Введите целое число единиц копеек: ");
        BufferedReader  reader1 = new BufferedReader(new InputStreamReader(System.in));
        char c = (char) reader1.read();

        String bString = ""+b;
        String cString = ""+c;

        String numb = aString+"."+bString+cString;

        try {
            number = Double.valueOf(numb);
        }   catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
        }

        System.out.println("Введите число, с которым будут проводиться манипуляции: ");
        Scanner scanner = new Scanner(System.in);
        double number2 = scanner.nextDouble();

        System.out.println("Сложение чисел "+ numb+ " и "+ number2+ " = " + Service.addition(number, number2));
        System.out.println("Вычитание чисел "+ numb+ " и "+ number2+ " = " + Service.subtraction(number, number2));
        System.out.println("Деление чисел "+ numb+ " и "+ number2+ " = " + Service.division(number, number2));
        System.out.println("Умножение чисел "+ numb+ " и "+ number2+ " = " + Service.multiplication(number, number2));





        //System.out.println(numb);
    }
}
