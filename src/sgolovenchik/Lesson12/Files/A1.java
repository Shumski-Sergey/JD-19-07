package sgolovenchik.Lesson12.Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class A1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Path Input File: ");     //адрес файла для чтения с консоли:
        String fileName = reader.readLine();        //   D:\\students\\sgolovenchik\\TaskFiles\\777.txt
        reader.close();                               //C:\\JAVA\\TaskFiles\\less12.txt

        List<Integer> bytes = new LinkedList<>();

        FileInputStream is = new FileInputStream(fileName);
        while (is.available() > 0) {
            bytes.add(is.read());
        }
        System.out.println(bytes);//полученный массив байтов из файла

        int MaxRepeat = 1;
        int MaxRepeatByte = bytes.get(0) ;


        for (int i = 0; i < bytes.size(); i++) {
            int Repeat = 0;
            for (int j = i + 1; j < bytes.size(); j++) {
                if (bytes.get(i).equals(bytes.get(j))) {
                    Repeat++;
                    if (Repeat > MaxRepeat) {
                        MaxRepeat = Repeat;
                        MaxRepeatByte = bytes.get(i);
                        System.out.print("Байт: "+MaxRepeatByte+"  "); //вывод в консоль процесса
                        System.out.println(MaxRepeat+" повторов");      //поиска байта с максимальным повтором
                    }

                }
            }
        }
        System.out.println("______________________________________________");
        System.out.print("Макс. кол-во повторов Байт: "+ MaxRepeatByte +" ( ");
        System.out.println(MaxRepeat+" повторов )");
    }
}
