package sshumsky.l7;

import sshumsky.l7.model.Dog;
import sshumsky.l7.service.impl.DogServiceImpl;

public class DogStarter {
    public static void main(String[] args) {
        DogServiceImpl dogService = new DogServiceImpl();
        Dog dogFirst = new Dog();
        dogFirst.setName("2");
        Dog dogSecond = new Dog();
        dogSecond.setName("1");
        System.out.print(dogService.fight(dogFirst, dogSecond));
    }
}
