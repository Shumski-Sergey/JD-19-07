package rashkevich;

public class TaskA2 {
    public static void main(String[] args){
        double a=1;
        double b=8;
        double c=6;
        double d=b*b-4*a*c;
        if (d<0){
            System.out.println("Уравнение не имеет корней");
        } else if (d==0){
            double x0=-b/(2*a);
            System.out.println(x0);
        } else if(d>0){
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
