package tolifer.L7.appliances;

public class Phone extends Appliances implements IService{
    private String type;


    public Phone(String name, String firm, String model, int price, String type) {
        super(name, firm, model, price);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void plugIn() {
        System.out.println(super.getName() +" "+ super.getFirm()+ " "+ super.getModel()+ " "+this.getType() + " включен в розетку");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                '}';
    }
}
