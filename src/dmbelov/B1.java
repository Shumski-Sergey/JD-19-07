package dmbelov;

public class B1 {
    public static void main(String[] args) {

        int randomNumber = (int) ((Math.random()+4)* 31);
        String statement = randomNumber >= 25 && randomNumber <= 100 ?
                randomNumber + " Число попало в интервал [25;100]" :
                randomNumber + " Число НЕ попало в интервал [25;100]";

        System.out.println(statement);
    }
}
