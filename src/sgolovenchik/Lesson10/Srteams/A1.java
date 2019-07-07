package sgolovenchik.Lesson10.Srteams;

import java.util.HashMap;
import java.util.Map;

public class A1 {
    public static void main(String[] args) {
        Map <String,String> PersonInfo = new HashMap<>();
        PersonInfo.put("name","Sergey");
        PersonInfo.put("country","Belarus");  //наполняю HashMap по условию (ключ/значение)
        PersonInfo.put("city","Minsk");
        PersonInfo.put("age",null);
        System.out.println(getQuery(PersonInfo));
    }
    public static String getQuery(Map <String,String> PersonData)

    {
        //System.out.println(PersonData);
        StringBuilder s = new StringBuilder();

        for (Map.Entry<String,String> InfoPair : PersonData.entrySet())
        {
            if (InfoPair.getValue() != null)  //берём данные попарно если у ключа значение не null
            {                                 //и добавляем в строку
                s.append(InfoPair.getKey() +" = '" + InfoPair.getValue()+"' and ");
            }
        }
        //System.out.println(s);
        s.delete(s.toString().length()-5,s.toString().length());  //Стираем последний and
        //System.out.println(s);
        return s.toString();
    }
}
