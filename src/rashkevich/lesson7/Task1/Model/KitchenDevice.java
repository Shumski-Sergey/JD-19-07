package rashkevich.lesson7.Task1.Model;

public abstract class KitchenDevice extends Device{
    public KitchenDevice(String name) {
        super(name);
    }

    public abstract void turnOn();
}
