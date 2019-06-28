package rashkevich.lesson10;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String...args){
        int num[]={1,1,1,1,3,55,6,8,9,3};
        HashMap<Integer,Integer> map=new HashMap();
        for (int i=0;i<num.length;i++){
            map.put(num[i],0);
        }
        for (int i=0;i<num.length;i++){
            map.put(num[i],map.get(num[i])+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println(entry+" "+entry.getValue());
        }
    }
}
