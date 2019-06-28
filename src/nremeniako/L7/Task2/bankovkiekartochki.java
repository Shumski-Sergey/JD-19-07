package nremeniako.L7.Task2;

public class bankovkiekartochki {
    private String name;
    private double procent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProcent() {
        return procent;
    }

    public void setProcent(double procent) {
        this.procent = procent;
    }

    public void snimat(){

       System.out.println("можно снимать деньги с банкомата");

    }
}
