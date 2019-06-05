package ezhalabkevich.L2;

public class A1 {
    public static void main(String[] args) {
        double n, m;
        //Task A1
        n = 8.5;
        m = 11.45;
        double mod1, mod2;
        //Чей модуль меньше, то и выводим
        if (n > 10) mod1 = n - 10;
        else mod1 = 10 - n;
        if (m > 10) mod2 = m - 10;
        else mod2 = 10 - m;
        if (n < m) System.out.println("Число " + m + " ближе к 10");
        else System.out.println("Число " + n + " ближе к 10");

    }

}
