package rashkevich.lesson5;

import java.util.Scanner;
//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
public class Task4 {
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

        findWordMinDifSymb(string);
        //printMatrix(string);
    }

    public static void findWordMinDifSymb(String[] string){
        int arrMinDifSymb[]=new int[string.length];
        for (int i=0;i<string.length;i++){
            char chs[]=string[i].toCharArray();//char array of word i
            //char chsRepeating[]=new char[string[i].length()];//array for one of repeated and unrepeated char
            //char ch=chs[i];
            for (int j=1;j<chs.length;j++){//run throug char array
                for (int k=j;k<chs.length;k++){ //and put + indstead of repeating chars
                    if ((chs[j-1]==chs[k])&&(chs[j-1]!='+')){
                        chs[k]='+';
                    }

                }
            }

            int countExlusiveChar=0; //counter of exclusive chars
            for(int j=0;j<chs.length;j++){
                if (chs[j]!='+'){
                    countExlusiveChar++;
                }
            }
            arrMinDifSymb[i]=countExlusiveChar; //input counter in arrMinDifSymb[i]

            for (int m=0;m<chs.length;m++){ //print array chrs with + indtead of repeating chars
                System.out.print(chs[m]);
            }
            System.out.println();
        }
        //find word that has minimal repeated chars

        int min=arrMinDifSymb[0];
        //find count of minimal repeatings
        for (int q=0;q<arrMinDifSymb.length;q++){
            if (min>arrMinDifSymb[q]){
               min=arrMinDifSymb[q];
            }
        }
        //find word
        for (int j=0;j<arrMinDifSymb.length;j++){
            if (min==arrMinDifSymb[j]){
                System.out.println("This word has the smallest count of repeated chars:"+ string[j]);
            }
        }
        for (int i=0;i<string.length;i++){
            System.out.println(arrMinDifSymb[i]);
        }
    }
}
