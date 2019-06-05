package inikalayeva.Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {

        String[] deckOfcards = new String[]{"2 diamonds", "3 diamonds", "4 diamonds", "5 diamonds", "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds", "jack diamonds", "queen diamonds", "king diamonds", "ace diamonds", "2 hearts", "3 hearts", "4 hearts", "5 hearts", "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "jack hearts", "queen hearts", "king hearts", "ace hearts", "2 spades", "3 spades", "4 spades", "5 spades", "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "jack spades", "queen spades", "king spades", "ace spades", "2 clubs", "3 clubs", "4 clubs", "5 clubs", "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "jack clubs", "queen clubs", "king clubs", "ace clubs"
        };
        ArrayList<String> deck = new ArrayList<String>(Arrays.asList(deckOfcards));
        System.out.println("How many players?");
        Scanner sc = new Scanner(System.in);
        int numberOfPlayers = sc.nextInt();
        if (numberOfPlayers > 10){
            System.out.println("Too many. Must be ten or less.");
        }
        else{
            System.out.println("Ok, let's start.");
            for (int i = 1; i <= numberOfPlayers; i++){
                System.out.print("Cards of " + i + " player: ");
                for (int j = 0; j < 5; j++) {
                    Random random = new Random();
                    int numberOfCard = random.nextInt(deck.size() - 1);
                    System.out.print(deck.get(numberOfCard) + " ");
                    deck.remove(numberOfCard);

                }
                System.out.println(" ");
            }
        }




    }
}
