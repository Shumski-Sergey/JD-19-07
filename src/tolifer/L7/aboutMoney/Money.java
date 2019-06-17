package tolifer.L7.aboutMoney;

public class Money {
    private long rub;
    private char cent;

    public Money(long rub, char cent) {
        this.rub = rub;
        this.cent = cent;
    }

    public long getRub() {
        return rub;
    }

    public void setRub(long rub) {
        this.rub = rub;
    }

    public char getCent() {
        return cent;
    }

    public void setCent(char cent) {
        this.cent = cent;
    }

    @Override
    public String toString() {
        return "Money{" +
                "rub=" + rub +
                ", cent=" + cent +
                '}';
    }
}
