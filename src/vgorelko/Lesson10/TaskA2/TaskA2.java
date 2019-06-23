package vgorelko.Lesson10.TaskA2;
import java.util.*;


//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap
public class TaskA2 {

    public static void main(String[] args) {

        int arr [] = {1, 2, 4, 5, 3, 5, 6, 3, 6, 6};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
        }

        for (int i = 0; i < arr.length; i++){
        for (Map.Entry entry : map.entrySet()) {
            if ((int)entry.getKey() == arr[i]){
                map.put((int) entry.getKey(), (int)entry.getValue()+1);
            }
            }
        }
        System.out.println("Выводим мапу с подсчётом повторяющихся элементов");
        System.out.println(map);
    }

}
