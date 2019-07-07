package ezhalabkevich.L14;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BiteMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите имя файла! ");
        String fileName = reader.readLine();
        FileInputStream fileInputStream  = new FileInputStream(fileName);
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        while (fileInputStream.available()>0){
           arrayList.add(fileInputStream.read()); //читаем байты и записываем их в массив
        }
       /* Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
        Вывести их на экран через пробел. Закрыть поток ввода-вывода.
        */
        fileInputStream.close();
        int count = 0;
        for (int i=0; i<arrayList.size();i++){
            int key = arrayList.get(i);
            if (map.containsKey(key)){          //раскидываем байты по количеству повторов
                count++;
                map.put(key, count);
            }else {count=1;
            map.put(key, count);}
           
        }
        int max=0;

        for(Map.Entry <Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry);
           if (max<=entry.getValue())
            {max=entry.getValue();
            } // ищем максимум вхождений

        }
        for(Map.Entry <Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue()>=max){
                System.out.println(entry);
            }
        }

    }

}
