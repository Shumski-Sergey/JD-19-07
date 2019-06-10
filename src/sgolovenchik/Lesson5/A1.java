package sgolovenchik.Lesson5;

//много "лишних" выводов на экран для наглядности процесса работы программы
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
        System.out.println("Строки ДО сортировки и их длинна:");
        for (int i = 0; i < N; i++) {//массив строк + длинна до сортировки
            System.out.println(S[i]+" "+ S[i].length());}
        //пузырьковая сортировка
        String TEMP; // временная строка для обмена
        for (int j =1; j< N; j++) {

            for (int i = 0; i < N - j; i++) {
                if (S[i].length() > S[i + 1].length()) {
                    TEMP = S[i + 1];
                    S[i + 1] = S[i];
                    S[i] = TEMP;
                }
            }
        }
        System.out.println("Строки ПОСЛЕ сортировки и их длинна:");
        for (int i = 0; i < N; i++) {
            System.out.println(S[i]+ " длинна: "+ S[i].length());

        }
        //соответственно самая короткая и самая длинная: первая  и последняя)
        System.out.println("________________________________________________");
        System.out.println("Самая короткая строка: "+ S[0]+" /длинна строки: "+ S[0].length());
        System.out.println("Самая длинная строка: "+ S[N-1]+" /длинна строки: "+ S[N-1].length());
    }
}

