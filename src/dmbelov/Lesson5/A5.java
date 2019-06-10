package dmbelov.Lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A5 {

    public static void main(String[] args) {
        System.out.print("Please, enter a number of words: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        text(n);
    }
    private static void text(int n) {
        String [] words = new String[n];
        for(int i=0; i<n; i++){
            System.out.print("Please, enter word # "+(i+1)+" ");
            Scanner scanner = new Scanner(System.in);
            words[i] = scanner.nextLine();
        }
        latinWords(words);
    }
    private static void latinWords (String[] words){
        Pattern pattern = Pattern.compile("^([a-zA-Z]+)$");
        Matcher matcher;
        for (int i=0; i<words.length; i++) {
            matcher = pattern.matcher(words[i]);
            if (!matcher.find()) {
                words[i] = "!";
            }
        }
        vowelsConsonants(words);
    }
    private static void vowelsConsonants(String [] words) {
        Pattern patternVowels = Pattern.compile("[aeiouAEIOU]");
        Matcher matcherVowels;
        Pattern patternConsonants = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
        Matcher matcherConsonants;
        int vowelsCounter, consonantsCounter;
        for (int i=0; i<words.length; i++) {
            matcherVowels = patternVowels.matcher(words[i]);
            matcherConsonants = patternConsonants.matcher(words[i]);
            vowelsCounter = consonantsCounter = 0;
            while (matcherVowels.find()) {
                vowelsCounter++;
            }
            while (matcherConsonants.find()) {
                consonantsCounter++;
            }
            if(vowelsCounter!=consonantsCounter){
                words[i] = "!";
            }
        }
        result(words);
    }
    private static void result(String[] words){
        for(String s: words){
            if(s.equals("!")) {
                continue;
            }
            System.out.print(s+" ");
        }
    }
}
