package ezhalabkevich.Rabin;

public class Rabin {
    public static void main(String[] args) {
        long n = 847880829; //8847880829
        long b = 2353358;
        long c = 775880416;
        long d = 0;
        long x = 0;
        long twoobr;
        d = b * b + 4 * c;
        d %= n; //дискриминат
        for (twoobr = 1; twoobr < n - 1; twoobr++) {
            if ((twoobr * 2 % n) == 1)
                break;
        }

        for (long i = 1; i < Math.sqrt(d); i++) {
            if ((i * i) % n == d) {
                System.out.println("Корень из дискриминанта" + i);
                x = ((-b + i) * twoobr) % n;
                System.out.println("Корень уравнения равен " + x);
                x = ((-b - i) * twoobr) % n;
                System.out.println("Корень уравнения равен " + x);

            }


        }


    }
}

