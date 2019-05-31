package tolifer;

import java.util.Scanner;

public class zadB3 {
    public  static void main (String [] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int sum=0;
        for(int b=1; b<=a; b++){
            sum = sum+b;
        }
        System.out.println(sum);
    }
}
