package sgolovenchik.Lesson4;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        char[] textArray = text.toCharArray();
        int count = 0;
        for (int i = 1; i < textArray.length; i++) {
            if (textArray[i-1] != ' ') {
                while (textArray[i-1] != ' ') {
                    i++;
                }
                count++;
            }
        }
        System.out.println("В строке " +count+ " слов.");
    }
}
