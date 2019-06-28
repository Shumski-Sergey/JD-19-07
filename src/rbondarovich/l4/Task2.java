package rbondarovich.l4;

public class Task2 {
    public static void main(String[] args) {
        String line = "ABS  dasd   asdaf   fsdf ad ad  ";
        line = line.trim();
        String [] amount = line.split(" +");
        System.out.println(amount.length);
    }
}
