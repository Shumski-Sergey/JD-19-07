package rashkevich.lesson16.Task1v2;

public class Book {
    private int id;
    private boolean isCanTakeHome;

    public Book(int id, boolean isCanTakeHome) {
        this.id = id;
        this.isCanTakeHome = isCanTakeHome;
    }

    public int getId() {
        return id;
    }

    public boolean isCanTakeHome() {
        return isCanTakeHome;
    }
}
