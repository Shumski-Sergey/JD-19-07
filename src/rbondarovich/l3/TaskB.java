package rbondarovich.l3;

public class TaskB {
    public static void main(String[] args) {
        long num = 1234567890234L;
        String s = "" + num;
        StringBuffer line = new StringBuffer(s);

        for (int i = line.length()-3; i>=0; i -=3){
            line.insert(i, " ");
        }
        System.out.println(line);
    }
}
