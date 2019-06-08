package ezhalabkevich.L2;

public class B1 {
    public static void main(String[] args) {
        //Task buhgalter

        double num = Math.random();
        num *= 100;
        if (num < 5) num += 5;
        else while (num > 155) {
            num -= 5;
        }

        if (num > 25 && num < 100) System.out.println("Число " + num + " попало в промежуток!");
        else System.out.println("Число " + num + " не  попало в промежуток!");

    }
}
