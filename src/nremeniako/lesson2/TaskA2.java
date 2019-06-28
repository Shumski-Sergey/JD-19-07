package nremeniako.lesson2;

public class TaskA2 {

    public static void main(String args[]){

        double a = 10;
        double b = 145;
        double c =16;
        double d =0;

        d=b*b-4*a*c;

        if (d>0 ){
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        if (d==0 ){
            double x1;
            x1=-b/ (2*a);
            System.out.println("Корни уравнения: x1 = " + x1 );
        }
        if (d<0 ){
            System.out.println("Уровнения корней не  имеет)" );
        }}}
