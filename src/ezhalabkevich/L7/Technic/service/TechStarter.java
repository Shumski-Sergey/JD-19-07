package ezhalabkevich.L7.Technic.service;

import ezhalabkevich.L7.Technic.model.KitchenTech;
import ezhalabkevich.L7.Technic.service.impl.TechServiceImpl;

import java.net.Socket;



public class TechStarter {
    public static void main(String[] args) {
        TechServiceImpl techService = new TechServiceImpl();
        KitchenTech fridge = new KitchenTech();
        fridge.setWeight(73.6);
        fridge.setPrice(698.7);
        fridge.setName("Холодильник");

        KitchenTech toster = new KitchenTech();
        toster.setWeight(0.750);
        toster.setPrice(65.5);
        toster.setName("Тостер");

        techService.Socket(fridge,toster);
    }
}
