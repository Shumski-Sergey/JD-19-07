package rashkevich.lesson9;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args){
        ArrayList<Integer> aList=new ArrayList<>();
        LinkedList<Integer> lList=new LinkedList<>();
        for (int i=0;i<100000;i++){
            aList.add(i);
            lList.add(i);
        }
        long one=(new Date()).getTime();
        getNum(aList);
        long two=(new Date()).getTime();
        System.out.println((two-one));

        long three=(new Date()).getTime();
        getNum(lList);
        long four=(new Date()).getTime();
        System.out.println((four-three));
    }

    public static void getNum(List<Integer> list){
        for (int i=0;i<10000;i++){
            int index=(int)(Math.random()*10000);
            list.get(index);
        }
    }
}
