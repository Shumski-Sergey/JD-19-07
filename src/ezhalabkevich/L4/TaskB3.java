package ezhalabkevich.L4;

public class TaskB3 {
    public static void main(String[] args) {
        /*написать метод, который перевернет строку*/
        String str = "absdefghijk";
        System.out.println(revers(str));

    }

    public static String revers(String str) {
        int len = str.length();
        String strRevers = "";

        for (int i = len-1; i >=0; i--) {
            strRevers += str.charAt(i);
        }
        return strRevers;


    }
}
