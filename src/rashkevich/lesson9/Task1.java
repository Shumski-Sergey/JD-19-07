package rashkevich.lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            int num=(int)(Math.random()*4+1.4);
            //System.out.println(num);
            list.add(num);
        }

        for ( int n:list){
            System.out.println(n);
        }
        System.out.println("----------------------------");

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            if (it.next()<=3){
                it.remove();
            }
        }

        for ( int n:list){
            System.out.println(n);
        }
    }
}
