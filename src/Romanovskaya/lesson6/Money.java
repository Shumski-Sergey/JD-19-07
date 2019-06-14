package Romanovskaya.lesson6;

public class Money {
    private long rubl = 45;
    private char coins = 30;
    private byte cents = (byte)coins;

    public Money(long rubl, byte cents){
        this.rubl = rubl;
        this.cents = cents;
    }
}
