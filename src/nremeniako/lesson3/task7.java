package nremeniako.lesson3;

import java.util.Scanner;

public class task7 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int a = scanner.nextInt();

        for(int i=a;i>0;i--){
            int b=a%i;
            if(b==0)
                System.out.print(i+" ");
        } } }