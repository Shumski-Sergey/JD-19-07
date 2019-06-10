package dkuleshov.Lesson4;

public class lesson43 {
    public static void main(String[] args) {
        String sentence = "English tea is hot so far "
                        + "Poked my d*** into the jar ";
        System.out.println("English tea is hot so far - Poked my d*** into the jar");
        sentence = sentence.replaceAll("[!.,:;-]", "");
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for(String word : words) {
            newSentence.append(word.charAt(word.length()-1));
        }
        System.out.println("Первыe буквы представленных слов = "+newSentence);
    }
}
