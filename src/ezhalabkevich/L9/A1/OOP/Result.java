package ezhalabkevich.L9.A1.OOP;

import java.util.ArrayList;

import static ezhalabkevich.L9.A1.OOP.Servise.allmarks;
import static ezhalabkevich.L9.A1.OOP.Servise.goodmarks;

public class Result {
    public static void main(String[] args) {
        Students st1 = new Students();
       // ArrayList marks = new ArrayList();
        st1.name="Иванов";
        st1.marks.add(3);
        st1.marks.add(6);
        st1.marks.add(9);
        st1.marks.add(7);

        Students st2 = new Students();
        st2.name="Петров";
        st2.marks.add(6);
        st2.marks.add(3);
        st2.marks.add(6);
        st2.marks.add(2);
        st2.marks.add(7);

        allmarks(st1);
        goodmarks(st1);
        allmarks(st2);
        goodmarks(st2);
    }
}
