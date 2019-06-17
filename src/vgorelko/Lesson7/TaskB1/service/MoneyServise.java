package vgorelko.Lesson7.TaskB1.service;

public interface MoneyServise  {

        double sum(double num1, double num2); //Сумма
        double sub(double num1, double num2); //Вычитание
        double division(double num1, double num2); //Деление
        double divisionSumForFractionalNumber(double num1, double num2, double num3); //Деление суммы на дробное число
        double multiplicationSumForFractionalNumber(double num1, double num2, double num3); //Деление суммы на дробное число
        boolean compare(double num1, double num2); //Сравнение
}
