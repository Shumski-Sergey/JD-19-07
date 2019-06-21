package src.izhuk.Lesson8.lesson8A1;

public class ClassOfElements {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{1, 2, 3};
        Double[] array2 = new Double[]{4.0, 5.0, 6.0};
        String[] array3 = new String[]{"aa", "bb", "cc"};
        System.out.println(AnyTypeOfElements.getElement(array1, 1));
        System.out.println(AnyTypeOfElements.getElement(array2, 2));
        System.out.println(AnyTypeOfElements.getElement(array3, 2));

    }
}
