package rashkevich.lesson3;

public class Task5 {
    public static void main(String[] args){
        double a=2; int n=1;
        double member=2*a-1;;
        System.out.println(member);

        while(member<10000){
            member=2*member-1;
            if(member<10000){
                System.out.println(member);
           }

        }
    }
}
