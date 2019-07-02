package rashkevich.lesson14;

//3.Организовать построчное считывание данных, введенных с консоли,
//        и их запись в файл. Признаком окончания записи (конец работы программы)
//        является строка со словом «#ESC».

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        String str=new String("");
        String filename="C:\\Users\\iland\\IdeaProjects\\JD-19-07_clone5\\src\\rashkevich\\lesson14\\out3.txt";
        File file = new File(filename);
        try (BufferedWriter bw=new BufferedWriter(new FileWriter(file));){

        while (str!="#ESC"){
            System.out.println("Введите число:");
            Scanner sc = new Scanner(System.in);
            str=sc.nextLine();
            System.out.println(str);
            if (str!="#ESC"){
            bw.write(str);
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
