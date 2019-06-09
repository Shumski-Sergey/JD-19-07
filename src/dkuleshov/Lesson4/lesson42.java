package dkuleshov.Lesson4;

public class lesson42 {
    public static void main (String[] args){
        String text = "Would you like cup of kvas?";
        System.out.println(("Would you like cup of kvas?"));
        int number = text.split(" ").length;
        System.out.println("слов в представленном предложении = "+number);
    }
}
