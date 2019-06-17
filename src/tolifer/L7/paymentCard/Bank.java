package tolifer.L7.paymentCard;

public class Bank extends TypeOfCard{
    private String nameOfBank;


    public Bank(String typeOfFinancialAssets, String typeOfPaymentSystem, String nameOfBank) {
        super(typeOfFinancialAssets, typeOfPaymentSystem);
        this.nameOfBank = nameOfBank;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameOfBank='" + nameOfBank + '\'' +
                '}';
    }
}
