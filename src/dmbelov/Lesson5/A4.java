package dmbelov.Lesson5;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        System.out.print("Enter number of words: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        text(n);
    }
    private static void text (int n) {
        String [] str = new String[n];
        for (int i=0; i<n; i++) {
            System.out.print("Enter word # "+(i+1)+" ");
            Scanner scanner = new Scanner(System.in);
            str [i] = scanner.nextLine();
        }
        wordToChar(str, n);
    }
    private static void wordToChar(String[] str, int n){
        int sumChars;
        char [] chars;
        int [] sumCharsList = new int[n];
        for (int i=0; i<n; i++) {
            chars = str[i].toCharArray();
            sumChars=checkChars(chars);
            sumCharsList[i] = sumChars;
        }
        findMinAndOutput(sumCharsList, str);
    }
    private static int checkChars(char[] chars){
        int sumChars=0;
        for (int i=0; i<chars.length; i++){
            for (int j=i+1; j<chars.length; j++){
                if (chars[i]==chars[j]){
                    chars[j] = ' ';
                }
            }
        }
        for (char aChar : chars) {
            if (aChar != ' ') {
                sumChars++;
            }
        }
        return sumChars;
    }
    private static void findMinAndOutput(int [] sumCharsList, String [] str){
        int min, indexMin;
        min = sumCharsList[0];
        indexMin = 0;
        for (int j=0; j<sumCharsList.length; j++){
            if (min>sumCharsList[j]){
                min = sumCharsList[j];
                indexMin = j;
            }
        }
        System.out.print(str[indexMin]);
    }
}

