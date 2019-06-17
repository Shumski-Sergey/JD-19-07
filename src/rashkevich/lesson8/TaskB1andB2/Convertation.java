package rashkevich.lesson8.TaskB1andB2;

import java.util.Arrays;

public class Convertation<T> {
    private T a[];
    private Object b[];

    public void set(T a[]){
        this.a=a;
    }

    public void convert(){
        if (a.length>0){
            b=a;
        }
    }

    public void print(){
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

    public T getMax(){
        T max=a[0];
        for (int i=0;i<a.length;i++){

            if ((Integer)max<(Integer)a[i]){
                max=a[i];
            }
        }
        return max;
    }

    public T getMin(){
        Arrays.sort(a);
        T min=a[0];
        return min;
    }


}
