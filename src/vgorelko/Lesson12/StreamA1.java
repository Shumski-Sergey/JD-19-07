package vgorelko.Lesson12;

import java.util.*;
import java.util.stream.Stream;

public class StreamA1 {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);

        System.out.println(whereReturn(map));

    }

    public static String whereReturn (LinkedHashMap<String, String> map) {

        StringBuilder stringBuilder = new StringBuilder();
        Stream<Map.Entry<String, String>> stream = map.entrySet().stream(); //Преобразуем данные из map в поток

        stream.filter(x -> x.getValue() != null).forEach(x -> stringBuilder.append(x.getKey()).append(" = '").append(x.getValue()).append("' and "));
        stringBuilder.setLength(stringBuilder.length()-5);

        return String.valueOf(stringBuilder);


    }





}
