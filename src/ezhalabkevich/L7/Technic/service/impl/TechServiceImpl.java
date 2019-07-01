package ezhalabkevich.L7.Technic.service.impl;

import ezhalabkevich.L7.Technic.model.KitchenTech;
import ezhalabkevich.L7.Technic.model.Technics;
import ezhalabkevich.L7.Technic.service.TechService;

public class TechServiceImpl implements TechService {
    public void Socket(KitchenTech tech1, KitchenTech tech2){
        //если техника подходит по параметрам, то ее включают в розетку, чтобы проверить!
        if(getBetterOne(tech1)>getBetterOne(tech2)){
            System.out.println("Лучший по параметрам "+tech1.getName());
            System.out.println("Включен в розетку!");

        }else {
            System.out.println("Лучший по параметрам"+tech2.getName());
            System.out.println("Включен в розетку!");
        }

    }

    public double getBetterOne(KitchenTech tech1){
        double result;

        result=tech1.getWeight()*0.3+tech1.getPrice()*0.6+tech1.getPower()*0.4;

        return result;}
}
