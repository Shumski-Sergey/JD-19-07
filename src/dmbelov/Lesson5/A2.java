package dmbelov.Lesson5;

import java.util.Scanner;

public class A2 {
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
        sortText(str, n);
    }
    private static void sortText(String [] str, int n){
        for(int i = 1; i<n; i++) {
            for (int j = str.length-1; j>=i; j--) {
                if(str[j].length()<str[j-1].length()){
                    String t = str[j];
                    str[j] = str[j-1];
                    str[j-1] = t;
                }
            }
        }
        output(str);
    }
    private static void output(String [] str){
        for (String x:str) {
            System.out.print(x+" /");
        }
    }
}