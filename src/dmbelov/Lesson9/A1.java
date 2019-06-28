package dmbelov.Lesson9;

import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int randomI = (int) (Math.random()*100+21);
        for(int i=0; i<=randomI; i++){
            int randomMark = (int) (Math.random()*5+1);
            list.add(randomMark);
        }
        System.out.println("First array: " + list + " " + list.size());

        deleteNegativeMark(list);
    }

    private static void deleteNegativeMark(ArrayList<Integer> list1){
        for (int i=0; i<list1.size(); i++) {
            if(list1.get(i)<3){
                list1.remove(i);
                i--;
            }
        }
        System.out.print("Bad students are gone: " + list1 + list1.size());
    }
}
