package rashkevich.lesson2;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args){
        System.out.println("Введите любое целое положительное число:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Cумма:"+sum);
    }
}
