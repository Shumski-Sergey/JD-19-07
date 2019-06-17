package Romanovskaya.lesson6.TaskA1;

public class Iron extends Livingroom implements Electricity{

    @Override
    void Work() {
        System.out.println("Утюг работает в собственной комнате");
    }

    @Override
    public void Electricity() {
        System.out.println("Включен в розетку");
    }
}
