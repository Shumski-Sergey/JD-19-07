package lpojarov;


import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        double M,N;

        System.out.println("Ведите 2 числа ");
        Scanner in = new Scanner(System.in);
        M= in.nextDouble();
        N=in.nextDouble();
        double X1=M-10;
        double X2=N-10;
       //Math.abs(X1);
       // Math.abs(X2);
        if(X1>X2) {
            System.out.print( M+ " -это число ближе к 10" );
        }
            else
        {

                System.out.print(N+" -это число ближе к 10");


            }


        }


    }

