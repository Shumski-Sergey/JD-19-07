package rashkevich.lesson7.Task1.Model;

public class Stove extends KitchenDevice{


    public Stove(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on stove");
    }
}
