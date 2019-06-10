package dmbelov.Lesson5;

import java.util.Scanner;

public class A3 {
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
            averageLength(str);
        }
        private static void averageLength(String [] str) {
            int sum = 0; int average;
            for (String s : str) {
                sum += s.length();
            }
            average = sum / str.length;
            output(str, average);
        }
        private static void output(String [] str, int average){
            for (String s : str) {
                if (s.length() < average) {
                    System.out.print(s + " : " + s.length() + " / ");
                }
            }
        }
}

