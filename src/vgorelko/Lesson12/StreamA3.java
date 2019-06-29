package vgorelko.Lesson12;

import java.io.*;
import java.util.stream.Stream;
import java.util.*;

public class StreamA3 {

    //Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания. Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        System.out.println("Изначальный текст в файле: " + fileInput(fileName));

        System.out.println("Количество слов world в файле: " + wordCount(fileInput(fileName)));

    }


    public static String fileInput(String fileName) {

        String text = "";

        try(FileInputStream fin=new FileInputStream(fileName))
        {
            //   System.out.printf("File size: %d bytes \n", fin.available());

            int i=-1;
            while((i=fin.read())!=-1){


                text = text + (char)i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        return text;
    }


    public static Integer wordCount(String text) {

        int count = (int) Arrays.stream(text.split("\\s*[ ,.!?]\\s*")).filter(x -> x.contains("world")).count();

        return count;
    }

}