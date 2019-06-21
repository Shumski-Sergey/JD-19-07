package src.inikalayeva.Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> theList = new ArrayList <>();
        for (int i = 0; i < 10; i++){
            String forL = reader.readLine();
            int anElement = Integer.parseInt(forL);
            theList.add(anElement);
        }
        int max = 0;
        Iterator<Integer> iterator = theList.iterator();
        while (iterator.hasNext()){
            int current = iterator.next();
            if (max < current){
                max = current;
                System.out.print(max + " ");
            }
        }

        System.out.println(max);
    }
}
