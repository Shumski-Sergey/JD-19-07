package sgolovenchik.Lesson4;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = in.nextLine();
        char[] c = {'.', ',', '-', ':', ';', '?', '!'};
        System.out.println("В массиве " + c.length + " искомых знаков");
        int count = 0;
        System.out.println("В тексте: " +text+ " "+text.length()+ " символов");
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (text.charAt(i) == c[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Искомые знаки встречаются "+count+ " раз(а)");
    }
}





