package izhuk.Lesson2;

public class lesson2B1 {

    public static void main(String[] args) {
        int a = (int)(Math.random()*150 + 5);
        if (a >= 25 && a <=100){
            System.out.println("In range");
        }
        else {
            System.out.println("Not in range");
        }
    }
}