package inikalayeva.Lesson7.B1;

public class Money {

    long rubles;
    static char penny;

    public long getRubles() {
        return rubles;
    }

    public void setRubles(long rubles) {
        this.rubles = rubles;
    }

    public static char getPenny() {
        return penny;
    }

    public static void setPenny(char penny) {
        Money.penny = penny;
    }



    Money(long rubles, char penny){
        this.rubles = rubles;
        this.penny = penny;
    }

    double AllToAmount(){
        return (double)(rubles + penny * 0.01);
    }
    
    static String ForComma(double result){
        String withComma = Double.toString(result);
        withComma = withComma.replace('.', ',');
        return withComma;

    }

    static double Summing (Money moneyAmount1, Money moneyAmount2){
        return moneyAmount1.AllToAmount() + moneyAmount2.AllToAmount();
    }


    static double Subtraction (Money moneyAmount1, Money moneyAmount2){
        if (moneyAmount1.AllToAmount() > moneyAmount2.AllToAmount()){
            return moneyAmount1.AllToAmount() - moneyAmount2.AllToAmount();
        }
        else {
            return moneyAmount2.AllToAmount() - moneyAmount1.AllToAmount();
        }
    }

    static double Multiplication(Money moneyAmount1, double factor) {
        return moneyAmount1.AllToAmount() * factor;
    }

    static double Division(Money moneyAmount1, double divider){
        if (divider == 0){
            System.out.println("Division by zero!");
            return 0;
        }
        else {
            return moneyAmount1.AllToAmount() / divider;
        }
    }

    public static void main (String[] args){
        Money moneyAmount1 = new Money(113, '!');
        Money moneyAmount2 = new Money(23, '-');

        System.out.println(ForComma(Summing(moneyAmount1, moneyAmount2))); //сумма
        System.out.println(ForComma(Subtraction(moneyAmount1, moneyAmount2))); //вычитание
        System.out.println(ForComma(Multiplication(moneyAmount1, 3))); //умножение
        System.out.println(ForComma(Division(moneyAmount1, 4))); //деление

    }
}
