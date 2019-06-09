package dmbelov.Lesson5;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
       System.out.print("Enter number of sentences: ");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       text(n);
    }

    private static void text (int n) {
        String [] str = new String[n];
        for (int i=0; i<n; i++) {
            System.out.print("Enter text # "+(i+1)+" ");
            Scanner scanner = new Scanner(System.in);
            str [i] = scanner.nextLine();
        }
        minMax(str, n);
    }

    private static void minMax (String [] str, int n) {

        int min, max, indexMin, indexMax;
        min = max = str[0].length();
        indexMin = indexMax = 0;

        for(int i=0; i<n; i++){
            if(min>str[i].length()){
                min=str[i].length();
                indexMin = i;
            }
            if(max<str[i].length()){
                max=str[i].length();
                indexMax = i;
            }
        }
        System.out.println("The shortest text is "+ "\""+str[indexMin]+"\"" + ". And its length is " + min);
        System.out.println("The longest text is "+ "\""+str[indexMax]+"\"" + ". And its length is " + max);
    }
}
