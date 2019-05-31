package tolifer;

import java.util.Scanner;

public class zad3 {
    public static void main (String [] args){
        int a;
        int b;
        int c;
        int d =0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a<b&&a<c&&b>a&&b<c){
            a=a;
            b=b;
            c=c;
        }else if(b<a&&b<c&&a>b&&a<c){
            d=a;
            a=b;
            b=d;
            c=c;
        }else if(c<a&&c<b&&a>b&&a>c) {
            d=a;
            a = c;
            b = b;
            c = d;
        }else{
            d=a;
            a=b;
            b=c;
            c=d;
        }



        System.out.println( a + "   "+ b + "   "+ c);
    }
}
