package tolifer.L7.paymentCard;

public class Card {
    private String typeOfFinancialAssets;

    public Card(String typeOfFinancialAssets) {
        this.typeOfFinancialAssets = typeOfFinancialAssets;
    }

    public String getTypeOfFinancialAssets() {
        return typeOfFinancialAssets;
    }

    public void setTypeOfFinancialAssets(String typeOfFinancialAssets) {
        this.typeOfFinancialAssets = typeOfFinancialAssets;
    }

    @Override
    public String toString() {
        return "Card{" +
                "typeOfFinancialAssets='" + typeOfFinancialAssets + '\'' +
                '}';
    }
}
