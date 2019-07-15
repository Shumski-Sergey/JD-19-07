package vgorelko.Lesson10.TaskB.Smartable;



import java.util.*;

public class SmartableIml implements Smartable {
    @Override
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {

        List<Integer> list2 = new ArrayList<>();
        int index = 0;

        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) == element && i >= start && i < end) {

            } else {
                list2.add(list.get(i));
            }
            index++;
        }

        return list2;
    }

    @Override
    public boolean isUnique(Map<String, String> map) {

        boolean result = true;

        for(Map.Entry entry : map.entrySet()) {
            for(Map.Entry entry2 : map.entrySet()) {

                if (!entry.getKey().equals(entry2.getKey()) && entry.getValue().equals(entry2.getValue())) {
                    result = false;
                }

            }
        }


        return result;
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry entry1 : map1.entrySet()) {
            for (Map.Entry entry2 : map2.entrySet()) {

                if (entry1.getKey().equals(entry2.getKey()) && entry1.getValue() == entry2.getValue()) {
                    map.put((String) entry1.getKey(), (Integer) entry1.getValue());
                }
            }
        }

        return map;
    }

    @Override
    public int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.addAll(list1);
        set2.addAll(list2);

        list1.clear();
        list2.clear();

        list1.addAll(set1);
        list2.addAll(set2);

        int count = 0;

        for (int i = 0; i < list1.size(); i++) {
            for (int x = 0; x < list2.size(); x++) {
                if (list1.get(i) == list2.get(x)) {
                    count++;
                    continue;
                }
            }
        }

        System.out.println(list1);
        System.out.println(list2);

        return count;
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        List<String> list = new ArrayList<>();
        list.addAll(set);

        set.clear();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()%2 != 0) {
                set.add(list.get(i));
            }
        }

        return set;
    }

    @Override
    public int maxOccurrences(List<Integer> list) {

        int arr [] = new int [list.size()];

        for (int i = 0; i < list.size(); i++){
            for (int x = 0; x < list.size(); x++){
                if (list.get(i) == list.get(x)) {
                    arr[i]++;
                }
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
