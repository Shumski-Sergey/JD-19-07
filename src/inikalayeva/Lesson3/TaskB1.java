package inikalayeva.Lesson3;

import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        int number = 20023143;
        String numberToString = Integer.toString(number);
        /*char[] intToChar = numberToString.toCharArray();
        **спросить, почему была проблема с массивом чаров
         */
        ArrayList list = new ArrayList();
        for (int i = 0; i < numberToString.length(); i++){
             list.add(numberToString.charAt(i));
        }


        ArrayList finalList = new ArrayList();

        for (int i = 0; i < list.size(); i++){
            if ((i + 1) % 3 == 0){
                finalList.add(' ');
                finalList.add(list.get(i));
            }
            else {
                finalList.add(list.get(i));
            }
        }

        for (int i = 0; i < finalList.size(); i++){
            System.out.print(finalList.get(i));
        }
    }
}

