package rashkevich.lesson3;

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args){
        String card[]={"2c","2b","2t","2p","3c","3b","3t","3p","4c","4b","4t","4p","5c","5b","5t","5p","6c","6b","6t","6p","7c","7b","7t","7p","8c","8b","8t","8p","9c","9b","9t","9p"};
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++){

            Random random=new Random();
            int index=random.nextInt(7)+2;


        }

    }
}
