package Romanovskaya.Lesson3;
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {
        int cardsPerPlayers = 5;
        int players = 0;
        String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int n = suits.length * rank.length;
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков:" + " ");

            players = sc.nextInt();
            if (cardsPerPlayers * players <= n) {
                break;
            } else {
                if (players == 0) {
                    System.out.println("Игра закончена");
                    break;
                } else if (players < 0) {
                    System.out.println(" Число игроков не может быть меньше 0");
                } else {
                    System.out.println("Слишком много игроков");
                }
            }
        }
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < players * cardsPerPlayers; i++) {
            System.out.print(deck[i] + " ");
            if (i % cardsPerPlayers == cardsPerPlayers - 1) ;
            System.out.print( " ");
        }
    }
}
