package rashkevich.lesson19.Task1;

public class Sun implements Planet{
    private Sun() {}
    private static class SingletonHolder { // nested class
        private final static Sun INSTANCE = new Sun();
    }
    public static Sun getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public void info() {
        System.out.println("This is the Sun");
    }
}
