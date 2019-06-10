package rashkevich.lesson5;
//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
import java.util.Scanner;

public class Task3 {
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

        sortBiggerAverage(string);
        //printMatrix(string);
    }

    public static void sortBiggerAverage(String[] string){
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
        int average=(string[0].length()+string[string.length-1].length())/2;
        System.out.println("average length:"+average);
        for (int i=0;i<string.length;i++){
            if(string[i].length()>average){
                System.out.println(string[i]+" length:"+string[i].length());
            }
        }
    }

//    public static void printMatrix(String string[]){
//        for (int i=0;i<string.length;i++){
//            System.out.println(string[i]+" "+string[i].length());
//        }
//    }


}
