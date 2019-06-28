package inikalayeva.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    /* не получилось почему-то, объясни пожалуйста потом почему
    static int numberInput(int number){
        if (number < 1 || number > 12) {
            System.out.println("Number isn't correct, please, try again");
            numberInput(number);
        }
        else {
            return number;
        }
    }*/
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String stringForNumber = buffer.readLine();
        int numberOfMonth = Integer.parseInt(stringForNumber);
        //int numberOfMonth = numberInput(number);
        switch (numberOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Number isn't correct, please, try again");
                break;


        }
    }



}
