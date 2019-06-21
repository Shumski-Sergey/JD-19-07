package src.izhuk.Lesson7.lesson7A2;

public abstract class PayCard {
    private String typeOfOperation;
    private long ID;
    private String name;
    private String TypeOfСurrency;

    public abstract void  MoneyTransfer();
    public abstract void  CashWithdrawal();
}

