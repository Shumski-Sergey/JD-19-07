package dmbelov.Lesson10.Lab.smartable;

import java.util.*;

public class ImplSmartable
        implements Smartable{

    @Override
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
        List<Integer> listIndexToKill = new ArrayList<>();
        for(int i=start; i<end; i++){
            if(list.get(i).equals(element)){
                listIndexToKill.add(i);
            }
        }
        int size = listIndexToKill.size();
        for(int i=size-1; i>=0; i--){
            int del = listIndexToKill.get(i);
            list.remove(del);
        }
        return list;
    }

    @Override
    public boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        boolean uniquLastName = false;
        for(String key:map.keySet()) {
            set.add(map.get(key));
        }
        if(map.size()==set.size()){
            uniquLastName = true;
        }
        return uniquLastName;
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mapOutput = new HashMap<>();
        for(Map.Entry<String, Integer> e1:map1.entrySet()) {
            for (Map.Entry<String, Integer> e2:map2.entrySet()){
                if((e1.getKey().equals(e2.getKey()) && e1.getValue().equals(e2.getValue()))){
                    mapOutput.put(e1.getKey(),e1.getValue());
                }
            }
        }
        return mapOutput;
    }

    @Override
    public int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>();
        for (int i:list1) {
            for (int j:list2) {
                if(i == j){
                    set.add(j);
                }
            }
        }
        return set.size();
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> setOddLength = new HashSet<>();
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String s = it.next();
            if(s.length()%2==1){
                setOddLength.add(s);
            }

        }
        return setOddLength;
    }

    @Override
    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i: list) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        int max=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max<entry.getValue()){
                max = entry.getValue();
            }
        }
        return max;
    }
}
