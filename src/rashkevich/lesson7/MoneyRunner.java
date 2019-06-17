package rashkevich.lesson7;

public class MoneyRunner {
    public static void main(String[] args){
        long n=100;
        char c=88;
        Money money=new Money(n,c);
        long n2=1;
        char c2=12;
        Money money2=new Money(n2,c2);
        Money sum=money.sum(money,money2);
        System.out.println(money+" +"+money2+" ="+sum);
        Money minus=money.minus(money,money2);
        System.out.println(money+" -"+money2+" ="+minus);
        Money div=money.division(money,2.5);
        System.out.println(money+" /"+2.5+" ="+div);
        Money mult=money.multiply(money,2.5);
        System.out.println(money+" *"+2.5+" ="+mult);
        System.out.println("Максимальное число:"+money.max(money,money2));
        System.out.println("Минимальное число:"+money.min(money,money2));
    }
}
