package rbondarovich.l3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deal {

    public static void main(String[] args) {

        String[][] deckOfCards = {
                {"6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds", "jack diamonds", "queen diamonds", "king diamonds", "ace diamonds"},
                {"6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "jack hearts", "queen hearts", "king hearts", "ace hearts"},
                {"6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "jack spades", "queen spades", "king spades", "ace spades"},
                {"6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "jack clubs", "queen clubs", "king clubs", "ace clubs"}
        };
        int[][] cardsAvailability = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1}
        };



//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        int amount = Integer.parseInt(r.readLine());
//        String[] players = new String[amount];
//        for (int i = 0; i < amount; i++) {
//            players[i] = "Player №" + (i + 1);
//        }
//        int a = (int) (Math.random() * 4);
//        int b = (int) (Math.random() * 9);
//        StringBuffer deck = new StringBuffer();
//        for (String x : players) {
//            System.out.print(x + ": ");
//            for (int i = 0; i < 5; i++) {
//
//                while (cardsAvailability[a][b] == 0) {
//                    a = (int) (Math.random() * 4);
//                    b = (int) (Math.random() * 9);
//                }
//                cardsAvailability[a][b] = 0;
//                deck.append(deckOfCards[a][b]).append("; ");
//                System.out.print(deck);
//                deck.setLength(0);
//            }
//            System.out.println();
//        }
        // Проверка на повторные  карты
//        int count = 0;
//        for (int[]x : cardsAvailability) {
//            for (int val: x) {
//                if(val == 0) count++;
//                System.out.print(val+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Cards used: " + count);

    }
}
