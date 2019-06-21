package rashkevich.lesson9;

import java.util.HashMap;
import java.util.LinkedHashSet;

//B1.Имеется текст. Следует составить для него частотный словарь
public class TaskB1 {
    public static void main(String[] args){
        String text="Класс LinkedList<E> реализует интерфейс Queue<E>, что позволяет списку придать свойства очереди. В компьютерных науках очередь — структура\n" +
                "данных, в основе которой лежит принцип FIFO (first in, first out). Элементы добавляются в конец и вынимаются из начала очереди.";
        text=text.replace(".","");
        String str[]=text.split("(\\,*)(\\.*)\\s+");
        for (String s:str){
            System.out.println(s);
        }
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for (String s:str){
           set.add(s);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for (String s:set){
            map.put(s, 0);
        }
        for (String s:str){
            map.put(s,(map.get(s)+1));
        }
        System.out.println("---------------------");
        for (String s:set){
            System.out.println(s+" -"+map.get(s));
        }

    }
}
