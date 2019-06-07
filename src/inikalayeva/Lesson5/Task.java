package inikalayeva.Lesson5;

public class Task {
    static void toReverse(int i, int halfSize, char[] textToChar){
        if (i < halfSize) {
            char wc = textToChar[i];
            textToChar[i] = textToChar[textToChar.length - 1 - i];
            textToChar[textToChar.length - 1 - i] = wc;
            i++;
            toReverse(i, halfSize, textToChar);
        }
        else {
            return;
        }
    }
    public static void main(String[] args){
        String text = "Some words for this task";
        char[] textToChar = text.toCharArray();
        int halfSize = textToChar.length/2;
        int i = 0;
        toReverse(i, halfSize, textToChar);
        for (int j = 0; j < textToChar.length; j++){
            System.out.print(textToChar[j]);
        }
    }



}
