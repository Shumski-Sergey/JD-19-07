package rbondarovich.Lecture3;

public class taskb1 {
    public static void main(String[] args) {
        int number = 20023143;
        StringBuilder s = new StringBuilder(("" + number)).reverse();
        System.out.println(s);
        String line = "" + s;
        char [] arrChar = line.toCharArray();

        int[] arr = new int[arrChar.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) arrChar[i];
            System.out.println(arr[i]);
        }

        for (int i = 1; i < arr.length ; i++) {

            if(i % 3 == 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}
