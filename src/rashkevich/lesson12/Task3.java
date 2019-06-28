package rashkevich.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//3.Считать с консоли имя файла. Файл содержит слова,
//        разделенные знаками препинания. Вывести в консоль количество слов "world",
//        которые встречаются в файле. Закрыть потоки.
public class Task3 {
    public static void main(String...a){
        String str=new String();
        try (BufferedReader br = Files.newBufferedReader(Paths.get((new Scanner(System.in)).nextLine()))) {
            Long count =br
                    .lines().map(line -> str.concat(line))
                    .map(s -> s.split("\\s*"))
                    .flatMap(Arrays::stream).distinct()
                    .map(String::toLowerCase)
                    .filter(s -> s.matches("\\w*[word]+\\w*"))
                    .count();
            System.out.println("Word encountered:"+count+" times");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
