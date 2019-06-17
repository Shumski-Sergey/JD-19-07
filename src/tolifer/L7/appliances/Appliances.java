package tolifer.L7.appliances;

public class Appliances {
    private String name;
    private String firm;
    private String model;
    private int price;

    public Appliances(String name, String firm, String model, int price) {
        this.name = name;
        this.firm = firm;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
