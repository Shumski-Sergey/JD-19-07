package nremeniako.L7.Task1;

public class Main {
    public static void main(String args[]){
        televizor tlvz=new televizor("Sony");
        conditioner cond=new conditioner("mitsubishi");

        tlvz.vkluchit();
        cond.vkluchit("не включать");

    }
}
