package izhuk.Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesson2A2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        double d = (b*b)-(4*a*c);
        double e = 0;
        double f = 0;
        if(d==0){
            e =-1*(b/(2*a));
            System.out.println("В уравнении один квадратный корень: "+ e);
        }
        else {
            if(d>0){
                e=((-1*b)+(float)Math.sqrt(d))/(2*a);
                f=((-1*b)-(float)Math.sqrt(d))/(2*a);
                System.out.println("В уравнении два квадратных корня: "+ e +" и " + f);
            }
            else {
                System.out.println("В уравнении квадратных корней нет.");
            }
        }
    }
}
