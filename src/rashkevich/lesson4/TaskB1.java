package rashkevich.lesson4;

import java.util.Date;

public class TaskB1 {
    public static void main(String[] args){
        String str="test";
        Date date1=new Date();
        for (int i=0;i<10000;i++){
            str=str+"test";
        }
        Date date2=new Date();
        long firstVelocity=date2.getTime()-date1.getTime();

        Date date3=new Date();
        String str2="test";
        StringBuilder sb=new StringBuilder(str2);
        for (int i=0;i<10000;i++){
            sb.append(str2);
        }
        Date date4=new Date();
        long secondVelocity=date4.getTime()-date3.getTime();
        System.out.println(firstVelocity);
        System.out.println(secondVelocity);
    }
}
