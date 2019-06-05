package ezhalabkevich.L3;
import java.util.Random;
import java.util.Scanner;



public class Deal {


    public static void main(String[] args) {



        String[] deckOfcards = {
                "5 diamonds", "5 hearts", "5 spades", "5 clubs","4 diamonds", "4 hearts", "4 spades", "4 clubs",
                "3 diamonds", "3 hearts", "3 spades", "3 clubs","2 diamonds", "2 hearts", "2 spades", "2 clubs",
                "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds", "jack diamonds", "queen diamonds", "king diamonds", "ace diamonds",
                "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "jack hearts", "queen hearts", "king hearts", "ace hearts",
                "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "jack spades", "queen spades", "king spades", "ace spades",
                "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "jack clubs", "queen clubs", "king clubs", "ace clubs"};

      /*  Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
      Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды.
      Разделяйте пять карт, выданных каждому игроку, пустой строкой.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество игроков ");
       // int n = sc.nextInt();
    int    n=5; //если ввод не получится
        int index=deckOfcards.length;

        //хватит ли карт на игроков, причем на столе должно быть 5 карт
        if (deckOfcards.length-5>=n*5){
        shuffleArray(deckOfcards);
        for(int i=0;i<n;i++){
            System.out.println("Игрок "+(i+1)+" :");
            for (int j=0;j<5;j++){
                System.out.print(" "+deckOfcards[index-1]+" ");
                index-=1;

            }
            System.out.println();
        }
        }else System.out.println("Количество игроков превышает кол-во карт!");

    }
    static void shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);   //тусуем карты
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
//