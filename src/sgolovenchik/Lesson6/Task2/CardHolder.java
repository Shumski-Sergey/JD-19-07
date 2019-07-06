package sgolovenchik.Lesson6.Task2;

public class CardHolder extends Status {
    private String Name;
    private int sum;

    public CardHolder(String b, String s, String c, String n, int sum) {
        super(b, s, c);
        this.Name = n;
        this.sum = sum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getsum() {
        return sum;
    }

    public void setsum(int sum) {
        this.sum = sum;

    }
}
