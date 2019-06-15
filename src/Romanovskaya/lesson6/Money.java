package Romanovskaya.lesson6;

public class Money {

    private long rubFirst = 450;
    private char coins1 = 30;
    private byte centsFirst = (byte)coins1;
    private long rubSecond = 250;
    private char coins2 = 15;
    private byte centsSecond = (byte)coins2;


    // public Money(long rubl, byte cents1, long rub2 , byte cents2){
      //  this.rubFirst = rubl;
       // this.centsFirst = cents1;
       // this.rubSecond = rub2;
       // this.centsSecond = cents2;


        public long getRubFirst() {
            return rubFirst;
        }

        public byte getCentsFirst() {
            return centsFirst;
        }

        public long getRubSecond() {
            return rubSecond;
        }

        public byte getCentsSecond() {
            return centsSecond;
        }

        //String readyNumberfirst = rubl+","+cents2;
        //String readyNumberTwo = rub2+","+cents2;
        //double d1 = Double.parseDouble(readyNumberfirst);
        //double d2 = Double.parseDouble(readyNumberTwo);

    }


