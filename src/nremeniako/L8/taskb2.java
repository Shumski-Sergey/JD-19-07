package nremeniako.L8;

import java.util.ArrayList;
import java.util.Collections;

public class taskb2 {
    public static void main(String[] args){
        ArrayList<Integer> ar= new ArrayList<>();
        ar.add(4);
        ar.add(6); ar.add(8);ar.add(6); ar.add(10);
        int arr= Collections.max(ar);
        System.out.println(arr);
    }

}

