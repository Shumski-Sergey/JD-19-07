package sgolovenchik.Lesson4;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] != ' ') {
                while (textArray[i] != ' ') {
                    i++; if ( i == textArray.length ) {break;}
                }
                System.out.print(textArray[i-1]);
            }
        }
    }
}

