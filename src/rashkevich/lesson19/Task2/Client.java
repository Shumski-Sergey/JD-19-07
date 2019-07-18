package rashkevich.lesson19.Task2;

public class Client {
    private Cup cup;
    private DrinkMaker drinkMaker;

    public void setDrinkMaker(DrinkMaker drinkMaker){
        this.drinkMaker=drinkMaker;
    }

    public void makeDrink(){
        this.cup=drinkMaker.choosCup();
        cup.info();
        drinkMaker.putIngridients();
        drinkMaker.fillLiquid();
    }
}
