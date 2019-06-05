package tolifer.L3;

import java.util.Scanner;

public class zad7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x=0;
        int f = 1;
        for(int i=1; i<a+1; i++){
            x=i;
            f=f*i;
        }
        System.out.println(f);
    }
}
