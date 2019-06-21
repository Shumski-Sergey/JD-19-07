package rashkevich.lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<5;i++){
            int num=(int)(Math.random()*4+1.4);
            //System.out.println(num);
            list.add(num);
        }

        Iterator<Integer> it=list.iterator();
        int max=list.get(0);

        while(it.hasNext()){
            int num=it.next();
            if (max<num){
                max=num;
            }
        }

        System.out.println("Max ="+max);
    }
}
