package romanovskaya.lesson8.TaskB1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Converter<T> {

    default List<T> simpleArrToList(T[] arr){
        List<T> list = new ArrayList<T>();
        Collections.addAll(list , arr);
                return list;

    }
}
