package rashkevich.lesson3;

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int numCard=0;
        String[] cards=new String[52];

        for (int i=0;i<=51;i++){
            cards[i]=""+0;
        }
                //ввод мастей
        while(numCard<=51){
            for (int i=1;i<=4;i++){

                switch(i){
                    case 1: cards[numCard]="b";
                        break;
                    case 2: cards[numCard]="c";
                        break;
                    case 3: cards[numCard]="+";
                        break;
                    case 4: cards[numCard]="p";
                        break;
                }
                numCard++;
            }
        }
                //ввод наименований
        numCard=0;
        while(numCard<=51){
            for (int i=2;i<=14;i++){

                switch(i){
                    case 11: cards[numCard]=cards[numCard]+"J";
                        break;
                    case 12: cards[numCard]=cards[numCard]+"Q";
                        break;
                    case 13: cards[numCard]=cards[numCard]+"K";
                        break;
                    case 14: cards[numCard]=cards[numCard]+"A";
                        break;
                        default:cards[numCard]=cards[numCard]+i;
                }
                numCard++;
            }
        }

            //вывод колоды
        //for (int i=0;i<=51;i++){
          //  System.out.println(cards[i]);
        //}

        String playersCards[]=new String[(5*n)];

        for (int i=0;i<(5*n);i++){
            do {
                Random random = new Random();
                int indexRandomCard = random.nextInt(51);
                if (cards[indexRandomCard]!="N"){
                    playersCards[i]=cards[indexRandomCard];
                    cards[i]="N";
                }
            } while (cards[i]!="N");
        }
        System.out.println("------------------");

        int counter=1;

        for (int i=0; i<(5*n);i++){

            System.out.print(playersCards[i]);
            if (counter==5){
                System.out.print(" ");
                counter=0;
            }
            counter++;
        }

    }
}
