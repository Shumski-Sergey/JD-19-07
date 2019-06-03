package rashkevich.lesson3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=1;
        for (int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println(result);
    }
}
