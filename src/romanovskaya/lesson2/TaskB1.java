package romanovskaya.lesson2;

public class TaskB1 {
    public static void main(String[] args) {
        int i = (int) (Math.random()*(150+1) + 5);
        System.out.println(i);
        if ( i<25 && i>100) {
            System.out.println("Число не входит в интервал");
        }  else {
                System.out.println("Число входит в интервал");
            }
    }
}
