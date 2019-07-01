package ezhalabkevich.L9.A1;

import java.util.ArrayList;
import java.util.Random;

public class A1 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        Random rand = new Random();
       for (int i=0;i<30;i++){
           marks.add(rand.nextInt(9)+1); //заполнили оценками
       }
        for (Object o:marks) {
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("Хорошие оценки");
        for (Object o:marks) {
            if((int)o>3)
            System.out.print(o+" ");
        }


     /*   for (int i = 0; i <30 ; i++) {
            if ((int)marks.get(i)<3){
                marks.remove(i);
            }else System.out.print(marks.get(i)+" ");
        }
        System.out.println("Хорошие оценки");*/


    }
}
