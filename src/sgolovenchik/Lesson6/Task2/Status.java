package sgolovenchik.Lesson6.Task2;

public class Status extends Cards {
    private String Stat;
    private String Currency;

    public Status() {
    }

    public Status(String b, String s, String c) {
        super(b);
        this.Stat = s;
        this.Currency = c;
    }

    public String getStat() {
        return Stat;
    }

    public void setStat(String Stat) {
        this.Stat = Stat;

    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }
}