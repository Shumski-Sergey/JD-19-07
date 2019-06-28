package rashkevich.lesson12;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. Сформируй часть запроса WHERE используя StringBuilder.Если значение null,
//        то параметр не должен попадать в запрос.
//        Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
//        Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
public class Task1Home {
    public static void main(String[] args){
        String str[]={"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null};
        Map<String,String> inquiry=new LinkedHashMap<>();
        for (int i=0;i<str.length;i=i+2){
            inquiry.put(str[i], str[i + 1]);
        }

           // System.out.println(inquiry.keySet());

        StringBuilder sb=new StringBuilder();
        String s=inquiry.keySet().stream()
                .filter((key)-> inquiry.get(key)!=null)
                .map((key)->(new StringBuilder()).append(key+" = '"+inquiry.get(key)+"'"))
                .collect(Collectors.joining(" and "));

        System.out.println(s);
    }

}
