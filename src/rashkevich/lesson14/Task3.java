
//3.Организовать построчное считывание данных, введенных с консоли,
//        и их запись в файл. Признаком окончания записи (конец работы программы)
//        является строка со словом «#ESC».

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        LinkedList<String> list=input();
        writeInFile(list);
    }
    public static LinkedList<String> input(){
        LinkedList<String> list=new LinkedList<String>();
        String str="";
        Scanner sc=new Scanner(System.in);
        while(str!="#ESC"){
            str=sc.nextLine();
            System.out.println(str);
            if (str.equals("#ESC")){
                sc.close();
                break;
            }
            list.add(str);
        }
        return list;
    }

    public static void writeInFile(List<String> list){
        String filename="out.txt";
        File file=new File(filename);
        PrintWriter fr=null;
        try {
            fr=new PrintWriter(file.getAbsolutePath());
            System.out.println("File path:"+file.getAbsolutePath());
            for (String str:list){
                fr.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr!=null){
                fr.close();
            }
        }
    }
}
