package rashkevich.lesson3;

public class TaskB1 {
    public static void main(String[] args){
        int i=20023143;
        int num;
        String str=""+i;
        String strNum="";
        System.out.println(str);
        int length=str.length();
        while(i>0){

            num=i%1000;
            strNum=""+num;
            if ()
            str=num+" "+str;
            //System.out.println(num);
            i=i/1000;
        }
        System.out.println(str);
    }
}
