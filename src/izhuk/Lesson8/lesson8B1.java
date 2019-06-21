package src.izhuk.Lesson8;

import java.util.ArrayList;

public class lesson8B1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList myList = new ArrayList();
            for (int i = 0; i < 10; i++) {
                arr[i] = (int) (Math.random() * 100);
            }

            convert(arr, myList);

            for (int i = 0; i < myList.size(); i++) {
                System.out.println(myList.get(i));
            }
        }

        private static void convert(int[] array, ArrayList list){
            for (int i = 0; i < array.length; i++){
                list.add(array[i]);
            }
        }
    }
