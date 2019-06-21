package romanovskaya.lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task2numbers<E> {
    protected Map<E, Integer> map = new HashMap<E,Integer>();

    public void count(E[]ar){
        for ( int i = 0; i < ar.length; i++){
            if (! map.containsKey(ar[i])){
                map.put(ar[i], 1);
            }
            else
                map.put(ar[i], map.get(ar[i])+1);
        }
    }
    public Map<E, Integer> getMap(){
        return map;
    }

    public static void main(String[] args) {
        Integer[] ar = {10,2,10,1,10,10,2,10,5,10,2,10};

        Task2numbers ea = new Task2numbers();
        ea.count(ar);
        System.out.println(ea.getMap());
    }

}
