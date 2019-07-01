package ezhalabkevich.L7.Cards.model;

public class Cards {
    private String holderName;
    private long numberCard;
    private int monthDue;
    private int yearDue;
    private String typeOfMoney;
    private double balans;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(long numberCard) {
        this.numberCard = numberCard;
    }

    public int getMonthDue() {
        return monthDue;
    }

    public void setMonthDue(int monthDue) {
        this.monthDue = monthDue;
    }

    public int getYearDue() {
        return yearDue;
    }

    public void setYearDue(int yearDue) {
        this.yearDue = yearDue;
    }

    public String getTypeOfMoney() {
        return typeOfMoney;
    }

    public void setTypeOfMoney(String typeOfMoney) {
        this.typeOfMoney = typeOfMoney;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }
}
