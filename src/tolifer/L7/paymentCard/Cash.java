package tolifer.L7.paymentCard;

public class Cash extends Bank{
    private String typeOfCash;


    public Cash(String typeOfFinancialAssets, String typeOfPaymentSystem, String nameOfBank, String typeOfCash) {
        super(typeOfFinancialAssets, typeOfPaymentSystem, nameOfBank);
        this.typeOfCash = typeOfCash;
    }

    public String getTypeOfCash() {
        return typeOfCash;
    }

    public void setTypeOfCash(String typeOfCash) {
        this.typeOfCash = typeOfCash;
    }


    @Override
    public String toString() {
        return "Cash{" +
                "typeOfCash='" + typeOfCash + '\'' +
                '}';
    }
}
