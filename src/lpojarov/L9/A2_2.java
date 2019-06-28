package lpojarov.L9;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class A2_2 {
    public static void main(String[] args) {
        int a=20;
        ArrayList<Integer> Array=new ArrayList<>(a);
        for (int i = 0; i <a ; i++) {
            int b=(int)(Math.random()*10+1);
            Array.add(i);

        }
        System.out.println(Array);
        
    }

}
