package lpojarov.L5;

import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        double a, b, c;
        double D;
        System.out.print("Введите a,b,c");
        Scanner in =new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        D=b*b-4*a*c;
        if(D>0){
            double x1,x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.print("корни уровнения х1="+x1+" и х2="+x2 );

        }
        else if (D==0){
            double x;
            x = -b / (2 * a);
            System.out.print("Уравнение имеет один корень"+x);

        }
           else{
            System.out.print("Уравнение не имеет решения");
        }
    }

}
