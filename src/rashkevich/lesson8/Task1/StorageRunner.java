package rashkevich.lesson8.Task1;

public class StorageRunner {

    public static void main(String[] ey){
        Integer a[]={1,3,5,6,8};
        Storage<Integer> st=new Storage<Integer>();
        st.setArray(a);
        System.out.println(st.getArray(2));
    }

}
