package src.inikalayeva.Lesson8;

import java.util.ArrayList;

public class B1<T>{
    private static int[] arr = new int[10];
    private static ArrayList myList = new ArrayList();

    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println();
        convert();

        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    private static void convert() {
        for (int i = 0; i < arr.length; i++){
            myList.add(arr[i]);
        }
    }
}
