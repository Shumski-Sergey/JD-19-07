package dkuleshov;

public class a1 {
        public static void main(String[] args){
            double m=8.5;
            double n=11.45;
            int i=10;
            if ((Math.abs(i-m))>(Math.abs(i-n))){
                System.out.println(n);
            } else {
                System.out.println(m);
            }
        }
    }