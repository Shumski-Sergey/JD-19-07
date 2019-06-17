package tolifer.L7.paymentCard;

public class TypeOfCard extends Card{
    private String typeOfPaymentSystem;


    public TypeOfCard(String typeOfFinancialAssets, String typeOfPaymentSystem) {
        super(typeOfFinancialAssets);
        this.typeOfPaymentSystem = typeOfPaymentSystem;
    }

    public String getTypeOfPaymentSystem() {
        return typeOfPaymentSystem;
    }

    public void setTypeOfPaymentSystem(String typeOfPaymentSystem) {
        this.typeOfPaymentSystem = typeOfPaymentSystem;
    }

    @Override
    public String toString() {
        return "TypeOfCard{" +
                "typeOfPaymentSystem='" + typeOfPaymentSystem + '\'' +
                '}';
    }
}
