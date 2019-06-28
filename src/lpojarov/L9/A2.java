package lpojarov.L9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A2 {
    public static void main(String[] args) {
       int a=20;
        ArrayList<Integer>Arry=new ArrayList<>();
        for (int i = 0; i <=a ; i++) {
            int v=(int) (Math.random()*10+1);
            Arry.add(v);

        }
        System.out.println(Arry);
        Set<Integer> set =new HashSet<>();
        set.addAll(Arry);
        ///    ArrayList<Integer>povtorList=new ArrayList<>();
       /// for (int i = 0; i <=a ; i++) {
          ///  for (int j = 0; j <=a ; j++) {


             //   int k = Arry.get(i);
                //int b = Arry.get(j);
               // if (k == Arry.get(j)) {

                   //  povtorList.clear();
                 //    povtorList.add(i);

                    System.out.println(set);
                }
            }

     ///   Arry.removeAll(povtorList);
        ///System.out.println(Arry);




