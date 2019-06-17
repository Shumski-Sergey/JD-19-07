package inikalayeva.Lesson7.A2.model;

public abstract class Visa extends Debit{
    double visaExchangeRate;

    public double getVisaExchangeRate() {
        return visaExchangeRate;
    }

    public void setVisaExchangeRate(double visaExchangeRate) {
        this.visaExchangeRate = visaExchangeRate;
    }
}
