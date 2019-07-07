package sgolovenchik.Lesson6.Task2;

public class PersonalCards {
    public static void main(String[] args) {
        CardHolder Person1 = new CardHolder("Технобанк", "GOLD","Доллары США","Иванов И.И.",1000);
        CardHolder Person2 = new CardHolder("Альфабанк","CLASSIC","Евро","Петров П.П.",2000);

        System.out.println("Name of Person1: " +Person1.getName());
        System.out.println("Bank & Amount : "+ Person1.getBank()+" , "+ Person1.getsum()+" "+Person1.getCurrency());
        System.out.println("Name & StatusCard of Person2: "+Person2.getName()+" "+Person2.getStat()+" Card");

    }
}

