package nremeniako.lesson2;

public class TaskA1correct {
    public static void main(String args[]){

        double n=8.5;
        double m=11.45;
        int a=10;
        double b=Math.abs(a-n);
        double d=Math.abs(a-m);

        if(b>d){
            System.out.println("Число "+m+" ближе к 10");
        }
        if (b<d) {
            System.out.println("Число "+n+" ближе к 10");
        }
    }

}