package dmbelov;

public class B1 {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random()*151+5);
        String statement = randomNumber >= 25 && randomNumber <= 100 ?
                randomNumber + " The number is in interval [25;100]" :
                randomNumber + " The number is not in interval [25;100]";

        System.out.println(statement);
    }
}
