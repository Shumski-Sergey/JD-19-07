package lpojarov.L7.A_2karts;

public class Main {
    public static void main(String[] args) {
        Cards Priorbank = new Cards();
        Account Account$ = new Account();
Account AccountEvro=new Account();

        System.out.println("Счет Вашей Карты Приорбанк = "+Priorbank.prior + " БелРуб ~ " + String.format("%.3f", Account$.TransefToDolor)+"$ ~ "+String.format("%.3f",AccountEvro.TransferToEvroPrior)+"Evro"  );
        Cards BelarusBank=new Cards();
       // Account Accounts$=new Account();
        System.out.println("Счет Вашей карты Бел.Банк = "+BelarusBank.BelBanc+" БелРуб ~ "  +String.format("%.3f",Account$.TrnsferToDolorBB)+"$ ~ "+String.format("%.3f",AccountEvro.TransferToEvroBB)+"Evro" );

    }
}
