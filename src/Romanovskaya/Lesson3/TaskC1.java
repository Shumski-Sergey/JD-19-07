package Romanovskaya.Lesson3;
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {
        int cardsPerPlayers = 5;
        int players = 0;

        String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int n = suits.length * rank.length;     // все карты всех мастей
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков:" + " ");

            players = sc.nextInt();     //узнаем количество игроков
            if (cardsPerPlayers * players <= n) {
                break;
            } else {
                if (players == 0) {     //не может быть равным 0
                    System.out.println("Игра закончена");
                    break;
                } else if (players < 0) {   // если количество игроков меньше нуля
                    System.out.println(" Число игроков не может быть меньше 0");
                } else {
                    System.out.println("Слишком много игроков");
                }
            }
        }
        String[] deck = new String[n];  //вводим новый массив из всех карт-всех мастей
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        for (int i = 0; i < n; i++) {   //перемешиваем карты в рандомном порядке
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];  //каждая карта в колоде по очереди меняется местами местами с другой картой
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < players * cardsPerPlayers; i++) {   //раздаем карты - выводим полученные значения на экран
            System.out.print(deck[i] + " ");    // каждому игроку по 5 карт
            if (i % cardsPerPlayers == cardsPerPlayers - 1) {
                System.out.println(" ");    //  каждые 5 карт - новая строка
            }
        }
    }
}
