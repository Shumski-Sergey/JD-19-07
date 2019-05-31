package lpojarov;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        int a, b, c;

        System.out.print("Введите a,b,c");
        Scanner in =new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if (a>b&&b<c){
            System.out.print(a+" "+c+" "+b);
        }

    }
}
