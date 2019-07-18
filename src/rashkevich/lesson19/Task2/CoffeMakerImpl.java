package rashkevich.lesson19.Task2;

public class CoffeMakerImpl implements DrinkMaker{
    @Override
    public Cup choosCup() {
        return new CupCoffeImpl();
    }

    @Override
    public void putIngridients() {
        System.out.println("CoffeeMaker puts coffee in the cup");
    }

    @Override
    public void fillLiquid() {
        System.out.println("CoffeeMaker fills coffee with a hot liquid");
    }
}
