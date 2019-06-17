package inikalayeva.Lesson7.A2.model;

public abstract class MasterCard extends Debit{
    double mastercardExchangeRate;

    public double getMastercardExchangeRate() {
        return mastercardExchangeRate;
    }

    public void setMastercardExchangeRate(double mastercardExchangeRate) {
        this.mastercardExchangeRate = mastercardExchangeRate;
    }
}
