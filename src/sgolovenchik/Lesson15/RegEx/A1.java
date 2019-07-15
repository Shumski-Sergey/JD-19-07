package sgolovenchik.Lesson15.RegEx;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Check IP:");
        String CheckIP = in.nextLine();

        String FilterFormat = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        if (CheckIP.matches(FilterFormat))
            System.out.println("IP Right");
        else {
            System.out.println("IP Wrong");
        }
    }
}
