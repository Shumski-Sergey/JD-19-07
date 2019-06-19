package src.inikalayeva.Lesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A1 <T>{
    private static T[] arrayForTask;
    T[] arrayForTask = {2.3, 7.5, 3.6, 7.4, 5.9};
    static T giveMeElement( T [] arrayForTask, int i) {
        return arrayForTask[i];
    }

    public static void main (String[] args){
        System.out.println(giveMeElement(arrayForTask, 2));
    }

}
