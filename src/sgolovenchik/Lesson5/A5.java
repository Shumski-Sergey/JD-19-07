package sgolovenchik.Lesson5;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько слов будем вводить? ");
        int N = in.nextInt();
        String[] S = new String[N]; //создаём массив с числом слов N
        for (int i = 0; i < N; i++) { //наполняем массив
            System.out.println("Слово " + (i + 1) + ": ");
            Scanner in2 = new
                    Scanner(System.in);
            S[i] = in2.nextLine();
        }
        String consonants = "bcdfghjklmnpqrstvwxzBCDFJHJKLMNPQRSTVWXZ";
        String volwels = "aeiouyAEIOUY";
        String AllLetters = consonants + volwels;

        boolean[] words = new boolean[N]; //массив проверки слов (подходит/не подходит)
        String Symb;
        int num = N;
        for (int j = 0; j < N; j++) {
            words[j] = true;
            for (int i = 0; i < S[j].length(); i++) {
                Symb = String.valueOf(S[j].charAt(i));//берём символ номер i в слове S[j]
                if (!AllLetters.contains(Symb)) {     //проверяем на !отсутствие в AllLetters
                    words[j] = false;             //если отсутствие символа --> слово номер j не подходит
                    num = num - 1;                //размер матрицы отфильтрованных слов уменьшаем
                    break;                //дальше проверять нет смысла , выходим из цикла для этого слова
                }
            }
        }
        String[] S2 = new String[num]; //создаём массив для отфильтрованных слов
        int num2 = 0;                  //переменная количества отфильтрованных слов
        System.out.println("Слова только из латинских символов:");
        for (int k = 0; k < N; k++) {
            if (words[k] == true) {
                S2[num2] = S[k];
                num2++;
                System.out.println(num2 + " : " + S[k]);
            }
        }
        // следующий фильтр слов на равное количество гласных и согласных
        System.out.println("Из них с одинаковым количеством гласных и согласных: ");
        String Symb2;
        int num3 = 0;
        for (int i = 0; i < num2; i++) {
            int numvolwels = 0;
            for (int j = 0; j < S2[i].length(); j++) {     //считаем гласные (их меньше) ;)
                Symb2 = String.valueOf(S2[i].charAt(j));
                if (volwels.contains(Symb2)) {
                    numvolwels++;                         //счётчик количества гласных
                }
            }
            if (numvolwels == S2[i].length() - numvolwels) { //если длинна слова минус количесво гласных
                num3++;                                      //равно количеству гласных --> слово подходит
                System.out.println(num3 + " : " + S2[i]);
            }
        }
        if (num3 == 0) {
            System.out.println("Таких слов нет.(");
        }
    }
}

