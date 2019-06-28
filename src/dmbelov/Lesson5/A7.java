package dmbelov.Lesson5;

/* 7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них.*/

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        System.out.print("Enter a number of words: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] words = new String[n];
        wordsIn(words, n);
    }
    private static void wordsIn(String [] words, int n){
        for(int i=0; i<words.length; i++){
            System.out.print("Enter word # "+(i+1)+" ");
            Scanner scanner = new Scanner(System.in);
            words[i] = scanner.nextLine();
        }
        wordsToChar(words,n);
    }
    //Преобразовываю циклом каждое слово в массив символов
    private static void wordsToChar(String[] words, int n){
        boolean compareResult;
        int indexWord = 0;
        char [] characters;
        for (String word : words) {
            characters = word.toCharArray();
            compareResult = compareCharsInWord(characters);
            if (compareResult) {
                System.out.print("The word is: " + word);
                break;
            }
            indexWord++; // счетчик для НЕподходящих слов
        }
        // сверяю счетчик с общим количеством слов
        if(indexWord==n){
            System.out.print("There is no word that matches");
        }

    }
    // Двойным циклом сравниваю букву с остальными буквами
    private static boolean compareCharsInWord(char [] characters) {
        for (int i=0; i<characters.length - 1; i++) {
            for (int j=(i+1); j<characters.length; j++) {
                if (characters[i] == characters[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

