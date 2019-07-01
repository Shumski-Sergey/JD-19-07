package ezhalabkevich.L7.Money.model;

public class Money {
   private long rubl;
   private byte coin;

    public void setCoin(byte coin) {
        this.coin = coin;
    }

    public void setRubl(long rubl) {
        this.rubl = rubl;
    }

    public byte getCoin() {
        return coin;
    }

    public long getRubl() {
        return rubl;
    }
}
