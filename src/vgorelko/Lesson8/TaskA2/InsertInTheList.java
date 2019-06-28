package vgorelko.Lesson8.TaskA2;

import java.io.*;
import java.util.ArrayList;

public class InsertInTheList {

    ArrayList<String> insetList(String text){

      //  System.out.println(text);

        String arr[] = text.split(" ");

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++ ) {

            list.add(arr[i]);

        }

        return list;
    }



}
