package rashkevich.lesson8.Task1;

public class Storage<T> {
    private T array[];

    public void setArray(T array[]){
        this.array=array;
    }

    public T getArray(int i){
        if ((i<0)||(i>(array.length-1))){
            throw new RuntimeException("Unexpected array index");
        }
        return array[i];
    }

}
