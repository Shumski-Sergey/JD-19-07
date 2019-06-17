package Romanovskaya.lesson6;

public class Money {

    private long rubs;
    private byte cents;


    public Money(long rubs, byte cents) {
        this.rubs = rubs;
        this.cents = cents;
    }

    public Money(double v) {
        return;
    }


    public long getRubs() {
        return rubs;
    }

    public byte getCents() {
        return cents;
    }

    public String toSting() {
        return rubs + "," + cents;
    }

    public static double division(Money first, Money second) {
        long firstTotal = first.getRubs() + first.getCents() / 100;
        long secondTotal = second.getRubs() + second.getCents() / 100;
        return (double) firstTotal / (double) secondTotal;
    }

    public static Money add(Money first, Money second) {
        long rubs = first.getRubs() + second.getRubs();
        int cents = first.getCents() + second.getCents();
        if (cents > 99) {
            rubs++;
            cents -= 100;
        }
        if (cents < 0) {
            rubs--;
            cents += 100;
        }
        return new Money(rubs / (byte) cents);
    }

    public static double mult(Money first, Money second) {
        long firstTotal = first.getRubs() + first.getCents() / 100;
        long secondTotal = second.getRubs() + second.getCents() / 100;
        return (double) firstTotal * (double) secondTotal;
    }

    public static Money whatleft(Money first, Money second) {
        long rubs = first.getRubs() - second.getRubs();
        int cents = first.getCents() - second.getCents();
        if (cents > 99) {
            rubs++;
            cents -= 100;
        }
        if (cents < 0) {
            rubs--;
            cents += 100;
        }
        return new Money(rubs / (byte) cents);
    }

    public static double Test(Money first, Money second) {
        long firstTotal = first.getRubs() + first.getCents() / 100;
        long secondTotal = second.getRubs() + second.getCents() / 100;
        return (double) firstTotal - (double) secondTotal;
    }

    public static double Test2 (Money first, Money second) {
        long firstTotal = first.getRubs() + first.getCents() / 100;
        long secondTotal = second.getRubs() + second.getCents() / 100;
        return (double) firstTotal + (double) secondTotal;
    }

    public boolean equals(Money test) {
        return test.getRubs() == rubs && test.getCents() == cents;
    }
    public static void main(String[] args) {
        Money first = new Money(100,(byte) 15);
        Money second = new Money(200, (byte) 50);
        String allmoneyfirst = first.toSting();
        String allmoneysecond = second.toSting();
        System.out.println("Сумма чисел");
        System.out.println(Test2(first,second));
        System.out.println("Умножение");
System.out.println(mult(first,second));
        System.out.println("Разность чисел");
        System.out.println(Test(first, second));
        System.out.println("Деление");
        System.out.println(division(first, second));
    }


}





