package tolifer.L7.appliances;

public class Start {
    public static void main (String [] args){
        Phone phone1 = new Phone("Телефон", "Phillips", "A100", 150, "Стационарный" );
        Phone phone2 = new Phone("Телефон", "Apple", "S6Plus", 500,  "Мобильный");
        Fridge fridge = new Fridge("Холодильник", "Samsung", "fRI846", 1000, 60);

        phone1.plugIn();
        fridge.plugIn();
    }
}
