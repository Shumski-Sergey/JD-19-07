package rashkevich.lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//8. Ввести n слов с консоли. Среди слов, состоящих только из цифр,
// найти слово-палиндром.
//Если таких слов больше одного, найти второе из них.


public class Task8 {

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


    public static String[] findPalindrom(String[] string){
        for (int i=0;i<string.length;i++){
            char ch[]=string[i].toCharArray();
            for (int j=0;j<ch.length;j++){
                if ((ch[j]>'9')||(ch[j]<'0')){
                    string[i]="-";
                }
            }
        }

        for (int j=0;j<string.length;j++){
            if (string[j]!="-"){
                char ch[]=string[j].toCharArray();
                for (int k=0;k<ch.length;k++){
                    if (ch[k]!=ch[ch.length-k-1]){
                        string[j]="-";
                    }
                }
            }
        }

        int countPolindrom=0;
        for (int i=0;i<string.length;i++){
            if (string[i]!="-"){
                countPolindrom++;
            }
        }
        String palindrom[]=new String[countPolindrom];
        countPolindrom=0;
        for (int i=0;i<string.length;i++){
            if (string[i]!="-"){
                palindrom[countPolindrom]=string[i];
                countPolindrom++;
            }
        }
        //find palindrom to print
        if (palindrom.length>1){
            System.out.println("The second palindrom: "+palindrom[1]);
        }
        if (palindrom.length==1){
            System.out.println("Only one palindrom has been found: "+palindrom[0]);
        }
        if (palindrom.length==0){
            System.out.println("Palindroms have not been found.");
        }

        return palindrom;
    }


    public static void main(String[] args){
        String string[]=input();
        findPalindrom(string);

    }
}
