package rashkevich.lesson19.Task2;

public class TeaMakerImpl implements DrinkMaker{
    @Override
    public Cup choosCup() {
        return new CupTeaImpl();
    }

    @Override
    public void putIngridients() {
        System.out.println("TeeMaker puts tea ingridients");
    }

    @Override
    public void fillLiquid() {
        System.out.println("TeeMaker fills tea with a hot liquid");
    }
}
