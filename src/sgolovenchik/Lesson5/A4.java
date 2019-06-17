package sgolovenchik.Lesson5;

import java.util.Scanner;

public class A4 {
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
        int[] NumSymb = new int[N];        //массив для количества разных символов в каждом слове

        for (int j = 0; j < N; j++) {
            StringBuilder AllSymb = new StringBuilder();
            String Symb;                                //основной блок программы:
            for (int k = 0; k < S[j].length(); k++) {   //проверка поочерёдно каждого символа слова
                Symb = String.valueOf(S[j].charAt(k));  //на повторение
                if (AllSymb.indexOf(Symb) == -1) {      //если символ не повторяется (результат -1)
                    AllSymb.append(Symb);               //добавляем в AllSymb слова
                }
            }
            NumSymb[j] = AllSymb.length();              //наполнение массива количеством разных символов
        }
        for (int i = 0; i < N; i++) {                   //вывод на консоль для информативности
            System.out.println("В слове " + (i+1) + ": /" +S[i]+ "/ Длинна : "+S[i].length()+" / Различных символов: "+NumSymb[i]);
        }
        String MinSymbWords = S[0];
        int min = NumSymb[0];
        for (int j = 0; j < N ;j++){   //поиск первого минимального числа в массиве
            if ( NumSymb[j] < min ) {
                min = NumSymb[j];
                MinSymbWords = S[j];
            }
        }
        System.out.println("__________________________________________________________");
        System.out.println("Минимальное количество символов: " +min );
        System.out.println("Первое слово с минимальным количеством символов: " + MinSymbWords);
    }
}








