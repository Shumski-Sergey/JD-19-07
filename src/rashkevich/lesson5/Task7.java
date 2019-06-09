package rashkevich.lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.


public class Task7 {

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
    public static void findWordDifSymbol(String[] string){

        for (int i=0;i< string.length;i++){
            char ch[]=string[i].toCharArray();
            for (int j=1;j<ch.length;j++){
                int counter=0;
                for (int k=j;k<ch.length;k++){
                    if(ch[j-1]==ch[k]){
                        counter++; //the same chars counter
                        string[i]="+";
                    }
                }
            }
        }

        int counterWordDifSymbol=0;
        for (int i=0;i<string.length;i++){
            if (string[i]!="+"){
                counterWordDifSymbol++;
                if (counterWordDifSymbol==1){
                    System.out.println(string[i]);

                }
            }
        }
    }
//-------------------------------------------------------------
    public static void main(String[] args){
        String string[]=input();
        findWordDifSymbol(string);
    }
}
