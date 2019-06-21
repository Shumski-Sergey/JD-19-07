package src.izhuk.Lesson7.lesson7A2;

public class MaestroMasterCard extends MasterCard{

    public void MoneyTransfer(){
        System.out.println("Зачисление наличных. Вооо, бабосики пришли!");
    }
    @Override
    public void CashWithdrawal(){
        System.out.println("Снятие наличных. Купил сырок Б.Ю.Александров и денег больше нет.");
    }

}
