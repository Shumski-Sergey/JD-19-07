package rashkevich.lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//5. Ввести n слов с консоли. Найти количество слов, содержащих только
// символы латинского алфавита, а среди них – количество слов
// с равным числом гласных и согласных букв.


public class Task5 {

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



    public static String[] latinChar(String[] string){
        for (int i=0;i<string.length;i++){
            string[i]=string[i].toLowerCase();
        }
        String regex="([0-9]+)|([а-я]+)"; //if string has unexceptable chars input "-"
        for (int i=0;i<string.length;i++){
            Pattern p=Pattern.compile(regex);
            Matcher m=p.matcher(string[i]);
            if (m.find()){
                string[i]="-";
            }
        }
        int countWord=0;//find word number
        for (int i=0;i<string.length;i++){
            if(string[i]!="-"){
                countWord++;
            }
        }

        //create word array
        String word[]=new String[countWord];
        countWord=0;
        for (int i=0;i<string.length;i++){
            if(string[i]!="-"){
                word[countWord]=string[i];
                countWord++;
            }
        }
        char vowel[]={'a', 'e', 'i', 'o', 'u'};
        char consonant[]={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
                'y', 'z'};

        for (int i=0;i<word.length;i++){
            char ch[]=word[i].toCharArray(); //word in char array
            int countVowel=0;
            int countConsonant=0;
            for (int j=0;j<ch.length;j++){
                for (int k=0;k<vowel.length;k++){ //find vowels in word char array
                    if (ch[j]==vowel[k]){
                        countVowel++;
                    }
                }
                for (int k=0;k<consonant.length;k++){ //find consonants in word char array
                    if (ch[j]==consonant[k]){
                        countConsonant++;
                    }
                }
            }
            if(countConsonant==countVowel){
                System.out.println("The word has only latin alphabet chars and consonant number equals vowel:"+word[i]);
            }
        }

        return string;
    }




//    public static void printMatrix(String string[]){
//        for (int i=0;i<string.length;i++){
//            System.out.println(string[i]);
//        }
//    }


    public static void main(String[] args){
        String string[]=input();
        String latinWords[]=latinChar(string);
//        printMatrix(string);
    }
}
