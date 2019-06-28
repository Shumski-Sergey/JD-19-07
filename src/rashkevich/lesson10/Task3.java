package rashkevich.lesson10;

import java.util.*;

public class Task3 {
    public static void main(String[] args){
        String str="123 456 231 546 231 312 4556";
        str=str.toLowerCase();
        String s[]=str.split("\\s");
        LinkedHashSet<String> set=new LinkedHashSet<>();

        for (int i=0;i<s.length;i++){
            String sorted=sortSymbol(s[i]);
            if(set.contains(sorted)){
            //System.out.println(s[i]);
            } else {
                set.add(sorted);
            }
        }

        for (String string:set){
            for (int i=0;i<s.length;i++){
                String sorted=sortSymbol(s[i]);
                if (string.equals(sorted)){
                    System.out.print(s[i]+" ");
                }
            }
            System.out.println();
        }

    }

    private static String sortSymbol(String s) {
        String sorted=new String();
        ArrayList<Character> list=new ArrayList<>();
        char ch[]=s.toCharArray();
        for (char c:ch){
            list.add(c);
        }
        Collections.sort(list);
        for (char c:list){
            sorted=sorted+c;
        }
        return sorted;
    }
}
