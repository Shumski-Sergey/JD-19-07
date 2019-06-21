package src.izhuk.Lesson7.lesson7A2;

public class MasterCard extends PayCard {
    private String MasterCardCategory;

    public void  MoneyTransfer(){
        System.out.println("Зачисление наличных. Так, стоп, а на какую карту то?");
    }
    public void CashWithdrawal(){
        System.out.println("Снятие наличных. Еще и непонятно с какой карты(");
    }

}
