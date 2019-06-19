package dmbelov.Lesson7.A1;

class Appliences {
    private String brand;
    private String color;
    private int power;
    private boolean isOn;

    void setBrand(String brand){
        this.brand = brand;
    }
    String getBrand(){
        return brand;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }
    void setPower(int power){
        this.power = power;
    }
    int getPower(){
        return power;
    }
    void setOn(boolean isOn){
        this.isOn = isOn;
    }
    boolean getIsOn(){
        return isOn;
    }
}
