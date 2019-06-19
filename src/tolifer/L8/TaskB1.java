package tolifer.L8;

import java.util.ArrayList;
import java.util.List;

public class TaskB1{

    public static void main (String [] args) {
        Object[] array = new Object[]{"bye", "dog", "cat", 234.23, 85742, -983};
        List<Object> list = new ArrayList<>();

        TaskA2.convert(array, list);


    }

}
