package deniskuleshov.Lesson9;

import java.util.*;

public class Lesson92 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> Spisok = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int chislo = (int) (Math.random() * 10);
            Spisok.add(chislo);
        }

        Iterator<Integer> iterator = Spisok.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        }
    }