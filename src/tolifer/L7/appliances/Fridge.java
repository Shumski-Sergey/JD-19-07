package tolifer.L7.appliances;

public class Fridge extends Appliances implements IService {

    private int volume;

    public Fridge(String name, String firm, String model, int price, int volume) {
        super(name, firm, model, price);
        this.volume=volume;
    }

    @Override
    public void plugIn() {
        System.out.println(super.getName()+" " + super.getFirm()+" "+ super.getModel()  +  " включен в розетку");
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "volume=" + volume +
                '}';
    }
}
