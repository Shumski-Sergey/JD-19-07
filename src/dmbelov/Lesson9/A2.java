package dmbelov.Lesson9;

import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int randomI = (int) (Math.random()*31+21);
        for(int i=0; i<=randomI; i++){
            int randomNumber = (int) (Math.random()*500);
            list.add(randomNumber);
        }
        System.out.println("First array: " + list + " " + list.size());

        deleteSameNumbers(list);
    }

    private static void deleteSameNumbers(ArrayList<Integer> list1){
        for (int i=0; i<list1.size(); i++) {
            for(int j=i+1; j<list1.size()-1; j++){
                if(list1.get(i).equals(list1.get(j))){
                    System.out.println("I delete number: " + list1.get(j));
                    list1.remove(j);
                    j--;
                }
            }
        }
        System.out.print("Array without same numbers: " + list1 + list1.size());
    }
}

