package ezhalabkevich.L10.A1;

import java.util.HashSet;

public class NoDublicat {
    public static void main(String[] args) {
        String str="1, 2, 3, 4,4,4,4, 5";
        HashSet hashSet = new HashSet();
        for (int i = 0; i <str.length() ; i++) {
            hashSet.add(str.charAt(i));
        }
        for (Object o:hashSet) {
            System.out.print(" "+o);
        }

    }
}
