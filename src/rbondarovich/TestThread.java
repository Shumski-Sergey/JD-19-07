package rbondarovich;

public class TestThread {
    public static void main(String[] args) {
        PrintThread one = new PrintThread("thread #1", 1000);
        PrintThread second = new PrintThread("thread #2", 1500);
        one.start();
        second.start();
    }
}
