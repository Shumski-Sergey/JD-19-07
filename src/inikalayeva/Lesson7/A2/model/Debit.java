package inikalayeva.Lesson7.A2.model;

public abstract class Debit extends Card {
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
