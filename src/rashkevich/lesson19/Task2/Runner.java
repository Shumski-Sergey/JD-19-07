package rashkevich.lesson19.Task2;

public class Runner {
    public static void main(String[] args){
        Client client=new Client();
        client.setDrinkMaker(new TeaMakerImpl());
        client.makeDrink();

        Client anotherClient=new Client();
        anotherClient.setDrinkMaker(new CoffeMakerImpl());
        anotherClient.makeDrink();
    }
}
