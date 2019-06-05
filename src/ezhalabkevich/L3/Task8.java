package ezhalabkevich.L3;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        // Task 8
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите число ");
        int numDel=sc.nextInt();
        System.out.println("Делители числа "+numDel);
        for (int i=1;i<=numDel;i++){
            if(numDel%i==0) System.out.print(" "+i);
        }
    }
}
