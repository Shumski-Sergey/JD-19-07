package lpojarov.L8.a1;

public class MyArray<E> {
    E[]arr;
    public E getArrIndex(int i){
        return arr[i];
    }
    public void setArr(E[]arr){
        this.arr=arr;
    }
    public
    int getLength(){
        return arr.length;
    }
}
