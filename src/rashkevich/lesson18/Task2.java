package rashkevich.lesson18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String [] args){
        String str="(3*+*5)*-*9*x*4.";
        String str2="((3*+*5)*-*9*x*4.";

        Pattern p=Pattern.compile("['(']");
        Matcher m=p.matcher(str2);
        int counterFirst=0;
        while(m.find()){
            System.out.println(m.group());
            counterFirst++;
        }
        Pattern p2=Pattern.compile("[')']");
        Matcher m2=p2.matcher(str2);
        int counterSecond=0;
        while(m2.find()){
            System.out.println(m2.group());
            counterSecond++;//System.out.println(counterSecond);
        }
        if(counterFirst==counterSecond){
            System.out.println(str2+" is a right expression");
        } else {
            System.out.println(str2+" is NOT a right expression");
        }
    }
}
