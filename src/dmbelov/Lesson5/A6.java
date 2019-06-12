package dmbelov.Lesson5;

/*6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
        Если таких слов несколько, найти первое из них.*/

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        System.out.print("Enter a number of words: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] words = new String[n];
        wordsIn(words);
    }
    private static void wordsIn(String [] words){
        for(int i=0; i<words.length; i++){
            System.out.print("Enter word # "+(i+1)+" ");
            Scanner scanner = new Scanner(System.in);
            words[i] = scanner.nextLine();
        }
        wordsToChar(words);
    }
    private static void wordsToChar(String[] words){
        char [] characters;
        int countCharacters;
        int indexWord = -1;
        done:
        for(int i=0; i<words.length; i++){
            characters = words[i].toCharArray();
            countCharacters = 1;
            for(int j=0; j<characters.length-1; j++){
                if(characters[j]<characters[j+1]){
                    countCharacters++;
                    if(countCharacters==characters.length){
                        indexWord=i;
                        System.out.print("The word is "+ "\""+words[indexWord]+"\"");
                        break done;
                    }
                }
                else {
                    break;
                }
            }
        }
        if(indexWord==-1) {
            System.out.print("There is no word that matches");
        }
    }
}
