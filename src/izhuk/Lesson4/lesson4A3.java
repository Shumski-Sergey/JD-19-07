package src.izhuk.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson4A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();

        sentence = sentence.replaceAll("[!.,:;-]", "");

        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for(String word : words) {
            newSentence.append(word.charAt(word.length()-1));
        }
        System.out.println(sentence);
        System.out.println(newSentence);
    }
}
