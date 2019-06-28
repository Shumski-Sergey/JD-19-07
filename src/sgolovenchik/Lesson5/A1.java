package sgolovenchik.Lesson5;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько строк будем вводить? ");
        int N = in.nextInt();
        System.out.println(N);
        String[] S = new String[N]; //создаём массив с числом строк N
        for (int i = 0; i < N; i++) { //наполняем массив строками
            System.out.println("Строка " + (i + 1) + " : ");
            Scanner in2 = new
                    Scanner(System.in);
            S[i] = in2.nextLine();
        }
        System.out.println("Строки массива и их длина:");
        for (int i = 0; i < N; i++) {
            System.out.println(S[i]+" "+ S[i].length());}

        String min = S[0] ; //находим минимальную и максимальную длину строки
        String max = S[0] ;
        for (int k = 0; k < N - 1; k++) {
            if ((S[k + 1].length() <= S[k].length()) && S[k + 1].length() < min.length()) {
                min = S[k + 1];
            }
            if ((S[k + 1].length() >= S[k].length()) && S[k + 1].length() > max.length()) {
                max = S[k + 1];
            }
        }
        System.out.println("________________________________________________");
        System.out.println("Самая короткая строка: "+ min +" /длина строки: "+ min.length());
        System.out.println("Самая длинная строка: "+ max +" /длина строки: "+ max.length());
    }
}

