package rashkevich.lesson7;

public class Money {
    private long rubl;
    private char coin;

    public Money(long rubl, int coin) {
        this.rubl = rubl;
        this.coin = (char)coin;
    }

    public void prnt(Money money){
        System.out.println(money.getRubl()+","+money.getCoin());
    }

    public long getRubl() {
        return rubl;
    }

    public void setRubl(long rubl) {
        this.rubl = rubl;
    }

    public int getCoin() {
        return (int)coin;
    }

    public void setCoin(char coin) {
        this.coin = coin;
    }

    public Money sum(Money one, Money two){
        Money sum=new Money(0,0);
        long rubl=one.getRubl()+two.getRubl();
        int coin=one.getCoin()+two.getCoin();

        if (coin>=100){
            rubl++;
            coin=coin-100;
        }
        sum.setRubl(rubl);
        sum.setCoin((char)coin);
        return sum;
    }

    public Money minus(Money one, Money two){
        Money minus=new Money(0,0);
        long rubl=one.getRubl()-two.getRubl();
        int coin=one.getCoin()-two.getCoin();
            System.out.println(coin);
        if (coin<0){
            rubl--;
            coin=coin+100;
        }
        minus.setRubl(rubl);
        minus.setCoin((char)coin);
        return minus;
    }

    public Money division(Money one, double num){
        Money division=new Money(0,0);
        long coin=one.getRubl()*100+one.getCoin();
        coin=(long)(coin/num);
        long rubl=(long)coin/100;
        coin=coin%100;
        division.setRubl(rubl);
        division.setCoin((char)coin);
        return division;
    }

    public Money multiply(Money one, double num){
        Money multiply=new Money(0,0);
        long coin=one.getRubl()*100+one.getCoin();
        coin=(long)(coin*num);
        long rubl=(long)coin/100;
        coin=coin%100;
        multiply.setRubl(rubl);
        multiply.setCoin((char)coin);
        return multiply;
    }

    public Money max(Money one, Money two){
        Money max=one;
        long coinOne=one.getRubl()*100+one.getCoin();
        long coinTwo=two.getRubl()*100+two.getCoin();
        if (coinOne<coinTwo){
            return two;
        }
        return max;
    }

    public Money min(Money one, Money two){
        Money min=one;
        long coinOne=one.getRubl()*100+one.getCoin();
        long coinTwo=two.getRubl()*100+two.getCoin();
        if (coinOne>coinTwo){
            return two;
        }
        return min;
    }

    @Override
    public String toString() {
        String str="";
        if (coin<=9){
            str="0";
        }
        return "Сумма " +
                rubl +
                "," +str+ (int)coin;
    }
}
