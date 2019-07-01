package ezhalabkevich.L12;

import java.util.Arrays;
import java.util.logging.StreamHandler;
import java.util.stream.Stream;

public class FileRead {
    /*Считать с консоли 2 имени файла. Вывести во второй файл все числа, которые есть в первом файле.
    Числа выводить через пробел. Закрыть потоки.
     Пример тела файла: 12 text var2 14 8v 1 Результат: 12 14 1*/
    public static void main(String[] args) {
        String str1 = "12 text var2 14 8v 1";
        String str2="";
        //Arrays.stream(text.split("\\s*[ ,.!?]\\s*")).filter(x -> !x.matches("^[a-zA-Z]+$")).forEach(x -> System.out.println(x))
        Arrays.stream(str1.split("\\s*[ ,.!?]\\s*")).filter(x->!x.matches("^[a-zA-Z]+$")).forEach(x-> System.out.println(x));
        str2 ="world , . ////*- "; }
}
