package src.izhuk.Lesson7.lesson7A1;

public abstract class Appliance {
    private String name;
    private String brandName;
    private String model;



    public abstract void TurnedOn();

    public Appliance(String name, String brandName, String model) {
        this.name = name;
        this.brandName = brandName;
        this.model = model;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


