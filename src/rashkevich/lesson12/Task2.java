package rashkevich.lesson12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//2.Считать с консоли 2 имени файла. Вывести во второй файл все числа,
//        которые есть в первом файле. Числа выводить через пробел.
//        Закрыть потоки. Пример тела файла: 12 text var2 14 8v 1 Результат: 12 14 1
public class Task2 {
    public static void main(String...hi){

        String str=new String();
        BufferedReader br=null;
        BufferedWriter bw=null;
        try
        {
            br = Files.newBufferedReader(Paths.get((new Scanner(System.in)).nextLine()));
            List<String> list =br
                    .lines()
                    .map(line -> str.concat(line))
                    .map(s -> s.split("\\s+"))
                    .flatMap(Arrays::stream).distinct()
                    .collect(Collectors.toList());
            List<String> listNumbers = list.stream()
                    .filter(s -> s.matches("[0-9]+"))
                    .collect(Collectors.toList());
            bw = Files.newBufferedWriter(Paths.get((new Scanner(System.in)).nextLine()));
            String string=listNumbers.stream().collect(Collectors.joining(" "));
            bw.write(string);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
