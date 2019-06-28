package dmbelov.Lesson10.Lab.smartable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Smartable {

    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end);

    public boolean isUnique(Map<String, String> map);

    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2);

    public int countCommon(List<Integer> list1, List<Integer> list2);

    public Set<String> removeEvenLength(Set<String> set);

    public int maxOccurrences(List<Integer> list);
}
