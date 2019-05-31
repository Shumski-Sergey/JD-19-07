package rashkevich;

public class TaskB1 {
    public static void main(String[] args){
        int m=5;
        int n=155;
        int a=25;
        int b=100;
        double random=Math.random()*(-m+n)+m;
        System.out.println(random+" from["+m+";"+n+"]");
        if ((a<=random)&&(random<=b)){
        System.out.println("in section["+a+";"+b+"]");

        }
    }
}
