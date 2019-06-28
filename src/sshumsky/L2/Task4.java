package sshumsky.L2;

public class Task4 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 150 + 1) + 5;
        if (a <= 25 || a >= 100) {
            System.out.println("Число " + a + " не содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + a + " содержится в интервале (25,100)");
        }
    }
}
