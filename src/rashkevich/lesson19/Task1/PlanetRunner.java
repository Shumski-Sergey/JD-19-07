package rashkevich.lesson19.Task1;

public class PlanetRunner {
    public static void main(String[] args){
        Earth earth=Earth.getInstance();
        Moon moon=Moon.getInstance();
        Sun sun=Sun.getInstance();
        earth.info();
        moon.info();
        sun.info();
    }
}
