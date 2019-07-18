package rashkevich.lesson16.Taskb7;

public class Currency {
    private long money;
    private long coin;
    private String name;

    public Currency(long money, long coin, String name) {
        this.money = money;
        this.coin = coin;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void plus(Currency currency){
        long plusMoney=this.money+currency.getMoney();
        long plusCoin=this.coin+currency.getCoin();
        if (plusCoin>=100){
            plusMoney=plusMoney+1;
            plusCoin=plusCoin-100;
        }
        this.money=plusMoney;
        this.coin=plusCoin;
    }

    public void minus(Currency currency){
        long minusMoney=this.money-currency.getMoney();
        long minusCoin=this.coin-currency.getCoin();
        //System.out.println(minusMoney+" "+minusCoin);
        if (minusCoin<=0){
            minusMoney=minusMoney-1;
            minusCoin=minusCoin+100;
        }
        this.money=minusMoney;
        this.coin=minusCoin;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    public static Currency multiply(Currency currency, double num){
        double money=currency.getMoney()+((double)currency.getCoin())/100;
        money=money*num;
        //money=Currency.round3(money);
        int banknote=(int)money;
        //System.out.println(banknote);
        double coin=((money-banknote)*100);
        long longCoin=(long)Currency.round3(coin);

        currency.setMoney(banknote);
        currency.setCoin(longCoin);
        return currency;
    }
    public static double round3( double value ) {
        int iValue = ( int ) ( value * 1);
        double dValue = value * 1;
        if ( dValue - iValue >= 0.5 ) {
            iValue += 1;
        }
        dValue = ( double ) iValue;
        return dValue / 1;
    }

    @Override
    public String toString() {
        String coinStr=this.coin+"";
        if (coin<=9){
            coinStr="0"+coinStr;
        }
        return this.money+"."+coinStr+this.name;
    }
}
