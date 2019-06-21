package src.inikalayeva.Lesson9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> theList = new ArrayList <>();
        for (int i = 0; i < 10; i++){
            String forList = read.readLine();
            int anElement = Integer.parseInt(forList);
            theList.add(anElement);
        }

        for (int i = 0; i < theList.size();){
            int anElement = theList.get(i);
            if(anElement < 4){
                theList.remove(i);
            }
            else {
                i++;
            }
        }

        for (int i = 0; i < theList.size(); i++){
            System.out.print(theList.get(i) + " ");
        }

    }
}
