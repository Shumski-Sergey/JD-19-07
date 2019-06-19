package rashkevich.lesson7.Task1.Model;

public class Fridge extends KitchenDevice{
    public Fridge(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the frige");
    }
}
