package dmbelov.Lesson8.A2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BoxRunner {
    public static void main(String[] args) throws IOException {
        int arrSize = arraySize();
        ArrayList<String> arrayList = new ArrayList<>();

        //Filling the list
        for(int i=0; i<arrSize; i++) {
            System.out.print("Enter directory content # " + (i + 1)+" ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrayList.add(reader.readLine());
        }
        //System.out.print(arrayList);
        Box<String> box = new Box<>();
        box.setArrayList(arrayList);
        box.outPrintFiveElements(arrayList);
    }
    private static int arraySize() throws IOException {
        System.out.print("Enter array size: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        return Integer.parseInt(str);
    }
}
