package src.izhuk.Lesson7.lesson7A1;


import src.izhuk.Lesson7.lesson7A1.models.Freezer;
import src.izhuk.Lesson7.lesson7A1.models.Fridge;
import src.izhuk.Lesson7.lesson7A1.models.Television;

public class test {
    public static void main(String [] args){
        Fridge fridge = new Fridge("Холодильник", "Samsung", "RB41J7761B1", 0);
        fridge.TurnedOn();
        Freezer frez = new Freezer("Морозилка", "Samsung", "RB41J7761B1", -3,  2);
        frez.TurnedOn();
        Television tv = new Television("Телевизор", "Samsung", "UE55NU8000U", 25);
        tv.TurnedOn();
    }
}
