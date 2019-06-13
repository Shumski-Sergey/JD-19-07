package rashkevich.lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//6. Ввести n слов с консоли. Найти слово, символы в котором идут
// в стро-гом порядке возрастания их кодов. Если таких слов несколько,
// найти первое из них.


public class Task6 {

    public static String[] input(){
        System.out.println("Input string count:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String string[]=new String[n];
        for (int i=0;i<n;i++){
            System.out.println("Input string:");
            Scanner scSecond=new Scanner(System.in);
            String str=scSecond.nextLine();
            string[i]=str;
        }
        return string;
    }
//-------------------------------------------------------------
    public static void findWordSimbolsUprising(String[] string){
        for (int b=0;b<string.length;b++){
            int countWords=0;//word counter for 'abc'
            char chars[]=string[b].toCharArray();
            for (int i=0;i<chars.length;i++){
                char ch=chars[i];
                String str=String.valueOf(ch);
                String regex=str;
                for (int j=i;j<chars.length;j++){
                    if((int)(ch)<'z'){
                        ch=(char)((int)ch+1);
                        regex=regex+ch;

                        Pattern p=Pattern.compile(regex);
                        Matcher m=p.matcher(string[b]);

                        if(m.find()){
                            if (m.group().length()==string[b].length()){
                                countWords++;
                                if (countWords==1){
                                    System.out.println(string[b]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

//-------------------------------------------------------------
    public static void main(String[] args){
        String string[]=input();
        findWordSimbolsUprising(string);
    }
}
