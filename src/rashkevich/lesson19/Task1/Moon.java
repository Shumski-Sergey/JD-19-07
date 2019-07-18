package rashkevich.lesson19.Task1;

public class Moon implements Planet{
    private Moon() {}
    private static class SingletonHolder { // nested class
        private final static Moon INSTANCE = new Moon();
    }
    public static Moon getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public void info() {
        System.out.println("This is the Moon, it is a satellite of the Earth");
    }
}
