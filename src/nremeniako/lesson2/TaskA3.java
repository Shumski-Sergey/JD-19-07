package nremeniako.lesson2;

public class TaskA3 {
    public  static void main(String args []){

        int a = 4;
        int b = 6;
        int c = 8;
        int x;

        if (a > b|| a> b) {

            x = a;
        }

        if (b > c){

            x = b; b = c; c = x;
        }

        System.out.println("Возрастающая последовательность: " + a  + " " + b + " " + c);
    }}