package Romanovskaya.Lesson3;

public class TaskA5 {
    public static void main(String[] args) {
        for ( int x = -166, i = 0 ; x<100;i++, x=x*2+200){
            if (x>-200 && x<100)
                System.out.println(x);
        }
    }
}
