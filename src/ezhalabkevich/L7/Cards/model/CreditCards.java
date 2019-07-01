package ezhalabkevich.L7.Cards.model;

public class CreditCards  extends Cards{
    private double overdraft;
    private double percentCredit;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getPercentCredit() {
        return percentCredit;
    }

    public void setPercentCredit(double percentCredit) {
        this.percentCredit = percentCredit;
    }
}
