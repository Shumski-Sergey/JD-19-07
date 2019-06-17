package sshumsky.l7.service.impl;

import sshumsky.l7.model.Dog;
import sshumsky.l7.service.DogService;

import java.util.Objects;

public class DogServiceImpl implements DogService {
    @Override
    public String fight(Dog first, Dog second) {
        if (!Objects.isNull(first) && !Objects.isNull(second)) {
            double chanceFirstDog = getResultChance(first);
            double chanceSecondDog = getResultChance(second);
            return chanceFirstDog > chanceSecondDog ? first.getName() : second.getName();
        }
        return "Одна или две собаки отказались драться!";
    }

    private double getResultChance(Dog dog) {
        return 0.2 * dog.getAge() + 0.3 * dog.getWight() + 0.5 * dog.getPower();
    }
}
