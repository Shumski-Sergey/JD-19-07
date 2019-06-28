package src.izhuk.Lesson8.lesson8A1;

public class GenericArray <T> {
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getArray(int id) {
        return array[id];
    }

}
