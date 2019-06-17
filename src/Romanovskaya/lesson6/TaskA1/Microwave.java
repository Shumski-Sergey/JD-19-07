package Romanovskaya.lesson6.TaskA1;

public class Microwave extends Kitchen implements Electricity{

    @Override
    void Work() {
        System.out.println("Микроволновка работает на кухне");
    }

    @Override
    public void Electricity() {
        System.out.println("Включен в розетку");
    }
}
