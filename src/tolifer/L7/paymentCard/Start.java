package tolifer.L7.paymentCard;

public class Start {
    public static void main (String [] args){
        Card card = new Cash("credit", "Visa", "AlfaBank", "USD" );
        Card card2 = new Cash("debit", "MasterCard", "MTBank", "EUR");

        System.out.println(card);
        System.out.println(card2);
    }
}
