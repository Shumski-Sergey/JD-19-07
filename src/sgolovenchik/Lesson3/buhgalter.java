package sgolovenchik.Lesson3;

import java.util.Scanner;

public class buhgalter {
    public static void main(String[] args) {
        Scanner in = new

                Scanner(System.in);
        System.out.print("Введите положительное многозначное целое число: ");
        int N = in.nextInt();
        System.out.println(N);
        //определим разрядность введённого числа (количество цифр)
        int A = N;
        int R = 1;
        while (A >= 10) { A = A / 10; R++; } //счётчик
        System.out.println("в числе " + R + " цифр(ы)");

        int C = R / 3  ; //длинну массива для  "троек цифр" определяем по количеству цифр числа
        if ( R % 3 != 0 ) { C= C+1; }//если есть остаток, добавим одну ячейку для неполной "тройки"
        System.out.println("Длинна массива: " +C);

        int[] buh = new int[C] ;
        int temp = C;
        while ( temp > 0 ) {buh[temp-1] = N % 1000; N = N / 1000 ; temp--;} //наполняем массив

        while ( temp < C ) {System.out.print(buh[temp]+" "); temp++;} //выводим массив !!!через пробел

    }
}