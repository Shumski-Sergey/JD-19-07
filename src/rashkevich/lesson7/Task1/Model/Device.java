package rashkevich.lesson7.Task1.Model;

public abstract class Device {
    public Device(String name) {
        this.name = name;
    }

    private String name;
    public abstract void turnOn();
}
