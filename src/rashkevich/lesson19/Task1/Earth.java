package rashkevich.lesson19.Task1;

public class Earth implements Planet{
    private Earth() {}
    private static class SingletonHolder { // nested class
        private final static Earth INSTANCE = new Earth();
    }
    public static Earth getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public void info() {
        System.out.println("This is the Earth, it is a planet of humanity");
    }
}
