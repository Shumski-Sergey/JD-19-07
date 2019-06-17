package Romanovskaya.lesson6.TaskA2;

public class Gold extends Visa {
     private int procent;
     public Gold(Integer procent){
         this.procent = procent;
     }


    @Override
    void giveCash(String name) {
        System.out.println("Карта"+" " + name + "берет комиссию за обслуживание" + " " + procent+"%" );
    }
}
