package rashkevich.lesson8.Task2;

public class Catalog<T> {
    private T a[];

    public void setList(T a[]){
        this.a=a;
    }

    public void getListFirstFive(){
        if (a.length<5){
            throw new RuntimeException("Array has less then five members");
        }
        for (int i=0; i<5;i++){
            System.out.println(a[i]);
        }

    }
}
