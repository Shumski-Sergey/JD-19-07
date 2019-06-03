package rashkevich.lesson3;

public class Task6 {
    public static void main(String[] args){
        double a=-166; int n=1;
        double member=2*a+200;;
        System.out.println(member);

        while(member<=100){
            member=2*member+200;
            if(((member<100)&&(member>9))||((member>-100)&&(member<-9))){
                System.out.println(member);
            }

        }
    }
}
