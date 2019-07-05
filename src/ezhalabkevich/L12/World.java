package ezhalabkevich.L12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class World {
    public static void main(String[] args) {
        /*Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
        Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.
         */
        ArrayList<String> arrayList = new ArrayList<>();
        String s = "world world, world   ,. world ";

        for (String words : s.split("[ ,.!?]")) {
            arrayList.add(words);
            System.out.println(words);
        }
        System.out.println(arrayList.size()); //размер массива 10

        System.out.println( Stream.of(arrayList).filter(x->x.equals("world")).count()); //ищем ячейку

       /* try(BufferedReader br = new BufferedReader(new FileReader("notes.txt")))
        {
            //чтение построчно
            String s;
            while((s=br.readLine())!=null){

                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }*/
        /*try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt")))
        {
            // чтение построчно
            String text;
            while(!(text=br.readLine()).equals("ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }*/
    }
}
