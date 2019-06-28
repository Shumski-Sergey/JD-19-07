package dmbelov.Lesson10.Lab.uniqueChars;

import java.util.Scanner;

public class UniqueCharsRunner {

    public static void main(String[] args) {

        UniqueChars chars = new UniqueChars();
        chars.setText("But in the middle of the night. 1973");

        System.out.print("Make your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1: chars.calculateUpperCaseChars();
                    System.out.print(chars);
                    break;
            case 2: chars.calculateLowerCaseChars();
                    System.out.print(chars);
                    break;
            case 3: chars.calculate();
                    System.out.print(chars);
                    break;
        }
    }
}