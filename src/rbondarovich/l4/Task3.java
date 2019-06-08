package rbondarovich.l4;

public class Task3 {
    public static void main(String[] args) {
        String line = "Shla shasha po shosse i sosala syshky";
        String [] arr = line.split(" +");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].charAt(arr[i].length()-1);
        }
        System.out.println(result);
    }
}
