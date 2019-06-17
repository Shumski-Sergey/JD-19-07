package vgorelko.Lesson7.TaskA1;

import java.util.Random;

public class AppTech {

    public static void main(String[] args) {
        //Мы включили радио с характеристиками
        Radio radio = new Radio();
        radio.setColor("зеленный");
        radio.setModel("радиола");
        radio.setForGames(false);
        radio.setForMusic(true);

        System.out.println("Цвет: " + radio.getColor());
        System.out.println("Модель: " + radio.getModel());
        System.out.println("Для игр: " + radio.isForGames());
        System.out.println("Для прослушивания музыки: " + radio.isForMusic());
        radio.turnOn();
        System.out.println();

        //Мы включили приставку с характеристиками
        Playstation4 playstation4 = new Playstation4();
        playstation4.setColor("черный");
        playstation4.setModel("Four");
        playstation4.setForGames(true);
        playstation4.setForMusic(false);

        System.out.println("Цвет: " + playstation4.getColor());
        System.out.println("Модель: " + playstation4.getModel());
        System.out.println("Для игр: " + playstation4.isForGames());
        System.out.println("Для прослушивания музыки: " + playstation4.isForMusic());
        playstation4.turnOn();
        System.out.println();

        //Мы включили холодильник с характеристиками
        Fridge fridge = new Fridge();
        fridge.setColor("черный");
        fridge.setModel("Минск");
        fridge.setCookingFood(false);
        fridge.setFoodStorage(true);

        System.out.println("Цвет: " + fridge.getColor());
        System.out.println("Модель: " + fridge.getModel());
        System.out.println("Для готовки еды: " + fridge.isCookingFood());
        System.out.println("Для хранения еды: " + fridge.isFoodStorage());
        fridge.turnOn();

    }

}
