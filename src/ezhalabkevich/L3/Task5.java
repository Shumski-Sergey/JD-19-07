package ezhalabkevich.L3;

public class Task5 {
    public static void main(String[] args) {
        //Task 5
        System.out.println();
       int a=2;
        int d=15; // шаг
        int rez=0; int n=3;
        while (rez<10000){

            System.out.print(" "+rez);
            rez=2*(a+d*(n-2))-1;       //результат выводится по формуле н-ого члена арифметической прогрессии
            n++;


        }
    }
}
