package nremeniako.lesson2;

public class TaskA3_2 {
    public  static void main(String args []){
        int a=3;
        int b=4;
        int c=5;


        if(a<b&a<c){
            if(b<c)System.out.println("Возрастающая последовательность "+a+" "+b+" "+c);
            else System.out.println("Возрастающая последовательность "+a+" "+c+" "+b);
        }
        if(b<a&b<c){
            if(a<c)System.out.println("Возрастающая последовательность "+b+" "+a+" "+c);
            else System.out.println("Возрастающая последовательность "+b+" "+c+" "+a);
        }
        if(c<a&c<b){
            if(a<b)System.out.println("Возрастающая последовательность "+c+" "+a+" "+b);
            else System.out.println("Возрастающая последовательность "+c+" "+b+" "+a);
        }
    }
}