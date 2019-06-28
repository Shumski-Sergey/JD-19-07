package dmbelov.Lesson3;

import java.util.*;

public class Deal {
    public static void main(String[] args) {
// ♣ ♠ ♥ ♦
        System.out.print("Введите количество игроков: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();
        int i,j;

        // Создал карты конкретных мастей
        String [] spades = {"2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠","J♠","Q♠","K♠","A♠"};
        String [] clubs = {"2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣","J♣","Q♣","K♣","A♣"};
        String [] hearts = {"2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥","J♥","Q♥","K♥","A♥"};
        String [] diamonds = {"2♦","3♦","4♦","5♦","6♦","7♦","8♦","9♦","10♦","J♦","Q♦","K♦","A♦"};

        // Скопировал все карты в колоду
        String [] deckOfCards = new String [52];
        System.arraycopy(spades,0,deckOfCards,0,13);
        System.arraycopy(clubs,0,deckOfCards,13,13);
        System.arraycopy(hearts,0,deckOfCards,26,13);
        System.arraycopy(diamonds,0,deckOfCards,39,13);

        //Тасую колоду случайное количество раз
        int shuffle = (int) (Math.random() * 21) + 100;
        for (i = 0; i <= shuffle; i++) {
            int randomCard1 = (int) (Math.random() * 52);
            int randomCard2 = (int) (Math.random() * 52);
            String temp = deckOfCards[randomCard1];
            deckOfCards[randomCard1] = deckOfCards[randomCard2];
            deckOfCards[randomCard2] = temp;
        }

        //Раздача по 5 карт каждому игроку
        int numberOfGivenCards = 0; // Счетчик роздынных карт
        int numberOfGivenCardsToOnePlayer=0; // Счетчик розданных карт одному игроку
        for(i=1;i<=numberOfPlayers;i++) {
            numberOfGivenCardsToOnePlayer = 0;
            System.out.println("\n");
            for(j=numberOfGivenCards;numberOfGivenCardsToOnePlayer<5;j++){
                System.out.print(deckOfCards[j]);
                numberOfGivenCardsToOnePlayer++;
                numberOfGivenCards++;
            }
        }
    }
}