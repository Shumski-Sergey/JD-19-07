package tolifer.L8;



public class TaskA1 <T> {
    public static void main (String [] args){
        Object [] array = new Object [] {"hi", 145, 986.345, "cat"};

        int index = 1;

        System.out.println(TaskA1.returnElement(array, index));

    }

    static Object returnElement(Object [] array, int i){
        return array[i];

    }
}
