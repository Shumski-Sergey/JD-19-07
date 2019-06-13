package sgolovenchik.Lesson5;

import java.util.Scanner;

public class A3 {
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
        System.out.println("Строки  и их длина:");
        for (int i = 0; i < N; i++) {//массив строк + длинна
            System.out.println(S[i] + " " + S[i].length());
        }
        double sum = 0; //находим сумму длин всех строк
        for (int k = 0; k < N - 1; k++) {
            sum = sum + S[k].length();}

        double middle = sum / N;
        System.out.println("Средняя длина введённых строк :" +middle);

        System.out.println("Меньше средней длины строки: ");
        for (int i = 0; i < N; i++) {
            if (S[i].length() < middle) {
                System.out.println(S[i] + " " + S[i].length());
            }
        }
        System.out.println("Больше средней длины строки: ");
        for (int i = 0; i < N; i++) {
            if (S[i].length() > middle) {
                System.out.println(S[i] + " " + S[i].length());
            }
        }
    }
}




