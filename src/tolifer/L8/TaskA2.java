package tolifer.L8;

import java.util.ArrayList;
import java.util.List;

public class TaskA2 {
    public static void main (String [] args){
        Object [] array =  new Object[]{"hi", 349, 'f', 234.23, 85742, "dog"};
        List<Object> list = new ArrayList<>();

        TaskA2.convert(array, list);
        TaskA2.print(list);
    }


    public static void convert(Object[] array, List list){

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }

    public static void print(List  list){
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}

