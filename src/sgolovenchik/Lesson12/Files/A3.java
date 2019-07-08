package sgolovenchik.Lesson12.Files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        try {

            File OutputFile = new File("C:\\JAVA\\TaskFiles\\New Dir\\TextFile.txt");
            FileWriter fr = new FileWriter(OutputFile);
            int n = 1;
            String AddString;

            while (n != 0) {                                    //бесконечный цикл с условием выхода внутри
                System.out.print("Input string N" + n + " (#ESC - exit): ");
                Scanner in = new Scanner(System.in);
                String Add = in.nextLine();
                AddString = Add;
                if (AddString.equals("#ESC")){break;}
                fr.write(Add+"\r\n");
                n++;
            }
            fr.close();

        } catch (Exception e) { // если  произошла ошибка адреса файла
            e.printStackTrace();
            System.out.println("Error of pathname.");

        }
    }
}
