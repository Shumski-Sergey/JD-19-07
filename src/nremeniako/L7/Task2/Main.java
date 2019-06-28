package nremeniako.L7.Task2;

public class Main {
    public static void main(String args[]){

        visa Gold=new visa();
        Mastercard Classic=new Mastercard();

       Gold.setName("Gold");
       Classic.setProcent(55.0);

       Classic.setName("Classic");
       Classic.setProcent(45.0);

       Gold.snimat("толкько в Европе");
       Gold.populate();
       Classic.snimat();
       Classic.komissia();

       System.out.println("карточка"+" "+Gold.getName()+" "+"Процент пользования в стране"+" "+Gold.getProcent());
    }
}
