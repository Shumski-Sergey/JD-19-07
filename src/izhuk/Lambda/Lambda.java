package src.izhuk.Lambda;

import java.util.function.BiFunction;

public class Lambda {
    public static void main(String args[]) {
        double summ = calculate((x,y) -> x+y, 10.0, 20.0);
        double minus = calculate((x,y) -> x-y, 10.0, 20.0);
        double mult = calculate((x,y) -> x*y, 10.0, 20.0);
        double division = calculate((x,y) -> x/y, 10.0, 20.0);
        double exponentiation = calculate((x,y) -> Math.pow(x,y), 3.0, 3.0);
        double square_root = calculate((x,y) -> Math.sqrt(x) * y, 9.0, 1.0);
        double wtf = calculate((x,y) -> ((Math.pow(x+y,y))/x)+117.0, 9.0, 2.0);

        System.out.println(summ);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(division);
        System.out.println(exponentiation);
        System.out.println(square_root);
        System.out.println(wtf);

    }

    public static double calculate(BiFunction<Double,Double,Double> bf, double x, double y){
        return bf.apply(x,y);
    }
}

