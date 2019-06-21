package src.izhuk.Lesson8.lesson8A1;


public class AnyTypeOfElements extends GenericArray{
    public static <T> Object getElement(T[] a, int num) {
        GenericArray list = new GenericArray();
        list.setArray(a);
        return list.getArray(num);
    }

}
