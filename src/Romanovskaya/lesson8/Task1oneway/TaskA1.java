package romanovskaya.lesson8.Task1oneway;

public class TaskA1<E> {
    private E[] arr;

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return arr.length;
    }


    public E getArrIndex(int index) {
        return arr[index];
    }

    void print() {
        for (E t : arr) {
            System.out.print(t);
        }
    }
}


