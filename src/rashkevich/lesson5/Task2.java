package rashkevich.lesson5;
//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
import java.util.Scanner;

public class Task2 {
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

        sortUprisingString(string);
        printMatrix(string);
    }

    public static void sortUprisingString(String[] string){
        int maxInd=0;
        String temp=string[0];
        for (int i=0;i<string.length;i++){
            for (int j=0;j<string.length;j++){
                if (string[i].length()<string[j].length()){
                    temp=string[i];
                    string[i]=string[j];
                    string[j]=temp;
                }
            }
        }
    }

    public static void printMatrix(String string[]){
        for (int i=0;i<string.length;i++){
            System.out.println(string[i]+" "+string[i].length());
        }
    }


}
