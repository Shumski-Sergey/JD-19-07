package sgolovenchik.Lesson4;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        char[] textArray = text.toCharArray();
        char[] alphabet = new char[26]; //создаю массив с символами алфавита
        //26 букв (только нижний регистр)
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (97 + i);
        } //наполняю массив номерами Unicode англ. алфавита, нижний регистр

        for (int k = 0; k < alphabet.length; k++) {
            for (int j = 0; j < textArray.length; j++) {
                if (textArray[j] == alphabet[k]) {
                    System.out.print(alphabet[k]); break;
                }
            }
        }
    }
}
