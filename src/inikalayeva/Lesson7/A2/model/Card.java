package inikalayeva.Lesson7.A2.model;

public abstract class Card{
    private int pin;
    private String owner;
    private int monthExpDate;
    private int yearExpDate;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMonthExpDate() {
        return monthExpDate;
    }

    public void setMonthExpDate(int monthExpDate) {
        this.monthExpDate = monthExpDate;
    }

    public int getYearExpDate() {
        return yearExpDate;
    }

    public void setYearExpDate(int yearExpDate) {
        this.yearExpDate = yearExpDate;
    }
}
