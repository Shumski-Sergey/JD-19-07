package sgolovenchik.Lesson4;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        char[] symb = {'.', ',', '-', ':', ';', '?', '!'};
        System.out.println("В массиве " + symb.length + " искомых знаков");
        int count = 0;

        System.out.println("В тексте: " +text+ " "+text.length()+ " символов");
        for (int i = 0; i < text.length(); i++) {
            for (int j = 1; j < symb.length ;  j++) {
                if (text.charAt(i) == symb[j-1]) {
                    count++;
                }
            }
        }
        System.out.println("Искомые знаки встречаются "+count+ " раз(а)");
    }
}





