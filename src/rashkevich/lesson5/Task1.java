package rashkevich.lesson5;

import java.util.Scanner;
//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
public class Task1 {
    public static void main(String[] args){
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

        findMaxString(string);
        findMinString(string);
    }

    public static void findMaxString(String[] string){
        int maxInd=0;
        for (int i=1;i<string.length;i++){
            if (string[maxInd].length()<string[i].length()){
                maxInd=i;
            }
        }
        System.out.println("The biggest string:"+string[maxInd]+" length:"+string[maxInd].length());
    }

    public static void findMinString(String[] string){
        int minInd=0;
        for (int i=1;i<string.length;i++){
            if (string[minInd].length()>string[i].length()){
                minInd=i;
            }
        }
        System.out.println("The smallest string:"+string[minInd]+" length:"+string[minInd].length());
    }
}
