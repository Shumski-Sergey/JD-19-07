package dkuleshov;

public class Lesson36 {
    public static void main (String [] args) {
        for (int a = -166, i = 0; a <100; a = 2 * a + 200, i ++) {
            if (a> -100 && (a <-9 || a> 9))
                System.out.print (a + "");
        }
    }
}
