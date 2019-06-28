package tolifer;

import java.util.Scanner;

public class zad2 {
    public static void main (String [] args){
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int d;

        d = b*b - 4*a*c;
        if(d>0) {
            double x = Math.sqrt(d);
            //System.out.println(d);
            System.out.println(x);
        }else {
            System.out.println("корней нет");
        }


    }
}
