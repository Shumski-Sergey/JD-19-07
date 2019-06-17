package nremeniako.L7.Task2;

public class Mastercard extends bankovkiekartochki {
    public void komissia(){

        System.out.println("самая низкая комиссия");
}

    @Override
    public void snimat() {
        System.out.println("временно деньги снимать нельзя");
    }
}

