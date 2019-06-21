package romanovskaya.lesson8;

import java.util.*;


public class TaskA2 {
    public static void main(String[] args) {
        int a1[] = {1, 22, 30, 4, 56, 6, 744, 80};
        ArrayList<Integer> arl = new ArrayList<Integer>();
        for (int i : a1) {
            arl.add(i);
        }
        for ( int k = 0 ; k < 5; k++){
            arl.add(k);
                System.out.println("List contains"+ " " + arl.get(k));
            }
        }
    }

