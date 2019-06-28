package vgorelko.Lesson7.TaskA2;

import java.util.HashMap;

public class AppCard {
    public static void main(String[] args) {

        //Для кредитной карточки
        Halva halva = new Halva();
        halva.bankName = "Priorbank";
        halva.nameCard = "Halva";

        System.out.println("Название карточки: " + halva.nameCard);
        System.out.println("Название банка: " + halva.bankName);
        halva.giveCredit();

        System.out.println();

        //Для зарплатной карточки
        ForSalary forSalary = new ForSalary();
        forSalary.bankName = "MTB";
        forSalary.nameCard = "Viza";

        System.out.println("Название карточки: " + forSalary.nameCard);
        System.out.println("Название банка: " + forSalary.bankName);
        forSalary.giveMoney();


    }



}
