package rashkevich.lesson18;

import javax.print.attribute.IntegerSyntax;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args){
        String string="1125.13.0.1"; //1300.6.7.8
        String str[]=string.split("\\.");
        int countUnRightNumbers=0;
        if (str.length==4){
            for (String s:str){
                if (s.matches("[0-9]{1,3}")){
                    Integer i=Integer.parseInt(s); //System.out.println(s);
                    if ((i>255)||(i<0)){
                        countUnRightNumbers++;
                    }
                } else {
                    countUnRightNumbers++;
                }
            }
        } else {
            countUnRightNumbers++;
        }

        if (countUnRightNumbers==0){
            System.out.println(string+" is IP address");
        } else {
            System.out.println(string+" is not IP address");
        }
    }
}
